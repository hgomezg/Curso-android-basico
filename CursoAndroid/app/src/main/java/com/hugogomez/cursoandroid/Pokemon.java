package com.hugogomez.cursoandroid;

import java.io.Serializable;

/**
 * Created by hugo on 23/06/17.
 */

public class Pokemon implements Serializable {

    private String nombre;
    private String tipo;
    private String urlVideo;
    private Integer urlImagen;
    private String descripcion;

    public Pokemon(String nombre, String tipo, String urlVideo, Integer urlImagen, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.urlVideo = urlVideo;
        this.urlImagen = urlImagen;
        this.descripcion=descripcion;
    }

    public Pokemon(){}

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Integer getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(Integer urlImagen) {
        this.urlImagen = urlImagen;
    }
}
