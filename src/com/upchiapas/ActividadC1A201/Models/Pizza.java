package com.upchiapas.ActividadC1A201.Models;

public class Pizza {
    private String nombre;
    private int precio;

    public Pizza(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
