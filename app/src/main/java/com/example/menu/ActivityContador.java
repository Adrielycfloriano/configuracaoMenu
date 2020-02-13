package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityContador extends AppCompatActivity {
    int numerohomem = 0;
    int numeromulher = 0;
    int numeropessoas = 0;

    TextView campoTexto;
    Button btnmulher;
    Button btnhomem;
    Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        campoTexto = findViewById(R.id.campoTexto);
        btnhomem = findViewById(R.id.btnhomem);
        btnmulher = findViewById(R.id.btnmulher);
        btnreset = findViewById(R.id.btnreset);
        btnhomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numerohomem++;
                numeropessoas++;
                String mensagem = Integer.toString(numeropessoas);
                campoTexto.setText("Total: " + mensagem + " Pessoas");
                btnhomem.setText(Integer.toString(numerohomem));
            }
        });
        btnmulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeromulher++;
                numeropessoas++;
                String mensagem = Integer.toString(numeropessoas);
                campoTexto.setText("Total: " + mensagem + " Pessoas");
                btnmulher.setText(Integer.toString(numeromulher));
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numerohomem = 0;
                numeromulher = 0;
                numeropessoas = 0;

                String mensagem = Integer.toString(numeropessoas);
                campoTexto.setText("Total: " + mensagem + " Pessoas");
                btnhomem.setText(Integer.toString(numerohomem));
                btnmulher.setText(Integer.toString(numeromulher));
            }
        });


    }
}
