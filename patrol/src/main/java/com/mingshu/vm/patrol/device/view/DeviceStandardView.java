package com.mingshu.vm.patrol.device.view;

import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;
import com.xuanfeng.xflibrary.mvp.BaseView;

import java.util.List;

/**
 * 设备规范View
 */
public interface DeviceStandardView extends BaseView {
    void onGetStandardSuccess(List<AreaDeviceStandard.Standard> list);

    void onGetStandardError(String msg);
}
