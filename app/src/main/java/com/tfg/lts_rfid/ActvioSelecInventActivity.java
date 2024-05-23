package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActvioSelecInventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario_activo_seleccionado);

        Button btInicio = (Button) findViewById(R.id.btInventario3);
        Button btAsignacionInvent = (Button) findViewById(R.id.btAsignacionInvent);

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActvioSelecInventActivity.this, MainActivity.class));
            }
        });

        btAsignacionInvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActvioSelecInventActivity.this, IdInventarioActivity.class));
            }
        });
    }
}