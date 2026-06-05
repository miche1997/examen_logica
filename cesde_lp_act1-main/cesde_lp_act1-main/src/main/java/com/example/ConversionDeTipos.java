package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {

        int y = 20;
        double x = (double) y;
        System.out.println("y (int)"+y);
        System.out.println("valor convertido (double)"+x);
    }

    public static void demostrarCastingExplicito() {

        double x = 3.5;
        int y = (int) x;

        System.out.println("Double: "+x);
        System.out.println("Casting de double a int: "+y);
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        long cantidadEstrellas = 10000000000L;
        short cantidadProductos = (short)cantidadEstrellas;

        System.out.println(cantidadEstrellas);
        System.out.println(cantidadProductos);

    }
}