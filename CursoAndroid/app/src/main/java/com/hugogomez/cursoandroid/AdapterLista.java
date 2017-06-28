package com.hugogomez.cursoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by hugo on 23/06/17.
 */

public class AdapterLista extends BaseAdapter {

    private Context context;
    private ArrayList<Pokemon> listaPokemon;

    public AdapterLista(Context context, ArrayList<Pokemon> listaPokemon){

        this.context=context;
        this.listaPokemon=listaPokemon;

    }

    @Override
    public int getCount() {
        return listaPokemon.size();
    }

    @Override
    public Object getItem(int position) {
        return listaPokemon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Pokemon selecciona = listaPokemon.get(position);
        LayoutInflater inFlater = LayoutInflater.from(context);
        View v = inFlater.inflate(R.layout.adapter_pokemon, null);
        ImageView ima = (ImageView) v.findViewById(R.id.ima_pok);
        TextView nombre = (TextView) v.findViewById(R.id.txt_nom);

        nombre.setText(selecciona.getNombre());

        Glide.with(context).load(selecciona.getUrlImaPok()).into(ima);
        /*
        ima.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ima.setPadding(1,1,1,1);
        ima.setImageResource(selecciona.getUrlImagen());
        */
        return v;
    }
}
