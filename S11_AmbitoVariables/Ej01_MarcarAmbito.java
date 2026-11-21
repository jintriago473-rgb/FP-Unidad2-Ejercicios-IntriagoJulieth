/*
  Sesion: S11 - Ambito de las variables
  Ejercicio 01: Marcar ambitos
  Enunciado: indicar con un comentario si cada variable es local, de bloque o static.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int contador = 0;            // static: de la clase, vive todo el programa

    static void sumar(int cantidad) {   // cantidad: local (parametro del metodo)
        int doble = cantidad * 2;       // doble: local del metodo sumar
        contador = contador + doble;
    }

    public static void main(String[] args) {
        int total = 10;                 // total: local del metodo main

        for (int i = 0; i < 3; i++) {   // i: de bloque (solo existe dentro del for)
            int cuadrado = i * i;       // cuadrado: de bloque (solo dentro del for)
            sumar(cuadrado);
        }

        if (total > 5) {
            String mensaje = "Total grande";  // mensaje: de bloque (solo dentro del if)
            System.out.println(mensaje);
        }

        System.out.println("Contador: " + contador);
    }
}
