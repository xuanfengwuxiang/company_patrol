package com.mingshu.vm.patrol.http.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 区域规范出参
 */
public class AreaStandardResponse implements Serializable {

    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;
    @SerializedName("data")
    private AreaStandard data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public AreaStandard getData() {
        return data;
    }

    public void setData(AreaStandard data) {
        this.data = data;
    }

    public static class AreaStandard implements Serializable {
        @SerializedName("areaid")
        private Integer areaid;
        @SerializedName("safety")
        private String safety;
        @SerializedName("roomtemp")
        private String roomtemp;
        @SerializedName("health")
        private String health;
        @SerializedName("userid")
        private Integer userid;
        @SerializedName("createtime")
        private String createtime;
        @SerializedName("updatetime")
        private String updatetime;

        public Integer getAreaid() {
            return areaid;
        }

        public void setAreaid(Integer areaid) {
            this.areaid = areaid;
        }

        public String getSafety() {
            return safety;
        }

        public void setSafety(String safety) {
            this.safety = safety;
        }

        public String getRoomtemp() {
            return roomtemp;
        }

        public void setRoomtemp(String roomtemp) {
            this.roomtemp = roomtemp;
        }

        public String getHealth() {
            return health;
        }

        public void setHealth(String health) {
            this.health = health;
        }

        public Integer getUserid() {
            return userid;
        }

        public void setUserid(Integer userid) {
            this.userid = userid;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }
    }
}
