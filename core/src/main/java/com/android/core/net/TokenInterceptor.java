package com.android.core.net;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * @Description: 处理token失效的情况
 * @Author: dev.liang
 * @Date: 2019-08-19 20:54
 */
public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        /**
         * 返回为token失效
         */
        if (response.code() == 401) {
//            UserHandle.getInstance().clearUserInfo();
            resetLogin();
        }
        return response;
    }

    /**
     * 重新登录
     */
    private void resetLogin() {

    }
}