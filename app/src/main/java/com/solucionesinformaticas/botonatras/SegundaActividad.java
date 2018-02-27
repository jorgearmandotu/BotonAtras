package com.solucionesinformaticas.botonatras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
