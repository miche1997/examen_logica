package com.example;



public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        

        int edad = 30;
        double estatura = 1.8;
        System.out.println(edad);
        System.out.println(estatura);
    }
    public static void demostrarConvencionesNombres() {
      String nombreEstudiante;
      int edadEstudiante;

    }

    public static void demostrarConstantes() {

        final double PI = 3.14159;
        // DA ERROR POR QUE ES UNA CONSTANTE Y NO SE SOBREESCRIBEN SUS VALORES.  PI = 2000;
    }
}