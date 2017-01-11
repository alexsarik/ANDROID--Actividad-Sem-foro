package com.example.combinarcomponentes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by alexander.sari on 11/01/2017.
 */



public class SemaforoRojo extends View {


    public SemaforoRojo(Context context) {
        super(context);
    }

    public SemaforoRojo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SemaforoRojo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();


        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        paint.setColor(Color.RED);
        canvas.drawCircle(80,25,25, paint);
    }
}
