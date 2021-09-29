package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private TextView numero = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        numero = findViewById(R.id.txt_numero);
    }

    public void contar(View view) {
        contador++;
        numero.setText(String.valueOf(contador));

    }

    public void resetear(View view) {
        contador = 0;
        numero.setText("0");
    }
}