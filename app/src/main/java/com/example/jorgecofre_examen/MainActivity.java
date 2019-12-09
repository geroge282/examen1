package com.example.jorgecofre_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ingresar = (Button) findViewById(R.id.btnIngresar);

        ingresar.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String usu = ((EditText)findViewById(R.id.txtUsuario)).getText().toString();
                                            String pass = ((EditText)findViewById(R.id.txtPassword)).getText().toString();
                                            if (usu.equals("estudiante2019") &&pass.equals("uisrael2019"))
                                            {
                                                Intent menu = new Intent(MainActivity.this,Registro.class);
                                                startActivity(menu);
                                            }
                                            else
                                            {
                                                //solucion
                                                Toast.makeText(getApplicationContext(),"Usuario o clave Incorrecto",Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }

        );

    }
}
