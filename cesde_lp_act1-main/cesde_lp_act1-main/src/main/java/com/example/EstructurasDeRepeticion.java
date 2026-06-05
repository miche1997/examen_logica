package com.example;
import java.util.Scanner;



public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        int cuenta = 10;

        while (cuenta >= 1) {
            System.out.println(cuenta);
            cuenta--;
        }
    }

    public static void ejemploDoWhile(Scanner entrada) {
        int numero;
        do {
            System.out.println("ingresa un número");
            numero = entrada.nextInt();
        } while (numero != 0);
        System.out.println("ciclo finalizado");
    }

    public static void ejemploForClasico() {
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("tabla de multiplicar del " + i + "---");

            // Corrección: Quitamos el ';' y abrimos llaves para encerrar el bloque
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + "x" + j + "=" + resultado);
            } // Cerramos el bucle interno
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        // TODO
    }
}