public class Main {

    public static void main(String[] args) {
	// Parte 1:
    /*Nos piden crear una matriz de 4×4 de números enteros que inicialmente está vacía, nos piden hacer un menú con
      estas opciones:
          	Rellenar TODA la matriz de números, debes pedírselo al usuario.
          	Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
          	Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
          	Sumar la diagonal principal (ver ejemplo)
          	Sumar la diagonal inversa (ver ejemplo)
          	La media de todos los valores de la matriz.
     IMPORTANTE: hasta que no se haga la primera opción, el resto de las opciones no se deberán de ejecutar,
     simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
    */

        Matriz matriz = new Matriz();
        matriz.mostrarMenu();

        /*Parte 2:
        Realizar una aplicación que genere un cuadrado mágico.
        Un cuadrado mágico es una matriz cuadrada con un número impar de filas y columnas, que cumple con la
        condición de que la suma de sus filas y columnas, así como la de las dos diagonales principales es la misma.
        Por ejemplo, el siguiente es un cuadrado mágico de 5 filas y 5 columnas y la suma de sus filas, columnas y
        diagonales es 65:
        Entrada:
        Dimensiones del cuadrado = 5
        Salida:
        Cuadrado mágico*/

        cuadradoMagico cuadradoMatriz = new cuadradoMagico();

        /*Parte 3:
        Vamos a realizar el típico juego del 3 en raya, donde habrá dos jugadores que tengan que hacer el 3 en raya,
        los signos serán el X y el O, cuando haya una posición vacía habrá un –
        El tablero de juego será una matriz de 3×3 de char.*/

        TresEnRaya juego = new TresEnRaya();


    }
}
