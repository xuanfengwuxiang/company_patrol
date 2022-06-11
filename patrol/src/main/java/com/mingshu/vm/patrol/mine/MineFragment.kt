package com.mingshu.vm.patrol.mine

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.mingshu.vm.patrol.R
import com.mingshu.vm.patrol.databinding.FragmentMineBinding
import com.mingshu.vm.patrol.login.PatrolLoginActivity
import com.mingshu.vm.patrol.mine.presenter.MinePresenter
import com.mingshu.vm.patrol.mine.view.MineView
import com.xuanfeng.xflibrary.mvp.BaseFragment
import com.xuanfeng.xflibrary.mvp.BasePresenter
import com.xuanfeng.xflibrary.widget.BottomDialog
import com.xuanfeng.xflibrary.widget.BottomRecyclerView


/**
 * 我的界面
 */
class MineFragment : BaseFragment<MinePresenter, FragmentMineBinding>(), View.OnClickListener,MineView {
    override fun getLayoutId(): Int {
        return R.layout.fragment_mine
    }

    override fun initPresenter(): BasePresenter<*> {
        return MinePresenter();
    }

    override fun initData(bundle: Bundle?) {
        mBinding.fragment = this
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.tv_logout) {

            var dialog = BottomDialog(context as Context)
            var list = ArrayList<String>()
            list.add("确定")
            dialog.setData(list) {
                if (it == 0) {
                    activity?.finish();
                    startActivity(Intent(context, PatrolLoginActivity::class.java))
                }
            }
            dialog.show()
        }
    }

}