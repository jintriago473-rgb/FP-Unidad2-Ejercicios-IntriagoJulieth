/*
  Sesion: S10 - Argumentos y parametros
  Ejercicio 02: Intercambiar en un arreglo
  Enunciado: escribir intercambiar(int[] v, int i, int j) y explicar por que ahora si funciona.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej02_IntercambiarArreglo {

    // Intercambia los numeros que estan en dos posiciones del arreglo
    static void intercambiar(int[] numeros, int posicion1, int posicion2) {
        int auxiliar = numeros[posicion1];
        numeros[posicion1] = numeros[posicion2];
        numeros[posicion2] = auxiliar;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 7, 9};
        System.out.println("Antes: " + numeros[0] + " " + numeros[1] + " " + numeros[2]);
        intercambiar(numeros, 0, 2);
        System.out.println("Despues: " + numeros[0] + " " + numeros[1] + " " + numeros[2]);
    }
}

/*
  Por que ahora si funciona? Lo que se copia es la referencia (la direccion)
  del arreglo, no los numeros. El arreglo de main y el del metodo son el MISMO
  arreglo, entonces cuando el metodo cambia numeros[0] y numeros[2], el cambio
  se ve tambien en main. Se imprime "Despues: 9 7 3".
 */
