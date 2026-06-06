package com.example;

public class ArreglosUnidimensionales {
    public static void numeroMenor() {
        
        int [] numeros = { 1,20,3,4,11,6,7,8,9,10 };
        int numeroMenor = numeros [0];
        
        for (int menor : numeros) {
            if (menor < numeroMenor) {
                numeroMenor = menor;
            }
        }
        System.out.println("el numero menor es : " +numeroMenor);
    }

    public static void mostrarLongitud() {
        // TODO
    }

    public static void invertirArreglo() {
        // TODO
         int [] numeros = { 1,20,3,4,11,6,7,8,9,10 };
        
         for (int  invertir = numeros.length -1 ; invertir >= 0; invertir--) {
            System.out.println(numeros[invertir]);
         }
        
        
    }

    public static void recorrerConForEach() {
        // TODO
        String [] peliculasFavoritas ={
            "twilight",
            "la vida es bella",
            "dumbo",
            "yo antes de ti",
            "supernatural"
        };
        for (String pelicula : peliculasFavoritas) {
            System.out.println("las peliculas son: " + pelicula);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // TODO
        return array;
    }
}