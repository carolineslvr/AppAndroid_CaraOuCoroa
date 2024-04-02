package com.example.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagem = findViewById(R.id.imageView2);
        btnVoltar = findViewById(R.id.imageButton2);

        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");

        if (numero == 0){

            imagem.setImageResource(R.drawable.moeda_cara);

        } else {
            imagem.setImageResource((R.drawable.moeda_coroa));
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}