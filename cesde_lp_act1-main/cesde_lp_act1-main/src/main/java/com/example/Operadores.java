package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        // TODO
       int nota1 = 6;
       int nota2 = 7;
       int nota3 = 10;

       double promedioNota = (nota1+nota2+nota3)/3;
        System.out.println("promedio nota: "+promedioNota);
    }

    public static void demostrarIncrementoDecremento() {
        // TODO
        int numero = 40;



        System.out.println(numero++);
        System.out.println(++numero);


    }

    public static void demostrarRelacionales() {
        // TODO
    }

    public static void demostrarLogicos() {
        // TODO
        int numero1 = 10;
        int numero2 = 50;

        if (numero1<=10 && numero2>=50){
           System.out.println("Validar si esta entre 10 y 50");
        }
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        int edad = -18;
        String resultado = (edad > 0) ? "Positivo" : (edad < 0) ? "Negativo" : "Es Cero";
        System.out.println("Resultado: " + resultado);
    }
}