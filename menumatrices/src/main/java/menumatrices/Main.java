package menumatrices;

import java.util.Scanner;

public class Main {
    
    private static Scanner read = new Scanner(System.in);
    private static int filas, columnas, cont = 0;
    private static int[][] matriz1;
    private static int[][] matriz2;

    // Función para rellenar matrices
    public static void rellenar (int[][] matriz) {

        System.out.println("Introduce el número de filas de la matriz:");
        filas = read.nextInt();
        System.out.println("Introduce el número de columnas de la matriz:");
        columnas = read.nextInt();

        // Iniciamos la matriz con el número de filas y columnas declarado y la rellenamos con valores pedidos al usuario
        matriz = new int[filas][columnas];
            for(int i = 0; i < filas; i++){
                for (int j = 0; j < columnas; j++){
                    cont++;
                    System.out.println("Introduce el valor "+ (cont + 1) + " de la matriz");
                    matriz[i][j] = read.nextInt();
                }
            }
    }

    // Función que imprime matrices   
    public static void imprimir (int[][] imprimir){
        for (int i = 0; i < imprimir.length; i++) {
            for (int j = 0; j < imprimir[0].length; j++){
                System.out.print(imprimir[i][j]+" ");
            }
            System.out.println("");   
        }
    }

    // Función para multiplicar matrices
    public static int[][] multiplicarMatriz (int[][] matriz1, int[][] matriz2) {
        
        // Compruebo que las matrices se puedan multiplicar
        if (matriz1[0].length != matriz2.length) {
            throw new IllegalArgumentException("Las matrices tienen diferentes filas o columnas");
            // En caso de que no se puedan multiplicar, lanzo una excepción
        }

        // Se multiplican las matrices en una matriz nueva
        int[][] matrizMultiplicada = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) { // Recorro las filas de la matriz 1
            for (int j = 0; j < matriz2[0].length; j++) { // Recorro las columnas de la matriz 2
                for (int n = 0; n < matriz1[0].length; n++) { // Recorro las columnas de la matriz 1
                    matrizMultiplicada[i][j] += matriz1[i][n] * matriz2[n][j]; // Multiplico y sumo
                }
            }
        }

        return matrizMultiplicada;
    }

    // Función para sumar matrices
    public static int[][] sumarMatriz (int[][] matriz1, int[][] matriz2) {

        // Compruebo que las matrices tengan el mismo número de filas y columnas
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices tienen diferentes dimensiones");
        }
    
        int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) { 
            for (int j = 0; j < matriz1[0].length; j++) { 
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j]; // Sumar elemento a elemento
            }
        }
    
    return sumaMatriz;

    }

    // Función para restar matrices
    public static int[][] restarMatriz (int[][] matriz1, int[][] matriz2) {

        // Compruebo que las matrices tengan el mismo número de filas y columnas
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices tienen diferentes dimensiones");
        }
    
        int[][] restaMatriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) { 
            for (int j = 0; j < matriz1[0].length; j++) { 
                restaMatriz[i][j] = matriz1[i][j] - matriz2[i][j]; // Resta elemento a elemento
            }
        }
    
    return restaMatriz;

    }

    // Función para comprobar que una matriz sea mágica
    public static boolean magica(int[][] matriz) {
        
        int sumaColumnas[] = new int[matriz[0].length];
        int sumaFilas = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFilas += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
       
    }

    // Función para iniciar matrices

    public static void main(String[] args) {
        
        int opcion; 
        // Relleno e imprimo en pantalla la matriz 1
        rellenar(matriz1);
        imprimir(matriz1);

        // Relleno e impmrimo en pantalla la matriz 2
        rellenar(matriz2);
        imprimir(matriz2);

        do {
            System.out.println("Elije una opción: /n");
            opcion = read.nextInt();
            System.out.println("1- Sumar matrices.");
            System.out.println("2- Restar matrices.");
            System.out.println("3- Multiplicar matrices.");
            System.out.println("4- Comprobar si una matir es mágica");
            System.out.println("5- Salir");

        } while (opcion > 0 || opcion < 5);

        switch(opcion) {
            case 1:
            sumarMatriz(matriz1, matriz2);
            break;
            case 2:
            restarMatriz(matriz1, matriz2);
            break;
            case 3:
            multiplicarMatriz(matriz1, matriz2);
            break;
            case 4:
            System.out.println("De que matriz quieres ");
        }
    }

}