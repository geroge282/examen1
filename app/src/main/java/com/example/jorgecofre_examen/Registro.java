package com.example.jorgecofre_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    EditText nombre;
    EditText monto;
    TextView Mensual;
    Button guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button guardar = (Button) findViewById(R.id.btnGuardar);

        nombre = findViewById(R.id.eTnombre);
        monto = findViewById(R.id.etMonto);
        Mensual=(TextView) findViewById(R.id.txtMensual2);


        guardar.setOnClickListener(this);




    }


    public void onClick (View v){
        String n1=monto.getText().toString();
        int entero1= Integer.parseInt(n1);
        int precio=3000;
        double resu= (precio-entero1)/5;
        Mensual.setText(""+resu);

        String nombreguardado;
        nombreguardado = nombre.getText().toString();
        Toast.makeText(getApplicationContext(),"Elemento guardado con exito",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Registro.this, Resumen.class);
        intent.putExtra("Jorge",nombreguardado);
        startActivity(intent);
    }




}
