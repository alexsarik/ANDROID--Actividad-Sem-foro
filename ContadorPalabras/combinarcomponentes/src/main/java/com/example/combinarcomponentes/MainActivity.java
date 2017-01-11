package com.example.combinarcomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LoginView loginView;
    private MiPropioView verde;
    private SemaforoRojo rojo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginView = (LoginView)findViewById(R.id.CtLogin);
        verde = (MiPropioView) findViewById(R.id.verde);
        rojo = (SemaforoRojo) findViewById(R.id.rojo);

        loginView.setOnLoginListener(new LoginView.OnLoginListener(){
            @Override
            public void onLogin(String usuario, String contrasena){
                if(usuario.equals("demo") && contrasena.equals("demo")) {
                    Toast.makeText(getApplicationContext(), "Login Correcto", Toast.LENGTH_LONG).show();

                    verde.setVisibility(View.VISIBLE);
                    rojo.setVisibility(View.GONE);
                }

                else{
                    Toast.makeText(getApplicationContext(), "Login Incorrecto", Toast.LENGTH_LONG).show();
                    rojo.setVisibility(View.VISIBLE);
                    verde.setVisibility(View.GONE);
                }
            }
        });
    }
}
