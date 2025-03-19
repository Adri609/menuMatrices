package menumatrices;

import java.util.Scanner;

public class Main {
    
    private static Scanner read = new Scanner(System.in);
    

    // Función para pedir al usuario números enteros positivos
    public static int pedirEnteroPositivo(String mensaje) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (read.hasNextInt()) { // Verifico si la entrada es un número entero
                numero = read.nextInt();
                if (numero > 0) { // Verifico que sea positivo
                    break;
                } else {
                    System.out.println("Por favor, introduce un número mayor que 0.");
                }
            } else {
                System.out.println("Entrada inválida. Debes ingresar un número entero.");
                read.next(); // Limpio la entrada
            }
        }

        return numero;

    }

    // Misma función de antes pero permitiendo cualquier número
    public static int pedirEntero(String mensaje) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (read.hasNextInt()) { 
                numero = read.nextInt();
                break; 
            } else {
                System.out.println("Entrada inválida. Debes ingresar un número entero.");
                read.next(); 
            }
        }

        return numero;

        }

    // Función para rellenar matrices
    public static int[][] rellenar () {

        int cont = 1;

        // Pido el número de filas y columnas de la matriz
        int filas = pedirEnteroPositivo("Introduce el número de filas de la matriz:");
        int columnas = pedirEnteroPositivo("Introduce el número de columnas de la matriz:");

        // Inicio la matriz con el número de filas y columnas declarado y la rellenamos con números pedidos al usuario
        int[][] matriz = new int[filas][columnas];

            for(int i = 0; i < filas; i++){
                for (int j = 0; j < columnas; j++){
                    matriz[i][j] = pedirEntero("Introduce el valor "+ cont + " de la matriz");
                    cont++;
                }
            }

            return matriz;
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
            throw new IllegalArgumentException("El número de columnas de la primera debe ser igual al número de filas de la segunda.");
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

    // Aquí iría la función para comprobar que una matriz sea mágica si supiese hacerla

    public static void main(String[] args) {

        int opcion; 

        //Declaro, relleno e imprimo en pantalla la matriz 1
        int[][] matriz1 = rellenar();
        imprimir(matriz1);

        // Declaro, relleno e impmrimo en pantalla la matriz 2
        int[][] matriz2 = rellenar();
        imprimir(matriz2);

        do {
            System.out.println("\n1- Sumar matrices.");
            System.out.println("2- Restar matrices.");
            System.out.println("3- Multiplicar matrices.");
            System.out.println("4- Comprobar si una matriz es mágica.");
            System.out.println("5- Salir.");
            opcion = pedirEnteroPositivo("\nElije una opción:");
        
            switch(opcion) {
                case 1:
                    imprimir(sumarMatriz(matriz1, matriz2));
                    break;
                case 2:
                    imprimir(restarMatriz(matriz1, matriz2));
                    break;
                case 3:
                    imprimir(multiplicarMatriz(matriz1, matriz2));
                    break;
                case 4:
                    System.out.println("Opción no implementada, disculpe las molestias.\n");
                    break;
                case 5:
                    System.out.println("Saliendo del programa, hasta luego.\n");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.\n");
            }
        } while (opcion != 5);
    }
}