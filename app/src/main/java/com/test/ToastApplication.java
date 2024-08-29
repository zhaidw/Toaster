package com.test;

import android.app.Application;

import com.hjq.toast.Toaster;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/Toaster
 * time   : 2018/09/01
 * desc   : Toaster 初始化
 */
public final class ToastApplication extends Application {

    public static ToastApplication instance;

    public static ToastApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // 初始化 Toast 框架
        Toaster.init(this);
    }
}