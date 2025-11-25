package com.mycompany.ejercicios_practica_arrays2;

import java.util.Scanner;

public class Ejercicios_practica_arrays2 {

    public static void main(String[] args) {
        
        
        //------------------------------------------------------------------------------------------------------------------------------
        // 1. Pide al usuario 10 números, pide un índice y elimina el elemento en esa posición. “Cierra el hueco” desplazando el resto.
        //------------------------------------------------------------------------------------------------------------------------------
        
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[10];
        
        System.out.println("Escribe 10 números para almacenar en el array: ");
        int pos = 0; //posición del array
        
        for (int i=0; i<array.length; i++){
            System.out.println("Posición " + pos + ":");
            array[i]=sc.nextInt();
            pos++;
        }
        
        System.out.println("Escribe un índice para eliminar: ");
        int idx = sc.nextInt();
        
        for (int i=idx; i<array.length-1; i++){
            array[i]=array[i+1];
        }
        
        System.out.print("Array nuevo: ");
        for (int i=0; i<array.length-1; i++){
            System.out.print(array[i] + " ");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 2. En un array de tamaño 10, pide un número y una posición donde insertarlo, desplazando los demás.
        //--------------------------------------------------------------------------------------------------------
        
        int array2[] = new int[10];
        
        System.out.println("Escribe 10 números para almacenar en el array 2: ");
        int pos2 = 0; //posición del array
        
        for (int i=0; i<array2.length; i++){
            System.out.println("Posición " + pos2 + ":");
            array2[i]=sc.nextInt();
            pos2++;
        }
        
        System.out.println("Escribe un número para insertar: ");
        int numnuevo = sc.nextInt();
        
        System.out.println("Escribe el índice donde quieras insertarlo: ");
        int idx2 = sc.nextInt();
        
        /* Creamos otro Array con una posición extra para que entre el nuevo número y le metemos los valores del Array anterior */
        int array3[] = new int[11];
        
        for (int i=0; i<array2.length; i++){ /* Metemos los valores y dejamos el último índice vacío */
            array3[i]=array2[i];
        }
        
       
        if (idx2>=0 && idx2<10){
            for (int i=array2.length -1; i>=idx2; i--){
                array3[i+1]=array3[i];  
            }
            array3[idx2]=numnuevo;
        }
        else{
            System.out.println("ERROR: Índice no válido");
        }
        
        System.out.print("Array nuevo: ");
            for (int n : array3) {
                System.out.print(n + " ");
            }    
    }
}
