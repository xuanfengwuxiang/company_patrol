package com.mingshu.vm.patrol.device;

import android.os.Bundle;
import android.view.View;

import com.mingshu.vm.patrol.R;
import com.mingshu.vm.patrol.databinding.ActivityPatrolRecordBinding;
import com.mingshu.vm.patrol.device.presenter.DeviceReportPresenter;
import com.mingshu.vm.patrol.device.view.DeviceReportView;
import com.xuanfeng.xflibrary.mvp.BaseActivity;

/**
 * 仪器巡检 提交界面
 */
public class DeviceReportActivity extends BaseActivity<DeviceReportPresenter, ActivityPatrolRecordBinding> implements View.OnClickListener, DeviceReportView {


    @Override
    public int getLayoutId() {
        return R.layout.activity_patrol_record;
    }

    @Override
    public DeviceReportPresenter initPresenter() {
        return new DeviceReportPresenter();
    }

    @Override
    public void initData(Bundle bundle) {
        mBinding.setActivity(this);
        mBinding.setDeviceid(getIntent().getStringExtra(DeviceInfoActivity.DEVICE_ID));
    }

    @Override
    public int getStatusBarColorResId() {
        return 0;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_commit) {
            mPresenter.submitDevice(mBinding);
        } else if (id == R.id.bt_take_photo) {
            DeviceReportActivityUtil.takePhoto(this);
        }
    }

    @Override
    public void onSubmitSuccess() {

    }

    @Override
    public void onSubmitError(String msg) {

    }
}