package com.mingshu.vm.patrol.http.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 登录出参
 */



public class LoginResponse implements Serializable {


    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;
    @SerializedName("token")
    private String token;
    @SerializedName("userId")
    private String userId;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
