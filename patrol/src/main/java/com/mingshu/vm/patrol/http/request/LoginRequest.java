package com.mingshu.vm.patrol.http.request;

public class LoginRequest {
    // 用户名
    String username;
    // 密码
    String password;
    // 类型 app
    String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
