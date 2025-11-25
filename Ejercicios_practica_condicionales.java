package com.mycompany.ejercicios_practica_condicionales;

import java.util.Scanner;

public class Ejercicios_practica_condicionales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //--------------------------------------------------------------------------------------------------------
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        
        if (edad<18){
            System.out.println("Menor de edad, no puede votar");
        }
        else{
            System.out.println("Mayor de edad, sí puede votar");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Escribe el segundo número: ");
        int num2 = sc.nextInt();
        
        if (num1!=num2){
            if (num1>num2){
                System.out.println("El primer número es mayor");
            }
            else if(num1<num2){
                System.out.println("El segundo número es mayor");
            }
        }
        else if(num1==num2){
            System.out.println("ambos números son iguales");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe un número: ");
        int num3 = sc.nextInt();
        
        if (num3!=0){
            if (num3>0){
                System.out.println("El número es positivo");
            }
            else if(num3<0){
                System.out.println("El número es negativo");
            }
        }
        else if(num3==0){
            System.out.println("El número es igual a 0");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 4. Crea un programa que diga si un número es par o impar.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe un número: ");
        int num4 = sc.nextInt();
        
        if (num4%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 5. Verifica si un número está en el rango de 1 a 100.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe un número: ");
        int num5 = sc.nextInt();
        
        if (num4>0 && num4<=100){
            System.out.println("El número está entre 1 y 100");
        }
        else{
            System.out.println("El número no está entre 1 y 100");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        //--------------------------------------------------------------------------------------------------------
        int diasem = 6;
        
        switch (diasem){
            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miércoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sábado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (1-10).
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe la nota: ");
        int nota = sc.nextInt();
        
        if (nota>8 && nota<=10){
            System.out.println("Sobresaliente");
        }
        else if (nota>5 && nota<=8){
            System.out.println("Aprobado");
        }
        else if (nota<5){
            System.out.println("Suspenso");
        }
        else{
            System.out.println("Error, nota incorrecta");
        }
        
        //--------------------------------------------------------------------------------------------------------
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        //--------------------------------------------------------------------------------------------------------
        
        int edadcine;
        String acompañado;
        
        System.out.println("Escribe tu edad: ");
        edadcine = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Vas acompañado? Contesta con Si o No: ");
        acompañado = sc.nextLine();
        
        if (edadcine>=15 || acompañado.equalsIgnoreCase("Si")){
            System.out.println("Puedes entrar");
        }
        else{
            System.out.println("No puedes entrar");
        }
        
        
        //--------------------------------------------------------------------------------------------------------
        // 9. Escribe un programa que diga si una letra es vocal o consonante.
        //--------------------------------------------------------------------------------------------------------
        
        System.out.println("Escribe una letra en minúscula: ");
        String letra = sc.nextLine();
        
        switch (letra){
            case "a":
                System.out.println("Vocal");
                break;
            case "e":
                System.out.println("Vocal");
                break;
            case "i":
                System.out.println("Vocal");
                break;
            case "o":
                System.out.println("Vocal");
                break;
            case "u":
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
        }  
    }
}
