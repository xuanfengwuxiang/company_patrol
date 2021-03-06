package com.mingshu.vm.patrol.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.mingshu.vm.patrol.R
import com.mingshu.vm.patrol.constant.SpConstant
import com.mingshu.vm.patrol.databinding.ActivityPatrolLoginBinding
import com.mingshu.vm.patrol.databinding.ActivityPatrolMainBinding
import com.mingshu.vm.patrol.http.response.UserInfoResponse
import com.mingshu.vm.patrol.login.presenter.LoginPresenter
import com.mingshu.vm.patrol.login.view.LoginView
import com.xuanfeng.xflibrary.mvp.BaseActivity
import com.xuanfeng.xflibrary.mvp.BasePresenter
import com.xuanfeng.xflibrary.utils.SpManager

/**
 * 登录界面
 */
class PatrolLoginActivity : BaseActivity<LoginPresenter,ActivityPatrolLoginBinding >(), View.OnClickListener,LoginView {
    companion object{
        val VIDEO_USER_NAME = "video_user_name"
        val VIDEO_PASSWORD = "video_password"
    }
    override fun getLayoutId(): Int {
        return R.layout.activity_patrol_login
    }

    override fun initPresenter(): BasePresenter<*> {
        return LoginPresenter();
    }

    override fun initData(bundle: Bundle?) {
        mBinding.activity = this
        mBinding.userName = SpManager.getInstance(this).getString(SpConstant.SP_USER_NAME,"")
        mBinding.password = SpManager.getInstance(this).getString(SpConstant.SP_PASSWORD,"")
    }

    override fun getStatusBarColorResId(): Int {
        return  R.color.baseThemeColor
    }

    override fun onSubmitSuccess() {
        mPresenter.getUserInfo(mBinding.etUser.text.toString())
    }

    override fun onSubmitError(msg: String?) {
        // do nothing
    }

    override fun onGetUserInfo(userInfo: UserInfoResponse.UserInfo?) {
        val intent = Intent(resources.getString(R.string.demo_login_action))
        intent.putExtra(VIDEO_USER_NAME,userInfo?.videoUserName)
        intent.putExtra(VIDEO_PASSWORD,userInfo?.videoPassword)
        startActivity(intent)
        finish()
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.bt_commit)mPresenter.login(mBinding)
    }

}