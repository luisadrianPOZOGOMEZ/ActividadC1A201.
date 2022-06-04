package com.upchiapas.ActividadC1A201;
import java.util.Scanner;

import com.upchiapas.ActividadC1A201.Models.CatalagoPizza;
import com.upchiapas.ActividadC1A201.Models.Pizza;
import com.upchiapas.ActividadC1A201.Models.Pedido;
import com.upchiapas.ActividadC1A201.Models.Cliente;
import com.upchiapas.ActividadC1A201.Models.Tienda;

public class Main {

    private static Pizza[] listaPizzas;
    private static Pizza [] igualarPizzas;
    private static CatalagoPizza objetoCatalogo;
    private static Pedido [] pPizza;
    private static  Pedido objetoPedido;
    private static Scanner entrada = new Scanner(System.in);
    private static Cliente objetoCliente;
    private static Tienda objetoTienda;


    public static void main(String[] args) {
        tiposdePizzas();
        entregarPedido();
    }

    public static void tiposdePizzas() {
        int opcion;
        int ij = 0;
        String nombreCliente;
        listaPizzas = new Pizza[3];
        pPizza = new Pedido[3];
        igualarPizzas = new Pizza[3];
        Pizza pizzaPeperoni = new Pizza("1.- Pizza de Pepperoni", 100);
        listaPizzas[0] = pizzaPeperoni;
        Pizza pizzaHawaiana = new Pizza("2.- Pizza Hawaiana", 110);
        listaPizzas[1] = pizzaHawaiana;
        Pizza pizzaMexicana = new Pizza("3.- Pizza Mexicana", 120);
        listaPizzas[2] = pizzaMexicana;
        objetoCatalogo = new CatalagoPizza(listaPizzas);
        System.out.println("A nombre de quien el pedido: ");
        nombreCliente = entrada.nextLine();
        objetoCliente = new Cliente(nombreCliente);
        do{
            System.out.println("Catalogo de Pizzas");
            for (int i = 0; i < listaPizzas.length; i++) {
                System.out.println(objetoCatalogo.getNombre(i) + " $" +objetoCatalogo.getPrecio(i));
            }
            System.out.println("Alija una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
            case 1:
                 igualarPizzas [ij] = listaPizzas [0];
                 objetoPedido = new Pedido(igualarPizzas);
                 pPizza[ij] = objetoPedido;
                break;
            case 2:
                igualarPizzas [ij] = listaPizzas [1];
                objetoPedido = new Pedido(igualarPizzas);
                pPizza[ij] = objetoPedido;
                break;
            case 3:
                igualarPizzas [ij] = listaPizzas [2];
                objetoPedido = new Pedido(igualarPizzas);
                pPizza[ij] = objetoPedido;
                break;
            }
            ij++;
        }while(opcion != 3);
    }
    public static void entregarPedido() {
        System.out.println("Usted hizo este pedido: ");
        objetoTienda = new Tienda(pPizza);
        for(int i=0; i<3; i++){
            System.out.println(objetoTienda.getNombre(i));
        }
    }
}

