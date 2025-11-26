package com.mycompany.ejercicios_practica_poo;

public class Book {
    
    //Ejercicio 1
    String title;
    String author;
    
    //Ejercicio 3
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    
    public void datosLibro(){
        System.out.println("Título: " + title);
        System.out.println("Autor/a: " + author);
    }
    
}
