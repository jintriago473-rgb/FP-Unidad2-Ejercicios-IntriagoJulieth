/*
  Sesion: S11 - Ambito de las variables
  Ejercicio 04: Reescribir sin static
  Enunciado: mostrar la version original (comentada) y la nueva, que use parametros y return.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

/*
  VERSION ORIGINAL (usa una variable static):
 
  public class Ej04_ReescribirSinStatic {
      static int total = 0;
 
      static void sumar(int numero) {
          total = total + numero;
      }
 
      public static void main(String[] args) {
          sumar(5);
          sumar(3);
          System.out.println("Total: " + total);
      }
  }
 */

// VERSION NUEVA (sin static: usa parametros y return)
public class Ej04_ReescribirSinStatic {

    // Devuelve el total mas el numero
    static int sumar(int total, int numero) {
        return total + numero;
    }

    public static void main(String[] args) {
        int total = 0;
        total = sumar(total, 5);
        total = sumar(total, 3);
        System.out.println("Total: " + total);
    }
}
