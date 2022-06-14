package com.mingshu.vm.patrol.constant;

/**
 * http相关常量
 */
public class HttpConstant {
    // base url
    public static final String BASE_URL = "http://139.196.88.41:9025";

    //登录
    public static final String LOGIN = "/login";

    //区域规范接口
    public static final String AREA_STANDARD = "/areainspection/id";

    //上报 设备巡检情况
    public static final String SUBMIT_AREA = "/areainspection/applyadd";

    //设备规范接口
    public static final String SUBMIT_DEVICE = "/deviceinspection/applyadd";

    // 区域/设备 规范查询
    public static final String AREA_DEVICE_STANDARD = "/qrcode/querystandard";

    // 查询用户信息
    public static final String QUERY_USER_INFO = "/system/user/select";
}
