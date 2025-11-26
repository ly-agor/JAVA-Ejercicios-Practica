package com.mycompany.ejercicios_practica_poo;

public class Student {
    double score;
    
    public void calcularNota(){
        if (score>=6 && score<=10){
            System.out.println("Aprobado");
        }
        else if (score>=0 && score<=5){
            System.out.println("Suspenso");
        }
        else{
            System.out.println("ERROR: la calificación introducida es incorrecta");
        }
    }
}
