package com.hugogomez.cursoandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by hugo on 23/06/17.
 */

public class DetallePokemon extends Activity {

    private TextView txNom;
    private ImageView imagen;
    private TextView txtDescripcion;
    private String urlVideo;
    private String urlImaPok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_pokemon);

        txNom = (TextView) findViewById(R.id.txt_det_nom);
        imagen = (ImageView) findViewById(R.id.ima_detalle);
        txtDescripcion = (TextView) findViewById(R.id.txt_det_descripcion);
        urlVideo = "";
        urlImaPok="";

        //obtener valores del pokemon presionado
        Bundle bd = getIntent().getExtras();

        if(bd != null){

            String nombre = (String) bd.get("nombre");
            txNom.setText(nombre);

            urlImaPok = (String) bd.get("urlIma");

            Glide.with(this).load(urlImaPok).into(imagen);

            /**
            Integer idIma = (Integer) bd.get("imagen");
            imagen.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imagen.setPadding(1,1,1,1);
            imagen.setImageResource(idIma);
             */

            String descipcion = (String) bd.get("descripcion");
            txtDescripcion.setText(descipcion);

            urlVideo = (String) bd.get("urlVideo");

        }

    }

    public void irVideo(View v){

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlVideo));

        startActivity(i);

    }
}
