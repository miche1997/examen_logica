package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        // TODO
        int edad = 18;
        if (edad >= 18) {
            System.out.println("puede votar ");
        }
    }

    public static void ejemploIfElse() {
        // TODO
        int edad = 18;
        if (edad <= 18) {
            System.out.println("no puede votar");
        }
    }

    public static void ejemploIfElseIfElse() {
        // TODO
    }

    public static void ejemploSwitch() {
        // TODO
        int dias = 7;
        switch (dias) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;

        }

    }

    public static void ejemploSwitchExpression() {
        // TODO
        String estacion = "verano";
       String estaciones = switch (estacion) {
            case 1 -> "Primavera"
            break;
            case 2 -> "invierno"
            break;
            case 3 -> "otoño" 
            break;
            case 4 -> "verano"
                break;
        
            default -> "estación invalida"
                break;
        }
    
    }
}