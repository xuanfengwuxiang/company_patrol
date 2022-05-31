package com.mingshu.vm.patrol.http.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 设备规范出参
 */
public class DeviceStandardResponse implements Serializable {

    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;

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
}
