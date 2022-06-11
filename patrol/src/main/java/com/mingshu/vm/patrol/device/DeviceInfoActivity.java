package com.mingshu.vm.patrol.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mingshu.vm.patrol.R;
import com.mingshu.vm.patrol.area.util.AreaStandardActivityUtil;
import com.mingshu.vm.patrol.databinding.ActivityDeviceInfoBinding;
import com.mingshu.vm.patrol.device.presenter.DeviceStandardPresenter;
import com.mingshu.vm.patrol.device.view.DeviceStandardView;
import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;
import com.mingshu.vm.patrol.login.PatrolLoginActivity;
import com.xuanfeng.xflibrary.mvp.BaseActivity;

import java.util.List;

/**
 * 设备信息界面
 */
public class DeviceInfoActivity extends BaseActivity<DeviceStandardPresenter, ActivityDeviceInfoBinding> implements View.OnClickListener, DeviceStandardView {

    public static final String DEVICE_ID = "device_id";

    @Override
    public int getLayoutId() {
        return R.layout.activity_device_info;
    }

    @Override
    public DeviceStandardPresenter initPresenter() {
        return new DeviceStandardPresenter();
    }

    @Override
    public void initData(Bundle bundle) {
        mBinding.setActivity(this);
        mBinding.setDeviceId(getIntent().getStringExtra(DEVICE_ID));
        mPresenter.getDeviceStandard(mBinding.getDeviceId());
    }

    @Override
    public int getStatusBarColorResId() {
        return 0;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_start_patrol) {
            startActivity(new Intent(this, DeviceReportActivity.class));
        }else if(id == R.id.bt_urgency_call){
            startActivity(new Intent(getResources().getString(R.string.demo_action)));
        }
    }

    @Override
    public void onGetStandardSuccess(List<AreaDeviceStandard.Standard> list) {
        mBinding.setDeviceStandard("设备id：" + mBinding.getDeviceId() + "\n" + AreaStandardActivityUtil.getContent(list));
    }

    @Override
    public void onGetStandardError(String msg) {

    }
}