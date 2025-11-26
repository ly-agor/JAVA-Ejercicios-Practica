package com.mycompany.ejercicio_practica_poo_herenciasimple;

public class EmpleadoFijo extends Empleado {
    
    //Atributo extra
    double complemento;
    double salarioBase;
    
    //Constructor
    public EmpleadoFijo(String nombre, double salarioBase, double complemento) {
        super(nombre);
        this.salarioBase=salarioBase;
        this.complemento=complemento;
    }
    
    //Método getSalario sobrescrito
    @Override
    public double getSalario(){
        return salarioBase+complemento;
    }
    
}
