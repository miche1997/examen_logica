package com.example;

public class ArreglosBidimensionales {
    public static void matriz2x2() {
        // TODO
        int [] [] matriz2x2 ={
            {1,2}, {3,4}
        };
        for (int i = 0; i < matriz2x2.length; i++) {


           for (int k = 0; k < matriz2x2[i].length; k++) {
            System.out.print(matriz2x2[i][k] + " ");
           } 
           System.out.println();
        }

    }

    public static void matriz3x3() {
        // TODO
        int contador = 0;
         int [] [] matriz3x3 ={
            {1,2,3}, {4,5,6} ,{7,8,9}
        };
        for (int i = 0; i < matriz3x3.length; i++) {


           for (int k = 0; k < matriz3x3[i].length; k++) {
            contador += matriz3x3[i][k];
           } 
           System.out.println();
        }
        System.out.println("la suma total de una matriz3x3 es : " + contador);
    }

    public static void ejemploUsosTipicos() {
        // TODO
    }
}