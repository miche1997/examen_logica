package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner leer = new Scanner (System.in);
        System.out.println("escriba su nombre completo ");
        String nombre = leer.nextLine();
        System.out.println("escriba numero decimal");
       double  numero = leer.nextDouble();
       
    }

    public static void manejarSaltoDeLineaPendiente() {
        
    }
}