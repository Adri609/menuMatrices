## Función para pedir un número entero positivo al usuario:


```java
public static int pedirEnteroPositivo(String mensaje) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (read.hasNextInt()) {
                numero = read.nextInt();
                if (numero > 0) { 
                    break;
                } else {
                    System.out.println("Por favor, introduce un número mayor que 0.");
                }
            } else {
                System.out.println("Por favor, ingresa un número entero.");
                read.next();
            }
        }

        return numero;

    }
```

Esta función se utiliza para pedir al usuario un número entero positivo, asegurándose de que la entrada sea válida. Si el usuario introduce un valor no válido (ya sea un número negativo, un número decimal o cualquier tipo de dato no numérico), se le pedirá que lo vuelva a ingresar.

#### Parámetros:
- **mensaje**: Un `String` que se muestra al usuario para indicarle que debe introducir un número entero positivo. Este mensaje es personalizado y se pasa como argumento al llamar a la función.

#### Funcionamiento:
1. La función muestra el `mensaje` al usuario, indicando que debe introducir un número entero positivo.
2. Se utiliza un bucle `while(true)` para asegurar que la entrada sea válida. El bucle:
   - Vrifica si la entrada del usuario es un número entero usando `read.hasNextInt()`.
   - Si la entrada es un número entero, se comprueba si es mayor que 0. Si es positivo, se sale del bucle y se duevuelve el número en el `return`.
   - Si el número es negativo o cero, se muestra un mensaje de advertencia y se vuelve a solicitar la entrada.
   - Si el usuario introduce cualquier cosa que no sea un número entero, se muestra un mensaje de error y se limpia la entrada con `read.next()`.
   
#### Return:
- La función devuelve un `int` que es el número entero positivo ingresado por el usuario.

#### Ejemplo:

```java
int numero = pedirEnteroPositivo("Introduce un número entero positivo: ");
// Se llama a la función pedirEnteroPositivo("mensaje")
System.out.println("El número ingresado es: " + numero);
```

---

#### Función para pedir un número entero al usuario:

```java
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
```

Esta función hace lo mismo que la primera, la única diferencia es que esta permite al usuario 
ingresar números enteros.

---

## Función para rellenar matrices:


```java
public static int[][] rellenar () {

        int cont = 1;

        int filas = pedirEnteroPositivo("Introduce el número de filas de la matriz:");
        int columnas = pedirEnteroPositivo("Introduce el número de columnas de la matriz:");

        int[][] matriz = new int[filas][columnas];

            for(int i = 0; i < filas; i++){
                for (int j = 0; j < columnas; j++){
                    matriz[i][j] = pedirEntero("Introduce el valor "+ cont + " de la matriz");
                    cont++;
                }
            }

            return matriz;
    }
```


Esta función permite al usuario crear y rellenar una matriz de enteros. Primero, solicita al usuario el número de filas y columnas de la matriz y, después, le pide ingresar valores para cada una de sus posiciones.

#### Funcionamiento:
1. Se inicializa un contador `cont = 1`, que se usará para indicar el número del valor que se está pidiendo al usuario.
2. Se solicita al usuario el número de filas y columnas de la matriz mediante la función `pedirEnteroPositivo()`, para garantizar que los valores sean enteros positivos.
3. Se crea una matriz de enteros con las dimensiones ingresadas por el usuario.
4. Se rellena la matriz iterando sobre sus filas y columnas, solicitando al usuario los valores uno por uno mediante la función `pedirEntero()`.
5. Finalmente, se devuelve la matriz completada.

#### Parámetros:
Esta función no recibe parámetros, pero depende de la función `pedirEnteroPositivo()` para validar las dimensiones de la matriz y de `pedirEntero()` para obtener los valores de los elementos de la matriz.

#### Return:
- La función devuelve una matriz de tipo `int[][]` con los valores ingresados por el usuario.

#### Notas:

- La función garantiza que la matriz tenga dimensiones válidas, ya que impide que el usuario ingrese valores menores o iguales a cero.
- El contador cont se usa sólo para mostrar el número del valor que el usuario debe ingresar para guiarle.
- El contador está inicializado en el valor 1 ya que es incorrecto mostrarle al usuario que ingrese el valor 0.
- El contador se declara dentro de la función para que, de esta manera, se reinicie el valor cuando se vuelva a llamar a la función.

#### Ejemplo:

```java
public static void main(String[] args) {

    int[][] miMatriz = rellenar();
    
}
```

---

## Función para imprimir matrices:


```java
public static void imprimir (int[][] imprimir){
        
        for (int i = 0; i < imprimir.length; i++) {
            for (int j = 0; j < imprimir[0].length; j++){
                System.out.print(imprimir[i][j]+" ");
            }
            System.out.println("");   
        }
    }
```

Esta función se encarga de mostrar en consola una matriz de enteros de manera estructurada, facilitando su visualización.

#### Funcionamiento:
1. La función recibe una matriz de enteros `int[][] imprimir` como parámetro.
2. Recorre cada fila y columna de la matriz usando dos bucles `for` anidados.
3. Imprime cada elemento de la matriz seguido de un espacio (`" "`).
4. Al finalizar cada fila, imprime un salto de línea (`System.out.println("");`) para estructurar la salida en forma de matriz.

#### Parámetros:
- **`imprimir`**: Matriz de tipo `int[][]` que se desea mostrar por consola.

#### Return:
- Esta función **no devuelve ningún valor** (`void`), ya que sólo imprime la matriz.

#### Ejemplo de uso:

```java
public static void main(String[] args) {
    int[][] matrizEjemplo = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    imprimir(matrizEjemplo);
    // Se llama a la función: imprimir(matriz1imprimir);
}
```
---

## Función para multiplicar matrices:


```java
public static int[][] multiplicarMatriz (int[][] matriz1, int[][] matriz2) {
        
        if (matriz1[0].length != matriz2.length) {
            throw new IllegalArgumentException("El número de columnas de la primera debe ser igual al número de filas de la segunda.");
        }

        int[][] matrizMultiplicada = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int n = 0; n < matriz1[0].length; n++) {
                    matrizMultiplicada[i][j] += matriz1[i][n] * matriz2[n][j];
                }
            }
        }

        return matrizMultiplicada;
    }
```

Esta función realiza la multiplicación de dos matrices de enteros, verificando que sean compatibles.

#### Funcionamiento:

#### Verificación de compatibilidad:
Antes de realizar la multiplicación, la función verifica que las dimensiones sean adecuadas. Para que dos matrices puedan multiplicarse, el número de columnas de la primera matriz (`matriz1`) debe ser igual al número de filas de la segunda (`matriz2`).  
Si esta condición no se cumple, se lanza una excepción `IllegalArgumentException`.

#### Inicialización de la matriz resultante:
Se crea una nueva matriz `matrizMultiplicada`, cuyas dimensiones serán:
- Filas: igual a las de `matriz1`
- Columnas: igual a las de `matriz2`

Cuando multiplicamos dos matrices, la cantidad de filas de la primera se mantiene, y la cantidad de columnas de la segunda también. Si la primera matriz (A) tiene m filas y n columnas, y la segunda matriz (B) tiene n filas y p columnas, la matriz resultante (C) tendrá m filas y p columnas.

---

#### Explicación de los bucles anidados:
La multiplicación de matrices se realiza usando **tres bucles anidados**:

```java
for (int i = 0; i < matriz1.length; i++) { // Recorre las filas de la matriz1
    for (int j = 0; j < matriz2[0].length; j++) { // Recorre las columnas de la matriz2
        for (int n = 0; n < matriz1[0].length; n++) { // Recorre las columnas de matriz1 y filas de matriz2
            matrizMultiplicada[i][j] += matriz1[i][n] * matriz2[n][j]; // Multiplica y acumula
        }
    }
}
```

#### Parámetros:
- **`matriz1`**: Matriz de tipo `int[][]` (matriz A) que será multiplicada.
- **`matriz2`**: Matriz de tipo `int[][]` (matriz B) que será multiplicada.

#### Return:
- Devuelve una nueva matriz de tipo `int[][]` que contiene el resultado de la multiplicación.

#### Ejemplo de uso:

```java
public static void main(String[] args) {
    int[][] matriz1 = {
        {1, 2, 3},
        {4, 5, 6}
    };

    int[][] matriz2 = {
        {7, 8},
        {9, 10},
        {11, 12}
    };

    int[][] resultado = multiplicarMatriz(matriz1, matriz2);

    // Mostrar la matriz resultante
    imprimir(resultado);
}
```

---

## Función para sumar matrices:


```java
public static int[][] sumarMatriz (int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices tienen diferentes dimensiones");
        }
    
        int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) { 
            for (int j = 0; j < matriz1[0].length; j++) { 
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    
    return sumaMatriz;

    }
```


La función `sumarMatriz` permite sumar dos matrices de enteros, siempre que tengan las mismas dimensiones. Devuelve una nueva matriz con los valores resultantes de la suma de las matrices proporcionadas.

#### Funcionamiento:  
1. La función comprueba que ambas matrices tengan el mismo número de filas y columnas. Si no es así, lanza una excepción `IllegalArgumentException`.  
2. Crea una nueva matriz `sumaMatriz` con las mismas dimensiones que las matrices de entrada.  
3. Itera sobre las filas y columnas de las matrices para sumar sus elementos correspondientes y almacenar el resultado en la nueva matriz.  
4. Finalmente, devuelve la matriz resultante con la suma de las dos matrices.

#### Parámetros:  
- `matriz1` (`int[][]`): Primera matriz de enteros.  
- `matriz2` (`int[][]`): Segunda matriz de enteros.  

#### Return:  
- Devuelve la matriz `sumaMatriz` con el resultado de la suma de `matriz1` y `matriz2`.

#### Excepciones:  
- `IllegalArgumentException`: Se lanza la excepción si las matrices no tienen las mismas dimensiones.

#### Ejemplo de uso:  

```java
public static void main(String[] args) {
    int[][] matriz1 = {
        {1, 2, 3},
        {4, 5, 6}
    };

    int[][] matriz2 = {
        {7, 8, 9},
        {10, 11, 12}
    };

   // Se llama a la función para sumar las dos matrices
    int[][] resultado = sumarMatriz(matriz1, matriz2);

    // Se imprime el resultado
    imprimir(resultado);

}
```

---

## Función para restar matrices:


```java
public static int[][] restarMatriz (int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices tienen diferentes dimensiones");
        }
    
        int[][] restaMatriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) { 
            for (int j = 0; j < matriz1[0].length; j++) { 
                restaMatriz[i][j] = matriz1[i][j] - matriz2[i][j]; 
            }
        }
    
    return restaMatriz;

    }
```

 #### Funcionamiento:

 Funciona exactamente igual que la función `sumarMatriz` pero cambiando el operando `+` en la siguiente línea:

 ```java
 sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
 ```

 por un `-`:

 ```java
 restaMatriz[i][j] = matriz1[i][j] - matriz2[i][j];
 ```

 ---

 ## Función para comprobar si una matriz es mágica:

 ```java
 
 ```

 #### Descripción:  
La función `magica` permite verificar si una matriz es una *matriz mágica*. Una matriz se considera mágica si es cuadrada (tiene el mismo número de filas y columnas) y la suma de todos sus elementos en filas y columnas es la misma.

#### Funcionamiento:  
1. Primero, se verifica si la matriz es cuadrada. Si no lo es, la función retorna `false`.  
2. Se calculan las sumas de cada fila y cada columna de la matriz.  
3. Se guarda la suma de la primera fila como referencia.  
4. Se compara la suma de cada fila y cada columna con la referencia. Si alguna suma no coincide con la referencia, la función retorna `false`.  
5. Si todas las filas y columnas tienen la misma suma, la función retorna `true`, indicando que la matriz es mágica.

#### Parámetros:  
- `matriz` (`int[][]`): Matriz de enteros que se va a verificar.

#### Valor de retorno:  
- `boolean`:  
  - `true`: Si la matriz es mágica.  
  - `false`: Si la matriz no es mágica o no es cuadrada.

#### Ejemplo de uso:  

```java
public static void main(String[] args) {
    int[][] matriz = {
        {2, 7, 6},
        {9, 5, 1},
        {4, 3, 8}
    };

    // Se llama a la función
    boolean esMagica = magica(matriz);

    System.out.println("La matriz es mágica: " + esMagica);  // Debería imprimir: true
}
```

#### Nota:

- El mensaje que daremos al usuario con el Sout se personalizará en el switch case dentro del main para que el usuario tenga una salida clara y limpia
ya que en este caso simplemente le devolverá true o false por consola

---

### Importante:

- Para que funcionen todos los métodos hay que declarar el Scanner antes de las funciones por eso en el código `Main.java` lo tengo declarado dentro de la clase como:

```java
private static Scanner read = new Scanner(System.in);
```