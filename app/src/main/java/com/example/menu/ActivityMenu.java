package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMenu extends AppCompatActivity {


    private AppCompatTextView conexoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        conexoes = findViewById(R.id.titulosegundatela);
        if (getIntent().getStringExtra("parametro") == null) {
            conexoes.setText("Adriely");
        } else {
            conexoes.setText(getIntent().getStringExtra("parametro"));
        }


    }
}