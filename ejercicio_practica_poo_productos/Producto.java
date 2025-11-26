package com.mycompany.ejercicio_practica_poo_productos;

public class Producto {
    
    //Atributos
    private String nombre;
    private double precio;
    private int stock;
    
    //Constructor
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    //Método mostrarInfo()
    public void mostrarInfo(){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Stock: " + stock + " unidades");
        
    }
    
}
