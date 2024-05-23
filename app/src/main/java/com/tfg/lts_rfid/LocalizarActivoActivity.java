package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class LocalizarActivoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizar_activo);
        setupSpinnerFamilia();
        setupSpinnerDescripcion();
        setupSpinnerRefCode();
        setupSpinnerTagID();

        Button btSeleccionar = (Button) findViewById(R.id.btSeleccionar);
        Button btInicio = (Button) findViewById(R.id.btLocalizador1);

        btSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocalizarActivoActivity.this, MainActivity.class));
            }
        });

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocalizarActivoActivity.this, MainActivity.class));
            }
        });
    }

    private void setupSpinnerFamilia(){
        Spinner spinner = findViewById(R.id.spFamiliaActivo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.familia, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private void setupSpinnerDescripcion(){
        Spinner spinner2 = findViewById(R.id.spDescripcion);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.descripcion, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
    }

    private void setupSpinnerRefCode(){
        Spinner spinner3 = findViewById(R.id.spRefCode);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ref_code, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
    }

    private void setupSpinnerTagID(){
        Spinner spinner4 = findViewById(R.id.spTagID);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tag_id, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter);
    }
}
