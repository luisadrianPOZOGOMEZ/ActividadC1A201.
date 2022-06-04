package com.upchiapas.ActividadC1A201.Models;

public class CatalagoPizza {
    private Pizza [] lpizza;

    public CatalagoPizza(Pizza[] lpizza) {
        this.lpizza = lpizza;
    }

    public Pizza[] getLpizza() {
        return lpizza;
    }
    public String getNombre(int constante){
        return lpizza[constante].getNombre();
    }
    public int getPrecio(int constante){
        return lpizza[constante].getPrecio();
    }
}
