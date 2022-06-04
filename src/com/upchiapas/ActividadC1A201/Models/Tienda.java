package com.upchiapas.ActividadC1A201.Models;

public class Tienda {
    private Pedido [] pedidos= new Pedido[3];

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public Tienda(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    public String getNombre(int i){
        return pedidos[i].getNombre(i);
    }
}
