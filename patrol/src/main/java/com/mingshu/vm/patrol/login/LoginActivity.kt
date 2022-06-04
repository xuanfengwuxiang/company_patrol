package com.mingshu.vm.patrol.login

import android.os.Bundle
import android.view.View
import com.mingshu.vm.patrol.R
import com.mingshu.vm.patrol.databinding.ActivityLoginBinding
import com.mingshu.vm.patrol.login.presenter.LoginPresenter
import com.mingshu.vm.patrol.login.view.LoginView
import com.xuanfeng.xflibrary.mvp.BaseActivity
import com.xuanfeng.xflibrary.mvp.BasePresenter

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
        // do nothing
    }

    override fun getStatusBarColorResId(): Int {
        return  R.color.baseThemeColor
    }

    override fun onSubmitSuccess() {
        TODO("Not yet implemented")
    }

    override fun onSubmitError(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}