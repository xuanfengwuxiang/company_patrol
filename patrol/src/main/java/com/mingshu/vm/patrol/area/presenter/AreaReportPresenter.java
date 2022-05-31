package com.mingshu.vm.patrol.area.presenter;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mingshu.vm.patrol.area.view.AreaReportView;
import com.mingshu.vm.patrol.constant.HttpConstant;
import com.mingshu.vm.patrol.constant.SpConstant;
import com.mingshu.vm.patrol.databinding.ActivityAreaReportBinding;
import com.mingshu.vm.patrol.http.request.AreaReportRequest;
import com.mingshu.vm.patrol.http.response.AreaStandardResponse;
import com.xuanfeng.xflibrary.http.HttpResponse;
import com.xuanfeng.xflibrary.http.httpmgr.HttpManager;
import com.xuanfeng.xflibrary.mvp.BasePresenter;
import com.xuanfeng.xflibrary.utils.SpManager;
import com.xuanfeng.xflibrary.utils.ToastUtil;

import java.util.LinkedHashMap;

/**
 * 区域巡检上报P
 */
public class AreaReportPresenter implements BasePresenter<AreaReportView> {
    AreaReportView mView;

    @Override
    public void attachView(AreaReportView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    /**
     * 上报区域情况
     */
    public void submitArea(ActivityAreaReportBinding binding) {
        if (binding == null) {
            return;
        }

        AreaReportRequest request = new AreaReportRequest();
        request.setAreaid(binding.getAreaId());
        request.setHealth(binding.etHealth.getText().toString());
        request.setSafety(binding.etSafe.getText().toString());
        request.setRoomtemp(binding.etTemp.getText().toString());
        request.setUserid(SpManager.getInstance((Context) mView).getString(SpConstant.SP_USER_ID, "001"));


        String url = HttpConstant.BASE_URL + HttpConstant.SUBMIT_AREA;
        mView.showProgress();
        HttpManager.getInstance().postJson(url, request, new HttpResponse<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                mView.hideProgress();
                AreaStandardResponse response = new Gson().fromJson(jsonObject, AreaStandardResponse.class);
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
