/*
  Sesion: S10 - Argumentos y parametros
  Ejercicio 01: Intercambiar primitivos
  Enunciado: escribir intercambiar(int a, int b) y comprobar si funciona.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    // Intenta intercambiar los dos numeros
    static void intercambiar(int primero, int segundo) {
        int auxiliar = primero;
        primero = segundo;
        segundo = auxiliar;
    }

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;
        System.out.println("Antes: " + numero1 + " " + numero2);
        intercambiar(numero1, numero2);
        System.out.println("Despues: " + numero1 + " " + numero2);
    }
}

/*
  Funciona? No. Se imprime "Despues: 3 7", los numeros no se intercambian.
  Por que? Java pasa los argumentos por valor: el metodo recibe una COPIA de
  numero1 y numero2. Dentro del metodo se intercambian las copias (primero y
  segundo), pero las variables numero1 y numero2 de main no se tocan.
 */
