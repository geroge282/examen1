package com.example.jorgecofre_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Encuesta extends AppCompatActivity implements View.OnClickListener {


    EditText respuestaL;
    Button bEcuesta,radioS, radioN, cFutbol, cTenis, cBaloncesto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        respuestaL=findViewById(R.id.etRespuesta);
        cFutbol=findViewById(R.id.chBoxfutbol);
        cTenis=findViewById(R.id.chBoxvoley);
        cBaloncesto=findViewById(R.id.chBoxbasquetball);

        radioS=findViewById(R.id.rBsi);

        radioN=findViewById(R.id.rBno);

        bEcuesta=findViewById(R.id.btnEnviar);

        bEcuesta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String respues,fut,ten,bal,si,no;
        respues = respuestaL.getText().toString();
        fut = cFutbol.getText().toString();
        ten = cTenis.getText().toString();
        bal = cBaloncesto.getText().toString();
        si = radioS.getText().toString();
        no = radioN.getText().toString();
        Intent intent = new Intent(Encuesta.this, Resumen.class);
        intent.putExtra("",respues);
        intent.putExtra("Futbol",fut);
        intent.putExtra("Tenis",ten);
        intent.putExtra("Baloncesto",bal);
        intent.putExtra("Si",si);
        intent.putExtra("No",no);
        startActivity(intent);
//ultimo cambio 2019
    }
}
