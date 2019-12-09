package com.example.jorgecofre_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {
    EditText usuarioConectado, nombreConectado, respuestaFut, respuestaTen, respuestaBalo,
            respuestaSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        usuarioConectado=findViewById(R.id.txtUsuario);
        nombreConectado=findViewById(R.id.txtEstudiante);

        respuestaFut=findViewById(R.id.txtPorque);
        respuestaTen=findViewById(R.id.txtDeporte);

        respuestaSi=findViewById(R.id.txtIngles);


        String recibirNombre = getIntent().getStringExtra("JORGE");

        String recibirFut = getIntent().getStringExtra("");
        String recibirTen = getIntent().getStringExtra("");
        String recibirBalo = getIntent().getStringExtra("");
        String recibirSiNo = getIntent().getStringExtra("");

        usuarioConectado.setText(recibirNombre);

    }
}
