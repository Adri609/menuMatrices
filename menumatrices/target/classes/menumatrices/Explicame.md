### Función para pedir un número entero positivo al usuario

Esta función se utiliza para pedir al usuario un número entero positivo, asegurándose de que la entrada sea válida. Si el usuario introduce un valor no válido (ya sea un número negativo, un número decimal o cualquier tipo de dato no numérico), se le pedirá que lo intente nuevamente.

#### Parámetros:
- **mensaje**: Un `String` que se muestra al usuario para indicarle que debe introducir un número entero positivo. Este mensaje es personalizado y se pasa como argumento al llamar a la función.

#### Funcionamiento:
1. La función muestra el `mensaje` al usuario, indicando que debe introducir un número entero positivo.
2. Se utiliza un bucle `while(true)` para asegurar que la entrada sea válida. El bucle:
   - Vrifica si la entrada del usuario es un número entero usando `read.hasNextInt()`.
   - Si la entrada es un número entero, se evalúa si es mayor que 0. Si es positivo, se sale del bucle y se duevuelve el número en el `return`.
   - Si el número es negativo o cero, se muestra un mensaje de advertencia y se vuelve a solicitar la entrada.
   - Si el usuario introduce cualquier cosa que no sea un número entero, se muestra un mensaje de error y se limpia la entrada con `read.next()` para continuar con el proceso.
   
#### Return:
- La función retorna un `int` que es el número entero positivo ingresado por el usuario.

#### Ejemplo de uso:

```java
Scanner read = new Scanner(System.in);
int numero = pedirEnteroPositivo("Introduce un número entero positivo: ");
System.out.println("El número ingresado es: " + numero);
```