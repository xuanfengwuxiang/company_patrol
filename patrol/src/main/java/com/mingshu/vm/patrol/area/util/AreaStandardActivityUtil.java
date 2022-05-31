package com.mingshu.vm.patrol.area.util;

import com.mingshu.vm.patrol.http.response.AreaDeviceStandard;

import java.util.List;

/**
 * 区域规范工具
 */
public class AreaStandardActivityUtil {
    public static final String TAG = "AreaStandardActivityUtil";

    // 获取规范内容
    public static String getContent(List<AreaDeviceStandard.Standard> list) {
        if (list == null || list.isEmpty()) return "";
        return list.get(0).getContent().replace(";","\n");
    }
}
