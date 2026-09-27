## <center> Taller 1: Vectores y Matrices </center>
### por: Juan Sebastián Mejía Gómez
### Grupo: `Programación II – FI200007 – Grupo 413`

#### PARTE 1:
#### 1. ¿Cuál es la diferencia entre un vector (arreglo de una dimensión) y una matriz (arreglo de dos dimensiones) en Java? Escribe un ejemplo de declaración de cada uno.

la mayor diferencia son sus dimensiones, entonces una es como un arreglo de arreglos, por lo mismo para acceder al
"arreglo de arreglos" toca darle dos indices para hallar el punto de memoria que queremos manipular
```java
int[] arrayPrueba = new int[5]; //aqui declaramos la longitud que va a tener
String[] arrayPrueba2 = {"prueba1", "prueba2", "prueba3", "prueba4", "prueba5"} //tambien podemos declararlo con los valores "quemados"
//ya accedemos a los varoles del array con un indice o posicion en el: arrayPrueba2[1] = prueba2
```
````java
//agora la matriz
int[][] tablaPrueba = new int[3][4];
int[][] tablaPrueba2 = {
        {1, 2, 3}, //esta son las fila
        {4, 5, 6} // aqui la otra, y pues se entiende que son un 3 x 2
};
// y lo mismo para acceder lo hacemos (fila x columna), entonces para el 6 seria tablaPrueba2[1][2] iniciando tambien desde 0
````
  
#### 2. ¿Qué instrucción usarías para conocer cuántos elementos tiene un vector? ¿Y cuántas filas y columnas tiene una matriz?

el vector es muy facil, con el ``.length`` podemos saber la longitud del array  
con las matrices es mas dificil, porque tienen arrays dentro de un array: para conocer las filas, podemos hacer 
el mismo `.length` ya para conocer una columna toca primero haceder a una fila en concreto y tomar la funcion `.length`
algo asi: `matrizPrueba[0].legth` por lo genereal se hace con la primera fila porque pues todas las filas tienen la
misma cantidad de columnas

#### 3. ¿Qué es el objeto Scanner y para qué se usa? Menciona al menos dos de sus métodos (por ejemplo, para leer un número entero y para leer un texto) y explica la diferencia entre ellos

nos sirve para capturar datos del cliente por medio de la consola, por ejemplo:  
`nextInt()` : para numero enteros  
`nextLine()` : para los cadenas de texto

##### 4. ¿Qué ocurre si tu programa intenta acceder a una posición de un vector que no existe (por ejemplo, la posición 5 de un vector de tamaño 5)? ¿Cómo se llama ese error en Java?

como ya hemos dicho, los array empiezan a contar desde 0, si un array de longitud 5 intentamos acceder a un indice que
no existe `Indice[5]` nos lanza una excepcion, mas expecificamente: `ArrayIndexOutOfBoundsException //no recordaba el nombre exacto, lo investigue por internet`

#### 5. Cuando se recorre una matriz se usan dos ciclos for, uno dentro del otro (ciclo anidado). Explica con tus palabras qué representa cada uno de los dos índices y por qué se necesitan ambos.

Bueno esto es un poco lo que hablamos en el punto 1 de como recorrer una matriz, al ser un array de arrays lo podemos
ver como una tabla, entonces tenemos filas y columnas, y que en matematicas lo representamos con posiciones (x, y), 
cada for representa una de estas dimensiones, entonces por fila (x), el for "padre", recorremos cada columna (y), el 
for "hijo", asi es como lo entiendo me explico muy mal D: