package com.mingshu.vm.patrol.mine.presenter

import com.mingshu.vm.patrol.mine.view.MineView
import com.xuanfeng.xflibrary.mvp.BasePresenter

class MinePresenter :BasePresenter<MineView> {
    lateinit var mView :MineView
    override fun attachView(v: MineView?) {
        mView = v as MineView
    }

    override fun detachView() {

    }
}