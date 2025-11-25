package com.mycompany.ejercicios_practica_funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios_practica_funciones {

    public static void main(String[] args) {
    }
    
    
    //--------------------------------------------------------------------------------------------------------
    // 1. Crea una función que reciba un nombre como parámetro y salude a esa persona.
    //--------------------------------------------------------------------------------------------------------
        
    public static void saludo(String nombre){
        System.out.println("¡Hola " + nombre + "!");     
    }
        
    //--------------------------------------------------------------------------------------------------------
    // 2. Crea una función que reciba dos números enteros y devuelva su resta.
    //--------------------------------------------------------------------------------------------------------
    
    public static double resta(double num1, double num2){
        return num1-num2;
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 3. Crea una función que calcule el cuadrado de un número (n*n).
    //--------------------------------------------------------------------------------------------------------
    
    public static int cuadrado(int num3){
        return num3 * num3;
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 4. Crea una función que reciba un número y diga si es par o impar.
    //--------------------------------------------------------------------------------------------------------
    
    public static void parImpar(int num4){
        if (num4%2==0){
           System.out.println("El número es par"); 
        }
        else{
            System.out.println("El número es impar"); 
        }
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 5. Crea una función que reciba una edad y retorne true si es mayor de edad o false si es menor.
    //--------------------------------------------------------------------------------------------------------
    
    public static boolean edad(int edad){
        if (edad>=18){
           return true;
        }
        else{
           return false; 
        }
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 6. Crea una función que reciba una cadena y retorne su longitud.
    //--------------------------------------------------------------------------------------------------------
    
    public static int cadenaDeTexto(String cadena){
        return cadena.length();
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 7. Crea una función que reciba un array de enteros, calcule su media y la retorne.
    //--------------------------------------------------------------------------------------------------------
    
    public static double array(int[] numeros){
        double suma=0;
        
        for (int n:numeros){
            suma += n;
        }
        return suma/numeros.length;
    }
     
    //--------------------------------------------------------------------------------------------------------
    // 8. Crea una función que reciba un ArrayList<String> y lo retorne mostrando cada elemento.
    //--------------------------------------------------------------------------------------------------------
    
    public static void arrayList(ArrayList<String> texto){
        for (String n:texto){
            System.out.println(n);
        }
    }      
}
