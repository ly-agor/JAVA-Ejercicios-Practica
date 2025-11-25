package com.mycompany.ejercicios_practica_funciones2;

import java.util.ArrayList;

public class Ejercicios_practica_funciones2 {

    public static void main(String[] args) {
        
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 1. Crea una función que reciba un String y devuelva el número de vocales.
    //--------------------------------------------------------------------------------------------------------
    
    public static int vocales(String cadena){
        int vocales=0;
        int contador=0;
        
        cadena=cadena.toLowerCase(); //Pasamos la cadena a minúsculas para que no haya fallos
        
        for (int i=0; i<cadena.length(); i++){
            char c = cadena.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        
        return contador;  
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 2. Crea una función que reciba un Array de enteros y devuelva el número mayor y el número menor.
    //--------------------------------------------------------------------------------------------------------
    
    public static void numMaxMin(int[] numeros){
        int max=numeros[0];
        int min=numeros[0];
        
        for (int n:numeros){
            if (n<min){
                min=n;
            }
            if (n>max){
                max=n;
            }
        }
        System.out.println("Número mayor: " + max);
        System.out.println("Número menor: " + min);
    }
    
    //--------------------------------------------------------------------------------------------------------
    // 3. Crea una función que reciba un Array y un número y devuelva cuántas veces se repite ese número.
    //--------------------------------------------------------------------------------------------------------
    
    public static int numRepetido(int[] numeros, int num){
        int contador=0;
        for (int n:numeros){
            if (n==num){
                contador++;
            }
        }
        return contador;   
    }
    
    //---------------------------------------------------------------------------------------------------------------------------
    // 4. Crea una función que reciba un ArrayList<Integer> y devuelva true si el número está en la lista y false si no lo está.
    //---------------------------------------------------------------------------------------------------------------------------
    
    public static boolean numLista(ArrayList<Integer> numeros2, int num){
        for (int n:numeros2){
            if (n==num){
                return true;
            }
        }
        return false;
    }
}
