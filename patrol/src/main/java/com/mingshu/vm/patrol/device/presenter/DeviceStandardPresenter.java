package com.mingshu.vm.patrol.device.presenter;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mingshu.vm.patrol.constant.HttpConstant;
import com.mingshu.vm.patrol.device.view.DeviceStandardView;
import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;
import com.xuanfeng.xflibrary.http.HttpResponse;
import com.xuanfeng.xflibrary.http.httpmgr.HttpManager;
import com.xuanfeng.xflibrary.mvp.BasePresenter;
import com.xuanfeng.xflibrary.utils.ToastUtil;

import java.util.LinkedHashMap;

/**
 * 设备规范P
 */
public class DeviceStandardPresenter implements BasePresenter<DeviceStandardView> {
    DeviceStandardView mView;

    @Override
    public void attachView(DeviceStandardView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    /**
     * 获取设备规范
     */
    public void getDeviceStandard(String deviceId) {

        String url = HttpConstant.BASE_URL + HttpConstant.AREA_DEVICE_STANDARD;
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        params.put("id", deviceId);
        params.put("type", "2");

        mView.showProgress();
        HttpManager.getInstance().postJO(url, params, new HttpResponse<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                mView.hideProgress();
                AreaDeviceStandard response = new Gson().fromJson(jsonObject, AreaDeviceStandard.class);
                if (response.getCode() != 200) {
                    ToastUtil.showToast((Context) mView, response.getMsg());
                    return;
                }
                if (response.getData() == null) {
                    ToastUtil.showToast((Context) mView, "暂无本区域的规范");
                    return;
                }

                mView.onGetStandardSuccess(response.getData());
            }

            @Override
            public void onError(Throwable e) {
                mView.hideProgress();
                mView.onGetStandardError(e.toString());
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
