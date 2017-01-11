package com.example.alexandersari.contadorpalabras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by alexander.sari on 11/1/17.
 */

public class EditText_Counter extends EditText {

    Paint pincelFondo, pincelTexto; //pinceles float escala
    float escala;



    private void crearPinceles(){
        pincelFondo = new Paint (Paint.ANTI_ALIAS_FLAG);
        pincelFondo.setColor(Color.BLACK);
        pincelFondo.setStyle(Paint.Style.FILL);
        pincelTexto = new Paint(Paint.ANTI_ALIAS_FLAG);
        pincelTexto.setColor(Color.WHITE);
        pincelTexto.setTextSize(20);
        escala = getResources().getDisplayMetrics().density; //Obtenemos la densidad de pixeles de la pantalla
    }


    public EditText_Counter(Context context) {
        super(context);
        crearPinceles();
    }

    public EditText_Counter(Context context, AttributeSet attrs) {
        super(context, attrs);
        crearPinceles();
    }

    public EditText_Counter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        crearPinceles();
    }


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        if(this.getText().toString().length() > 40){

            pincelFondo.setColor(Color.RED);

        }else{

            pincelFondo.setColor(Color.BLACK);
        }
        canvas.drawRect(this.getWidth()-30*escala, 5*escala, this.getWidth()-5*escala, 20*escala, pincelFondo );
        canvas.drawText("" + this.getText().toString().length(), this.getWidth()-28*escala, 17*escala, pincelTexto);



    }
}
