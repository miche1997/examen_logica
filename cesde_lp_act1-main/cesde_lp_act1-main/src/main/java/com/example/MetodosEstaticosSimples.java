package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("========================================");
        System.out.println("===    BIENVENIDO A JAVA    ===");
        System.out.println("========================================");
    }

    public static String   ejemploPasoParametros(String nombre) {
        // TODO
        return  "Estimado " + nombre + ", es un placer saludarle.";
    }

    public static int ejemploRetornoValores() {
        // TODO
        return 0;
    }

    //cuadrado
    public static int area(int lado) {
        return lado * lado;
    }
    //triangulo
    public static int area(int base, int altura) {
        return base * altura;
    }
}