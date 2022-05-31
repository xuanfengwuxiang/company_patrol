package com.mingshu.vm.patrol.area.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mingshu.vm.patrol.R;
import com.mingshu.vm.patrol.area.presenter.AreaStandardPresenter;
import com.mingshu.vm.patrol.area.util.AreaStandardActivityUtil;
import com.mingshu.vm.patrol.area.view.AreaStandardView;
import com.mingshu.vm.patrol.databinding.ActivityAreaStandBinding;
import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;
import com.xuanfeng.xflibrary.mvp.BaseActivity;

import java.util.List;

/**
 * 区域规范界面
 */
public class AreaStandardActivity extends BaseActivity<AreaStandardPresenter, ActivityAreaStandBinding> implements View.OnClickListener, AreaStandardView {

    public static final String AREA_ID = "area_id";

    @Override
    public int getLayoutId() {
        return R.layout.activity_area_stand;
    }

    @Override
    public AreaStandardPresenter initPresenter() {
        return new AreaStandardPresenter();
    }

    @Override
    public void initData(Bundle bundle) {
        mBinding.setActivity(this);
        mBinding.setAreaId(getIntent().getStringExtra(AREA_ID));
        mPresenter.getAreaStandard(mBinding.getAreaId());
    }

    @Override
    public int getStatusBarColorResId() {
        return 0;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_start_patrol) {
            startActivity(new Intent(this, AreaReportActivity.class));
        } else if (id == R.id.tv_back || id == R.id.iv_back) {
            finish();
        }
    }

    @Override
    public void onGetStandardSuccess(List<AreaDeviceStandard.Standard> list) {
        mBinding.setAreaStandard("区域id：" + mBinding.getAreaId() + "\n" + AreaStandardActivityUtil.getContent(list));
    }

    @Override
    public void onGetStandardError(String msg) {

    }
}