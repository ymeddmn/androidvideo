package com.example.mayong.androidvideodemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by mayong on 2018/2/1.
 *
 */

public class ISurfaceView extends SurfaceView {
    public ISurfaceView(Context context) {
        super(context);
    }

    public ISurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ISurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        canvas.drawColor(Color.RED);//可以改变surfaceview的背景色，但是不能改变视频播放时候的背景色
    }


}
