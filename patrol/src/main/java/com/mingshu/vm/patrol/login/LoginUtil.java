package com.mingshu.vm.patrol.login;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mingshu.vm.patrol.constant.HttpConstant;
import com.mingshu.vm.patrol.constant.SpConstant;
import com.mingshu.vm.patrol.http.request.LoginRequest;
import com.mingshu.vm.patrol.http.response.LoginResponse;
import com.xuanfeng.xflibrary.http.HttpResponse;
import com.xuanfeng.xflibrary.http.httpmgr.HttpManager;
import com.xuanfeng.xflibrary.utils.AppUtil;
import com.xuanfeng.xflibrary.utils.SpManager;
import com.xuanfeng.xflibrary.utils.ToastUtil;

/**
 * 登录相关工具
 */
public class LoginUtil {

    /**
     * 登录接口
     */
    public static void login(Context context) {
        LoginRequest request = new LoginRequest();
        request.setUsername("admin");
        request.setPassword("admin123");
        request.setType("app");
        HttpManager.getInstance().postJson(HttpConstant.BASE_URL + HttpConstant.LOGIN, request, new HttpResponse<JsonObject>() {
            @Override
            public void onSuccess(JsonObject jsonObject) {
                LoginResponse loginResponse = new Gson().fromJson(jsonObject, LoginResponse.class);
                SpManager.getInstance(context).setString(SpConstant.SP_USER_ID,loginResponse.getUserId());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
