package menumatrices;

public class Main {

    // Función para multiplicar matrices
    public static int[][] multiplicarMatriz (int[][] matriz1, int [][]matriz2) {
        
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

    public static void main(String[] args) {
        
    }
}