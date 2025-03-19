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

    // Función para comprobar que una matriz sea mágica
    public static boolean esMatrizMagica(int[][] matriz) {
        
        // Calculo la suma de la primera fila
        int sumaFila1 = matriz[0][0] + matriz[0][1];
        
        // Calculo la suma de la primera columna
        int sumaColumna1 = matriz[0][0] + matriz[1][0];

        // Verifico que la suma de la primera fila y la primera columna sean iguales
        if (sumaFila1 != sumaColumna1) {
            return false;
        }

        // Comprobamos la segunda fila y columna
        int sumaFila2 = matriz[1][0] + matriz[1][1];
        int sumaColumna2 = matriz[0][1] + matriz[1][1];

        // Comprobamos si todas las sumas son iguales
        return sumaFila1 == sumaFila2 && sumaFila1 == sumaColumna2;

    }

    public static void main(String[] args) {
        
    }
}