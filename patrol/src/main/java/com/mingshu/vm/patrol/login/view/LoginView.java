package com.mingshu.vm.patrol.login.view;

import com.xuanfeng.xflibrary.mvp.BaseView;

/**
 * 设备巡检上报View
 */
public interface LoginView extends BaseView {
    void onSubmitSuccess();

    void onSubmitError(String msg);
}
