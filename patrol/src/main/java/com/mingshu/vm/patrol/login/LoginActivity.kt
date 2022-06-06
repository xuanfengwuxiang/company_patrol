package com.mingshu.vm.patrol.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.mingshu.vm.patrol.R
import com.mingshu.vm.patrol.constant.SpConstant
import com.mingshu.vm.patrol.databinding.ActivityLoginBinding
import com.mingshu.vm.patrol.login.presenter.LoginPresenter
import com.mingshu.vm.patrol.login.view.LoginView
import com.xuanfeng.xflibrary.mvp.BaseActivity
import com.xuanfeng.xflibrary.mvp.BasePresenter
import com.xuanfeng.xflibrary.utils.SpManager

/**
 * 登录界面
 */
class LoginActivity : BaseActivity<LoginPresenter, ActivityLoginBinding>(), View.OnClickListener,LoginView {
    override fun getLayoutId(): Int {
        return R.layout.activity_login
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
        finish()
        startActivity(Intent(resources.getString(R.string.demo_action)))
    }

    override fun onSubmitError(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.bt_commit)mPresenter.login(mBinding)
    }

}