package com.mycompany.ejercicio_practica_poo_herenciasimple;

public class Ejercicio_Practica_POO_HerenciaSimple {

    public static void main(String[] args) {
    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Crea una clase Empleado con nombre y salarioBase: 
    //  a) Crea los métodos getSalario() y mostrarInfo().
    //  b) Crea dos clases hijas: EmpleadoFijo (tiene un complemento fijo mensual) y EmpleadoPorHoras (tiene horas trabajadas + precio por hora).
    //  c) Sobrescribe getSalario en ambas clases.
    //  d) En Main, crea un array de empleados y muestra su información.
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //Creamos un array con 5 empleados
    Empleado[] empleados = new Empleado[5];
    
    empleados[0] = new EmpleadoFijo("Juan", 1000, 100);
    empleados[1] = new EmpleadoPorHoras("Laura", 80, 10);
    empleados[2] = new EmpleadoPorHoras("Inés", 50, 10);
    empleados[3] = new EmpleadoPorHoras("Marta", 90, 10);
    empleados[4] = new EmpleadoFijo("Pablo", 1000, 500);
    
    //mostramos su información
    for (int i=0; i<empleados.length; i++){
        empleados[i].mostrarInfo();
    }
    
    
    
    
    
    }
}
