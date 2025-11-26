package com.mycompany.ejercicio_practica_poo_herenciasimple;

public class Empleado {
    
    //Atributos
    String nombre;
    double salarioBase;
    
    //Constructor
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    
    //Métodos
    public double getSalario(){
        return salarioBase;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + getSalario());
    }
}
