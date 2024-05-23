package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InventarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);

        Button btCrearInvent = (Button) findViewById(R.id.btCrearInventario);
        Button btInicio = (Button) findViewById(R.id.btInventario);

        btCrearInvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InventarioActivity.this, CrearInventarioActivity.class));
            }
        });

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InventarioActivity.this, MainActivity.class));
            }
        });
    }
}
