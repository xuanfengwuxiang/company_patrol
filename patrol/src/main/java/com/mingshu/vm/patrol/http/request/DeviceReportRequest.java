package com.mingshu.vm.patrol.http.request;

/**
 * 区域巡检上报
 */
public class DeviceReportRequest {
    // 区域id
    String deviceid;
    // 卫生情况
    String damage;
    // 室温
    String location;
    // 安全情况
    String value;
    // 用户id
    String userid;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
