package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IdentificadoInventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_inventario_identificado);

        Button btStop = (Button) findViewById(R.id.btSeleccionarInvent);
        Button btInicio = (Button) findViewById(R.id.btInventario2);

        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IdentificadoInventActivity.this, ActvioSelecInventActivity.class));
            }
        });

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IdentificadoInventActivity.this, MainActivity.class));
            }
        });
    }
}

