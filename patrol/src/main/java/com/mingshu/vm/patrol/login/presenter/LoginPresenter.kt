package com.mingshu.vm.patrol.login.presenter

import android.content.Context
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.mingshu.vm.patrol.R
import com.mingshu.vm.patrol.constant.HttpConstant
import com.mingshu.vm.patrol.constant.SpConstant
import com.mingshu.vm.patrol.databinding.ActivityPatrolLoginBinding
import com.mingshu.vm.patrol.http.request.LoginRequest
import com.mingshu.vm.patrol.http.response.LoginResponse
import com.mingshu.vm.patrol.login.view.LoginView
import com.xuanfeng.xflibrary.http.HttpResponse
import com.xuanfeng.xflibrary.http.httpmgr.HttpManager
import com.xuanfeng.xflibrary.mvp.BasePresenter
import com.xuanfeng.xflibrary.utils.SpManager
import com.xuanfeng.xflibrary.utils.StringUtils
import com.xuanfeng.xflibrary.utils.ToastUtil

/**
 * 设备巡检上报P
 */
class LoginPresenter : BasePresenter<LoginView?> {
    var mView: LoginView? = null
    override fun attachView(view: LoginView?) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    /**
     * 登录接口
     * admin admin123 app
     */
    fun login(binding: ActivityPatrolLoginBinding) {
        if (StringUtils.isEmpty(binding.etUser.text.toString())) {
            ToastUtil.showToast(mView as Context?, (mView as Context).resources.getString(R.string.please_input_username))
            return
        }
        if (StringUtils.isEmpty(binding.etPassword.text.toString())) {
            ToastUtil.showToast(mView as Context?, (mView as Context).resources.getString(R.string.please_input_password))
            return
        }

        val request = LoginRequest()
        request.username = binding.etUser.text.toString()
        request.password = binding.etPassword.text.toString()
        request.type = "app"
        (mView as LoginView).showProgress()
        HttpManager.getInstance().postJson(HttpConstant.BASE_URL + HttpConstant.LOGIN, request, object : HttpResponse<JsonObject?> {
            override fun onSuccess(jsonObject: JsonObject?) {
                (mView as LoginView).hideProgress()
                val loginResponse = Gson().fromJson(jsonObject, LoginResponse::class.java)
                if (loginResponse != null && loginResponse.code != 200) {
                    ToastUtil.showToast(mView as Context, loginResponse.msg)
                    return;
                }
                SpManager.getInstance(mView as Context?).setString(SpConstant.SP_USER_ID, loginResponse.userId)
                SpManager.getInstance(mView as Context).setString(SpConstant.SP_USER_NAME, request.username)
                SpManager.getInstance(mView as Context).setString(SpConstant.SP_PASSWORD, request.password)
                (mView as LoginView).onSubmitSuccess()
                ToastUtil.showToast(mView as Context,(mView as Context).resources.getString(R.string.login_success))
            }

            override fun onError(e: Throwable) {
                (mView as LoginView).hideProgress()
            }
            override fun onComplete() {}
        })
    }
}