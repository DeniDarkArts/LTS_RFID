package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IdInventarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificar_inventario);

        Button btInicio = (Button) findViewById(R.id.btInventario4);
        Button btStop = (Button) findViewById(R.id.btStop);

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdInventarioActivity.this, MainActivity.class));
            }
        });

        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdInventarioActivity.this, ElemenEncontradosActivity.class));
            }
        });
    }
}
