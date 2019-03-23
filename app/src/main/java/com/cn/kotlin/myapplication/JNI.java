package com.cn.kotlin.myapplication;

public class JNI {
    {
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();

    public native int getIntegerJNI();

    //卸载
    public native void uninstall(String packName,int sdkVersion);


}
