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
    
    Producto p1 = new Producto("Televisión", 750, 125);
    Producto p2 = new Producto("Ordenador", 500, 90);
    Producto p3 = new Producto("Tablet", 200, 400);
    
    p1.mostrarInfo();
    System.out.println(" ");
    p2.mostrarInfo();
    System.out.println(" ");
    p3.mostrarInfo();
    System.out.println(" ");
    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // 2. Validación de setters. Modifica la clase Producto para que: 
    //      a) precio no pueda ser negativo.
    //      b) stock no pueda ser menor que 0.
    //      c) Si se intenta asignar un valor inválido, el setter debe ignorarlo o asignar el mínimo permitido.
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    //Comprobamos con otros productos las restricciones del apartado 2
    Producto p4 = new Producto("Móvil", -20.5, -2);
    Producto p5 = new Producto("Secador", 30.5, 60);
    Producto p6 = new Producto("Smartwatch", -100, 80);
    
    System.out.println(" ");
    p4.mostrarInfo();
    System.out.println(" ");
    p5.mostrarInfo();
    System.out.println(" ");
    p6.mostrarInfo();

    }
}
