package com.example;

public class TiposDeDatosPrimitivos {


    public static void demostrarEnteros() {

        byte cuaderno  =125;
        short ano=2025;
        int numeroPersonas =300000 ;
        long numeroEstrellas =999349999L ;

        System.out.println("cuaderno = " + cuaderno);
        System.out.println("ano = " + ano);
        System.out.println("numeroPersonas = " + numeroPersonas);
        System.out.println("numeroEstrellas = " + numeroEstrellas);

    }

    public static void demostrarFlotantes() {

        float cafe1 = 3.50f;
        double cafe = 2.5;
        System.out.println("float "+cafe1 +"double "+ cafe);
    }

    public static void demostrarCaracteres() {

        char miInicial = 'm';
    }

    public static void demostrarBooleanos() {
        char miInicial = 'M';
        boolean estadoLuz = true;;
        System.out.println(miInicial+" luz encendida:"+ estadoLuz);
    }

    public static void demostrarValoresPorDefecto() {
        String nombre;
        // da error si es string y no se inializa
    }

}