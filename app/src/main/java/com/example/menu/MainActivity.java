package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity
        extends AppCompatActivity {

    Button btnconexoes;
    Button btnsomvibracao;
    Button btnvisor;
    Button btnnotificacoes;
    Button btnteladeBloqueio;
    Button btnaplicativos;
    Button btncontadordepessoas;
    Button btnsquad;
    ArrayList<String> listaPagamentos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPagamentos = new ArrayList<>();
        listaPagamentos.add("Adriely");
        listaPagamentos.add("Bruno");
        listaPagamentos.add("Marcelo");
        listaPagamentos.add("Kazu");
        listaPagamentos.add("Vitor");
        listaPagamentos.add("Rodrigo");
        listaPagamentos.add("Vertinho");
        listaPagamentos.add("Will");


        btnaplicativos = findViewById(R.id.btnaplicativos);

        btnaplicativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                intent.putExtra("parametro", "Aplicativos");
                startActivity(intent);
            }
        });
        {
            btnteladeBloqueio = findViewById(R.id.btneladeBloqueio);
            btnteladeBloqueio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                    intent.putExtra("parametro", "Tela de bloqueio");
                    startActivity(intent);
                }
            });
        }
        {
            btnnotificacoes = findViewById(R.id.btnnotificacoes);
            btnnotificacoes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                    intent.putExtra("parametro", "notificações");
                    startActivity(intent);

                }
            });
            {
                btnvisor = findViewById(R.id.btnvisor);
                btnvisor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                        intent.putExtra("parametro", "visor");
                        startActivity(intent);


                    }
                });
                {
                    btnsomvibracao = findViewById(R.id.btnsomvibracao);
                    btnsomvibracao.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                            intent.putExtra("parametro", "somvibracao");

                            startActivity(intent);

                        }
                    });

                }
                {
                    btnconexoes = findViewById(R.id.btnconexoes);
                    btnconexoes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, ActivityMenu.class);
                            intent.putExtra("parametro", "conexoes");
                            startActivity(intent);
                        }
                    });
                    btncontadordepessoas = findViewById(R.id.btncontadordepessoas);
                    btncontadordepessoas.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, ActivityContador.class);
                            intent.putExtra("parametro", "contador de pessoas");
                            startActivity(intent);
                        }
                    });

                    btnsquad = findViewById(R.id.btnsquad);
                    btnsquad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            addNomes();
                        }
                    });

                }
            }


        }
    }

    private void addNomes() {
        listaPagamentos.add(btnsquad.getText().toString());
        printaNomes();
    }

    private void printaNomes() {


        for (int i = 0; i < listaPagamentos.size(); i++) {

            if (i == 2) {
                listaPagamentos.set(i, "Joana");

            }

        }
        String nome = listaPagamentos.get(2);
        System.out.println(nome);

    }
}





