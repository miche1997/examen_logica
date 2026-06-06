package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        // TODO
    }

    public static void demostrarMetodosUtiles() {
        // TODO
        String texto = "los animales son seres de luz ";
         String fraseLimpia = texto.trim();
         String fraseRemplazo = fraseLimpia.replace("animales", "angeles");
        String [] dividirPalabra = fraseRemplazo.split(" ");
      for (String  recorrer : dividirPalabra) {
        System.out.print(" "+ recorrer);
      }
    }

    public static void Inmutabilidad() {
        // TODO
        String nombre = "maria perez";
        System.out.println("texto original"+nombre + "cambio string"+nombre.toUpperCase());
    }

    public static void usarStringBuilder() {
        // TODO
        String [] frutas = {
            "manzana", "pera","uva", "melocoton", "guayaba", "arandano"
        };
        StringBuilder unirParrafo = new StringBuilder();

        for (String  parrafo : frutas) {
            unirParrafo.append(parrafo).append(" ");
        }
        System.out.println(unirParrafo);
    }
}