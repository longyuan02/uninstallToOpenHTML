package com.cn.kotlin.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Pressuer extends View {
    Paint paint = new Paint();
    public int pressure = 0;

    public Pressuer(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        if (pressure > 220) {
            paint.setColor(Color.GRAY);
            canvas.drawText("快跑,要爆炸了", 10, getWidth() / 2, paint);
        }
        if (pressure < 200) {
            paint.setColor(Color.GREEN);
            canvas.drawRect(10, 260 - pressure, 60, 260, paint);
        } else {
            paint.setColor(Color.RED);
            canvas.drawRect(10, 260 - pressure, 60, 260, paint);
        }

    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        postInvalidate();
    }
}
