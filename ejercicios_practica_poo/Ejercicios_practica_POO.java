package com.mycompany.ejercicios_practica_poo;

public class Ejercicios_practica_POO {

    public static void main(String[] args) {
    
    //--------------------------------------------------------------------------------------------------------
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    //--------------------------------------------------------------------------------------------------------
    
    /*
    Esto deja de funcionar al realizar el ejercicio 3
    
    Book libro = new Book();
    libro.author = "Laura Gallego";
    libro.title = "La Emperatriz de los Etéreos";
    
    System.out.println(libro.author);
    System.out.println(libro.title);

    */
    
    //--------------------------------------------------------------------------------------------------------
    // 2. Crea una clase Dog con un método Bark() que imprima su sonido.
    //--------------------------------------------------------------------------------------------------------
    
    Dog dog = new Dog();
    dog.bark();
    
    //--------------------------------------------------------------------------------------------------------
    // 3. Añade un constructor a la clase Book que reciba title y author.
    //--------------------------------------------------------------------------------------------------------
    
    Book libro = new Book("Laura Gallego", "La Emperatriz de los Etéreos");
    libro.datosLibro();
    
    //--------------------------------------------------------------------------------------------------------
    // 4. Crea una clase Car con atributos brand y model y un método showData().
    //--------------------------------------------------------------------------------------------------------
    
    Car coche = new Car("Seat", "Ibiza");
    coche.showData();
    
    //--------------------------------------------------------------------------------------------------------
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 6).
    //--------------------------------------------------------------------------------------------------------
    
    Student est = new Student();
    est.score = 7;
    est.calcularNota();
    }
}
