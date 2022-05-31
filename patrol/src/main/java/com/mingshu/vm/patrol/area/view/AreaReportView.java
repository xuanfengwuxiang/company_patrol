package com.mingshu.vm.patrol.area.view;

import com.xuanfeng.xflibrary.mvp.BaseView;

/**
 * 区域巡检上报View
 */
public interface AreaReportView extends BaseView {
    void onSubmitSuccess();

    void onSubmitError(String msg);
}
