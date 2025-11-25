package com.mycompany.ejercicios_practica_arrays;

import java.util.Scanner;

public class Ejercicios_practica_arrays {

    public static void main(String[] args) {
        
        //--------------------------------------------------------------------------------------------------------
        // 1. Crea un Array con 5 valores, imprime su longitud y suma todos sus elementos.
        //--------------------------------------------------------------------------------------------------------
        
        int[] array = {1,2,3,4,5};
        System.out.println("Longitud del Array: " + array.length);
        
        System.out.println("Suma de elementos:");
        int total=0;
        for (int i=0; i<array.length; i++){
            total += array[i];
        }
        
        System.out.println("Total: " + total);
        
        //--------------------------------------------------------------------------------------------------------
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Valor inicial del índice 2: " + array[2]);
        array[2] = 8;
        System.out.println("Valor final del índice 2: " + array[2]);
        
        //--------------------------------------------------------------------------------------------------------
        // 3. Dado un array de números enteros, muestra el valor máximo y mínimo sin usar librerías adicionales.
        //--------------------------------------------------------------------------------------------------------
        
        int[] array2 = {10,89,22,0,24,14,35,62};
        
        int max = array2[0];
        int min = array2[0];
        
        for (int a : array2){
            if (a > max){
                max = a;
            }
            if (a < min)
            {
                min = a;
            }
        }
        System.out.println("Número más alto: " + max);
        System.out.println("Número más bajo: " + min);
        
        
        //-------------------------------------------------------------------------------------------------------------
        // 4. Pide 10 números y luego pide otro número adicional. Indica cuántas veces aparece ese número en el array.
        //-------------------------------------------------------------------------------------------------------------
        
        Scanner sc = new Scanner(System.in);
        
        int array3[] = new int[10];
        
        System.out.println("Escribe 10 números para almacenar en el array: ");
        int pos = 0; //posición del array
        
        for (int i=0; i<array3.length; i++){
            System.out.println("Posición " + pos + ":");
            array3[i]=sc.nextInt();
            pos++;
        }
        
        System.out.println("Escribe otro número: ");
        int numarray3 = sc.nextInt();
        int rep = 0; //veces que se repite el número
        
        for (int n : array3){
            if (n == numarray3){
                rep++;
            }
        }
        System.out.println("Veces que se repite: " + rep);
      
        //--------------------------------------------------------------------------------------------------------
        // 5. Escribe un programa que invierta el contenido de un array.
        //--------------------------------------------------------------------------------------------------------
        
        int array4[] = {1,2,3,4,5,6,7,8,9};
        int array4invertido[] = new int[array4.length];
        
        /* Imprimimos el Array normal */
        System.out.print("Array normal: ");
        for (int i=0; i<array4.length; i++){
            System.out.print(array4[i] + " ");
        }
        
         /* Metemos los valores en el Array invertido */
        for (int i=0; i<array4invertido.length; i++){
            array4invertido[i] = array4[array4.length -1 -i]; 
        }
        
        /* Imprimimos el valor invertido */
        System.out.println(" ");
        System.out.print("Array invertido: ");
        for (int i=0; i<array4invertido.length; i++){
            System.out.print(array4invertido[i] + " ");
        }  
    }
}
