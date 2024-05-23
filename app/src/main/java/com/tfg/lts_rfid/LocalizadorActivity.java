package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LocalizadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizador);

        Button btInicio = (Button) findViewById(R.id.btLocalizador);
        Button btLocalizarActivo = (Button) findViewById(R.id.btLocalizarActivo);

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocalizadorActivity.this, MainActivity.class));
            }
        });

        btLocalizarActivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocalizadorActivity.this, LocalizarActivoActivity.class));
            }
        });
    }
}
