package com.hugogomez.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed;
    private EditText ed1;
    private String contra;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = "hugo";
        contra = "1234567";
    }

    public void irPokedex(View v){

        if(revisaContrasena()){

            Intent i = new Intent(this, ListaActivity.class);
            startActivity(i);
        }

    }


    private boolean revisaContrasena(){

        ed =(EditText) findViewById(R.id.etNombre);
        String nom = ed.getText().toString();

        ed1 = (EditText) findViewById(R.id.etContra);
        String con = ed1.getText().toString();


        if(nom.equals(nombre) && contra.equals(con)){

            return true;

        }else if(con.length()<=6){

            Toast t = Toast.makeText(getApplicationContext(), "Contraseña demasido corta", Toast.LENGTH_SHORT);

            t.show();

            return false;

        }
        return  false;
    }
}
