package com.mingshu.vm.patrol.http.request;

/**
 * 区域巡检上报
 */
public class AreaReportRequest {
    // 区域id
    String areaid;
    // 卫生情况
    String health;
    // 室温
    String roomtemp;
    // 安全情况
    String safety;
    // 用户id
    String userid;

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getRoomtemp() {
        return roomtemp;
    }

    public void setRoomtemp(String roomtemp) {
        this.roomtemp = roomtemp;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
