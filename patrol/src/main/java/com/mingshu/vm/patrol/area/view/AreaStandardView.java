package com.mingshu.vm.patrol.area.view;

import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;
import com.xuanfeng.xflibrary.mvp.BaseView;

import java.util.List;

/**
 * 区域规范View
 */
public interface AreaStandardView extends BaseView {
    void onGetStandardSuccess(List<AreaDeviceStandard.Standard> list);

    void onGetStandardError(String msg);
}
