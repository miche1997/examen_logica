package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        int y = 20;
        double x = y;
    }

    public static void demostrarCastingExplicito() {
        // TODO
        double x = 3.5;
        int y = (int) x;
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        long cantidadEstrellas = 10000000000L;
        short cantidadProductos = (short)cantidadEstrellas;
    }
}