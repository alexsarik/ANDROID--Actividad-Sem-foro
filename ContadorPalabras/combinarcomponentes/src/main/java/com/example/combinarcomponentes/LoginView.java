package com.example.combinarcomponentes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by alexander.sari on 11/01/2017.
 */
public class LoginView extends LinearLayout {

    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnValidar;
    private OnLoginListener onLoginListener;


    public LoginView(Context context) {
        super(context);
        inicializar();
    }

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    public LoginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inicializar();
    }

    private void inicializar(){

        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);

        li.inflate(R.layout.components,this,true);
        txtUsuario = (EditText)findViewById(R.id.usuario);
        txtPassword = (EditText)findViewById(R.id.Contrasena);
        btnValidar = (Button)findViewById(R.id.Validar);

        asignarEventos();

    }

    public void setOnLoginListener(OnLoginListener onLoginListener){
        this.onLoginListener = onLoginListener;
    }

    public interface OnLoginListener {
        void onLogin(String usuario, String contrasena);
    }

    public void asignarEventos(){

        btnValidar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginListener.onLogin(txtUsuario.getText().toString(), txtPassword.getText().toString());
            }
        });
    }
}

