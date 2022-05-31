package com.mingshu.vm.patrol.area.activity;

import android.os.Bundle;
import android.view.View;

import com.mingshu.vm.patrol.R;
import com.mingshu.vm.patrol.area.presenter.AreaReportPresenter;
import com.mingshu.vm.patrol.area.view.AreaReportView;
import com.mingshu.vm.patrol.databinding.ActivityAreaReportBinding;
import com.xuanfeng.xflibrary.mvp.BaseActivity;
import com.xuanfeng.xflibrary.utils.ToastUtil;

/**
 * 区域巡检 上报界面
 */
public class AreaReportActivity extends BaseActivity<AreaReportPresenter, ActivityAreaReportBinding> implements View.OnClickListener, AreaReportView {


    @Override
    public int getLayoutId() {
        return R.layout.activity_area_report;
    }

    @Override
    public AreaReportPresenter initPresenter() {
        return new AreaReportPresenter();
    }

    @Override
    public void initData(Bundle bundle) {
        mBinding.setActivity(this);
        mBinding.setAreaId(getIntent().getStringExtra(AreaStandardActivity.AREA_ID));
    }

    @Override
    public int getStatusBarColorResId() {
        return 0;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_commit) {
            ToastUtil.showToast(this, "提交服务器");
            mPresenter.submitArea(mBinding);
        }else if (id == R.id.tv_back || id == R.id.iv_back) {
            finish();
        }
    }

    @Override
    public void onSubmitSuccess() {
        ToastUtil.showToast(this, "提交成功");
        finish();
    }

    @Override
    public void onSubmitError(String msg) {
        ToastUtil.showToast(this, "提交失败");
    }
}