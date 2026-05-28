package com.example.adaptadores.Clases;

public class Personaje {

    private String imagen;
    private String nombre;
    private String modelo;

    public Personaje(String imagen, String nombre, String modelo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
