package com.cn.kotlin.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainInput extends AppCompatActivity {
    Pressuer pressuer;
    int pressuerss = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final JNI jni = new JNI();
        pressuer = new Pressuer(this);
//        setContentView(pressuer);
        setContentView(R.layout.activity_main);
//        jni.uninstall("", Build.VERSION.SDK_INT);
        //绘制图像
//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                while (true) {
//                    SystemClock.sleep(1000);
//                    Log.w("preesuesr====1", jni.getIntegerJNI() + "");
//                    pressuerss = pressuerss + jni.getIntegerJNI();
//                    pressuer.setPressure(pressuerss);
//                    Log.w("preesuesr====", pressuerss + "");
//                    if (pressuerss > 220) {
//                        break;
//                    }
//                }
//            }
//        }.start();
    }
}
