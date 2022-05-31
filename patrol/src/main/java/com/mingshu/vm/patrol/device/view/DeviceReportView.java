package com.mingshu.vm.patrol.device.view;

import com.xuanfeng.xflibrary.mvp.BaseView;

/**
 * 设备巡检上报View
 */
public interface DeviceReportView extends BaseView {
    void onSubmitSuccess();

    void onSubmitError(String msg);
}
