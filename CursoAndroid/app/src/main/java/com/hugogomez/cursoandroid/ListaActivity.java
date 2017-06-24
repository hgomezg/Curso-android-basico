package com.hugogomez.cursoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hugo on 23/06/17.
 */

public class ListaActivity extends Activity {

    private ListView lista;
    private ArrayList<Pokemon> listaPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_activity);


        lista = (ListView) findViewById(R.id.lista);

        Pokemon p1 = new Pokemon("articuno", "Hielo", "https://www.youtube.com/watch?v=JCAPoJH6JaA",
                R.drawable.articuno, "Pokemon legendario de hielo");

        Pokemon p2 = new Pokemon("dragonair", "Dragon", "https://www.youtube.com/watch?v=9v613OZ_7b8",
                R.drawable.dragonair, "Pokemon tipo dragon");

        Pokemon p3 = new Pokemon("Mega Gyarados", "Dragon", "https://www.youtube.com/watch?v=0-c-EnThWO0",
                R.drawable.megagyarados, "Pokemon tipo dragon");

        Pokemon p4 = new Pokemon("moltres", "Fuego", "https://www.youtube.com/watch?v=BQI2EJ92grc",
                R.drawable.moltres, "Pokemon legendario de fuego");

        Pokemon p5 = new Pokemon("Zapdps", "Electrico", "https://www.youtube.com/watch?v=joQqxSHisE4",
                R.drawable.zapdos, "Pokemon legendario electrico");


        listaPokemon = new ArrayList<>();

        listaPokemon.add(p1);
        listaPokemon.add(p2);
        listaPokemon.add(p3);
        listaPokemon.add(p4);
        listaPokemon.add(p5);

        AdapterLista adp = new AdapterLista(this, listaPokemon);

        lista.setAdapter(adp);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Pokemon seleccionado = listaPokemon.get(position);

                Intent i = new Intent(getApplicationContext(), DetallePokemon.class);

                i.putExtra("nombre", seleccionado.getNombre());
                i.putExtra("imagen", seleccionado.getUrlImagen());
                i.putExtra("descripcion", seleccionado.getDescripcion());
                i.putExtra("urlVideo", seleccionado.getUrlVideo());

                startActivity(i);



            }
        });



    }


}
