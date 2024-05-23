package com.tfg.lts_rfid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class CrearInventarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_inventario);
        setupSpinnerFamilia();

        Button btCrearInvent = (Button) findViewById(R.id.btIdElemento);
        Button btInicio = (Button) findViewById(R.id.btInventario);

        btCrearInvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearInventarioActivity.this, DetInventarioActivity.class));
            }
        });

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CrearInventarioActivity.this, MainActivity.class));
            }
        });
    }

    private void setupSpinnerFamilia(){
        Spinner spinner = findViewById(R.id.spFamiliaActivo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.familia, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
