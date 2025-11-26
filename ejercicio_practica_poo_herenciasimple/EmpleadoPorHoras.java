package com.mycompany.ejercicio_practica_poo_herenciasimple;

public class EmpleadoPorHoras extends Empleado {
   
    //Atributo extra
    double h; //horas trabajadas
    double p; //precio por hora
    
    //Constructor
    public EmpleadoPorHoras(String nombre, double h, double p) {
        super(nombre);
        this.h=h;
        this.p=p;
        
    }
    
    //Método getSalario sobrescrito
    @Override
    public double getSalario(){
        return h*p;
    }
    
}
