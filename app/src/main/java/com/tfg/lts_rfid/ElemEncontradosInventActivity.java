package com.tfg.lts_rfid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ElemEncontradosInventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementos_encontrados);

        Button btInicio = (Button) findViewById(R.id.btInventario6);

        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElemEncontradosInventActivity.this, MainActivity.class));
            }
        });
    }
}
