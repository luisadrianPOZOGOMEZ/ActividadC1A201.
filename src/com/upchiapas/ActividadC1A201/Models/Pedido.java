package com.upchiapas.ActividadC1A201.Models;

public class Pedido {
    private Pizza [] pedido = new Pizza[2] ;

    public Pedido(Pizza[] pedido) {
        this.pedido = pedido;
    }

    public Pizza[] getPedido() {
        return pedido;
    }
    public String getNombre(int i){
        return pedido[i].getNombre();
    }
}
