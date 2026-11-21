/*
  Sesion: S10 - Argumentos y parametros
  Ejercicio 05: Prediccion de salida
  Enunciado: programa con 3 llamadas, la salida predicha en un comentario y luego la salida real.
  Autor: Intriago Julieth 
  Fecha: 20/11/2026
 */

public class Ej05_PrediccionSalida {

    // Le suma 10 al numero y al primer valor de la lista
    static void cambiar(int numero, int[] lista) {
        numero = numero + 10;
        lista[0] = lista[0] + 10;
        System.out.println("Dentro: " + numero + " " + lista[0]);
    }

    public static void main(String[] args) {
        int numero = 1;
        int[] lista = {1, 2};

        cambiar(numero, lista);
        System.out.println("Fuera: " + numero + " " + lista[0]);

        cambiar(numero, lista);
        System.out.println("Fuera: " + numero + " " + lista[0]);

        cambiar(lista[0], lista);
        System.out.println("Fuera: " + numero + " " + lista[0]);
    }
}

/*
 -SALIDA PREDICHA (antes de ejecutar):
 - Dentro: 11 11
 - Fuera: 1 11
 - Dentro: 11 21
 - Fuera: 1 21
 - Dentro: 31 31
 - Fuera: 1 31

 - Explicacion: "numero" es un int, entonces el metodo trabaja con una copia y
 - el de main siempre se queda en 1. "lista" es un arreglo, entonces se
 - modifica el mismo arreglo y lista[0] sube 10 en cada llamada (1, 11, 21, 31).
 - En la tercera llamada se envia lista[0] que ya vale 21, por eso numero
 - dentro del metodo es 21 + 10 = 31.
 
 - SALIDA REAL (despues de ejecutar):
 - Dentro: 11 11
 - Fuera: 1 11
 - Dentro: 11 21
 - Fuera: 1 21
 - Dentro: 31 31
 - Fuera: 1 31
 - (coincide con la prediccion)
*/
