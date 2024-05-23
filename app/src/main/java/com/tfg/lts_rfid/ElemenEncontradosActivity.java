package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ElemenEncontradosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementos_encontrados);

        Button btInicio = (Button) findViewById(R.id.btInventario5);
        Button btNuevaLectura = (Button) findViewById(R.id.btNuevaLectura);
        Button btAsigActivo = (Button) findViewById(R.id.btAsigActivo);

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElemenEncontradosActivity.this, MainActivity.class));
            }
        });

        btNuevaLectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElemenEncontradosActivity.this, ActvioSelecInventActivity.class));
            }
        });

        btAsigActivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElemenEncontradosActivity.this, ElemEncontradosInventActivity.class));
            }
        });
    }
}
