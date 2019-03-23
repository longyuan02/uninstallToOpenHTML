package com.cn.kotlin.myapplication;

import android.app.Application;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		UninstallBrowserSDK.getInstance().setUninstallWebUrl(this,"http://shouji.360.cn/web/uninstall/uninstall.html");
	}
}
