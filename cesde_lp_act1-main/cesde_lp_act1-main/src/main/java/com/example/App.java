package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1. Variables y Constantes
        System.out.println("--- Tema: VariablesYConstantes ---");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();

      // 2. Tipos de Datos Primitivos
        System.out.println("\n--- Tema: TiposDeDatosPrimitivos ---");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();


        // 3. Conversión de Tipos
        System.out.println("\n--- Tema: ConversionDeTipos ---");
        ConversionDeTipos.demostrarCastingImplicitito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();


        // 4. Operadores
        System.out.println("\n--- Tema: Operadores ---");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadorTernario();


        // 5. Estructuras Condicionales
        System.out.println("\n--- Tema: EstructurasCondicionales ---");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpression();


        // 6. Estructuras de Repetición
        System.out.println("\n--- Tema: EstructurasDeRepeticion ---");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile(teclado,0);
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        EstructurasDeRepeticion.ejemploEtiquetas();



        // 7. Métodos Estáticos Simples
        System.out.println("\n--- Tema: MetodosEstaticosSimples ---");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros("Estudiante Java");
        int valorRetornado = MetodosEstaticosSimples.ejemploRetornoValores();
        System.out.println("Valor retornado: " + valorRetornado);
        MetodosEstaticosSimples.area(100);
        MetodosEstaticosSimples.area(60,100);

         //8. Arreglos Unidimensionales
        System.out.println("\n--- Tema: ArreglosUnidimensionales ---");
        ArreglosUnidimensionales.numeroMenor();
        ArreglosUnidimensionales.invertirArreglo();
        ArreglosUnidimensionales.recorrerConForEach();
        
    
 
        // 9. Arreglos Bidimensionales
        System.out.println("\n--- Tema: ArreglosBidimensionales ---");
        ArreglosBidimensionales.matriz2x2();
        ArreglosBidimensionales.matriz3x3();
       

        // 10. Manipulación de Cadenas
        System.out.println("\n--- Tema: ManipulacionCadenas ---");  
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.Inmutabilidad();
        ManipulacionCadenas.usarStringBuilder();
/* 
        // 11. Manejo Básico de Excepciones
        System.out.println("\n--- Tema: ManejoBasicoExcepciones ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();

        // 12. Entrada de Datos (Opcional/Comentado para evitar pausas en la calificación)
        /*
        System.out.println("\n--- Tema: EntradaDeDatos ---");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();
        */
        
        System.out.println("\n--- Fin de la Demostración ---");
    }
}