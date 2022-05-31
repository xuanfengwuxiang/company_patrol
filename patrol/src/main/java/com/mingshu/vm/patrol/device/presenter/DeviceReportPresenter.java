package com.mingshu.vm.patrol.device.presenter;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mingshu.vm.patrol.constant.HttpConstant;
import com.mingshu.vm.patrol.constant.SpConstant;
import com.mingshu.vm.patrol.databinding.ActivityPatrolRecordBinding;
import com.mingshu.vm.patrol.device.view.DeviceReportView;
import com.mingshu.vm.patrol.http.request.DeviceReportRequest;
import com.mingshu.vm.patrol.http.response.DeviceStandardResponse;
import com.xuanfeng.xflibrary.http.HttpResponse;
import com.xuanfeng.xflibrary.http.httpmgr.HttpManager;
import com.xuanfeng.xflibrary.mvp.BasePresenter;
import com.xuanfeng.xflibrary.utils.SpManager;
import com.xuanfeng.xflibrary.utils.ToastUtil;

/**
 * 设备巡检上报P
 */
public class DeviceReportPresenter implements BasePresenter<DeviceReportView> {
    DeviceReportView mView;

    @Override
    public void attachView(DeviceReportView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    /**
     * 上报设备情况
     */
    public void submitDevice(ActivityPatrolRecordBinding binding) {
        if (binding == null) {
            return;
        }

        DeviceReportRequest request = new DeviceReportRequest();
        request.setDeviceid(binding.getDeviceid());
        request.setValue(binding.etSafe.getText().toString());
        request.setLocation(binding.etLocation.getText().toString());
        request.setDamage(binding.etOiling.getText().toString());
        request.setUserid(SpManager.getInstance((Context) mView).getString(SpConstant.SP_USER_ID, "001"));


        String url = HttpConstant.BASE_URL + HttpConstant.SUBMIT_DEVICE;
        mView.showProgress();
        HttpManager.getInstance().postJson(url, request, new HttpResponse<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                mView.hideProgress();
                DeviceStandardResponse response = new Gson().fromJson(jsonObject, DeviceStandardResponse.class);
                if (response.getCode() != 200) {
                    ToastUtil.showToast((Context) mView, response.getMsg());
                    return;
                }

                mView.onSubmitSuccess();
            }

            @Override
            public void onError(Throwable e) {
                mView.hideProgress();
                mView.onSubmitError(e.toString());
            }

            @Override
            public void onComplete() {

            }
        });
    }
}