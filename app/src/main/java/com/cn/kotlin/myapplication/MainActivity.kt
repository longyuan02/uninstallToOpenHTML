package com.cn.kotlin.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var jin = JNI();
    var pressuer = Pressuer(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(pressuer)
//        sample_text.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                sample_text.setText(jin.integerJNI.toString())
                object : Thread() {
                    override fun run() {
                        super.run()
                        while (true) {
                            if (jin.integerJNI > 200) {
                                break
                            } else {
                                pressuer.setPressure(jin.integerJNI);
                            }
                        }
                    }
                }
//            }
//        })

        // Example of a call to a native method
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    external fun stringFromJNI(): Integer
//    external fun getIntegerJNI():String
//
//    companion object {
//
//        // Used to load the 'native-lib' library on application startup.
//        init {
//            System.loadLibrary("native-lib")
//        }
//    }
}
