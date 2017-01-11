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
public class MiPropioView extends View {

    private LoginView loginView;

    public MiPropioView(Context context) {
        super(context);
    }

    public MiPropioView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MiPropioView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Paint paint = new Paint();


        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        paint.setColor(Color.GREEN);
        canvas.drawCircle(25,25,25, paint);


    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int width = 150;
        int height = 50;
        //Tamaño por defecto
        switch (widthMode){
            case MeasureSpec.EXACTLY:
                width = widthSize;
                break;
            case MeasureSpec.AT_MOST:
                if(width > widthSize){
                    width = widthSize;
                }
                break;
        }
        switch (heightMode){
            case MeasureSpec.EXACTLY:
                height = heightSize;
                break;
            case MeasureSpec.AT_MOST:
                if(height > heightSize){
                    height = heightSize;
                }
                break;
        }
        this.setMeasuredDimension(width, height);
    }
}


