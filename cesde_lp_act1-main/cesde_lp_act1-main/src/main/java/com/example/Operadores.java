package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        // TODO
       int nota1 = 6;
        int  nota2 = 7;
        int nota3 = 10;
        int suma = nota1 + nota2 + nota3;
        int resta = nota1 -nota2 -nota3;
        int multiplica = nota1 *nota2 *nota3;
        int divide = nota1/nota2 /nota3;
        int modulo = nota1 % nota2 %nota3;
    }

    public static void demostrarIncrementoDecremento() {
        // TODO
        int numero1 = 30;
        int numero2 = 40;
         int totalSuma = numero1 + numero2;
         int totalResta = numero1 - numero2;
         int totalMultiplica = numero1 *numero2;
         int totalDivide = numero1 / numero2;
         int totalModula= numero1 % numero2; 

System.out.println("suma" + numero1 + "numero2" +"totalSuma");
System.out.println("suma" + numero1 + "numero2" +"totalResta");
System.out.println("suma" + numero1 + "numero2" +"totalMultiplica");
System.out.println("suma" + numero1 + "numero2" +"totalDivide");
System.out.println("suma" + numero1 + "numero2" +"totalModula");

         numero1++;
         numero2--;

    }

    public static void demostrarRelacionales() {
        // TODO
    }

    public static void demostrarLogicos() {
        // TODO
        int numero1 = 10;
        int numero2 = 50; 
        if (numero1<=10 && numero2>=50){
           System.out.println("accede al subsidio");
        }
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        Int edad = 18;
String palabra = (edad >=18)? "aplica a la beca": "no aplica a la beca";

    }
}