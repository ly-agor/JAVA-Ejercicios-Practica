package com.mycompany.ejercicio_practica_poo_productos;

public class Ejercicio_Practica_POO_Productos {

    public static void main(String[] args) {
                
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // 1. Crea una clase Producto con los atributos privados nombre(String), precio(double) y stock(int). 
    //      a) Crea un constructor que reciba los tres atributos.
    //      b) Crea getters y setters.
    //      c) Implementa un método mostrarInfo() que imprima todos los datos.
    //      d) Desde una clase Main, crea 3 productos y muestra su información.
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    Producto producto1 = new Producto("Televisión", 750, 125);
    Producto producto2 = new Producto("Ordenador", 500, 90);
    Producto producto3 = new Producto("Tablet", 200, 400);
    
    producto1.mostrarInfo();
    producto2.mostrarInfo();
    producto3.mostrarInfo();

    }
}
