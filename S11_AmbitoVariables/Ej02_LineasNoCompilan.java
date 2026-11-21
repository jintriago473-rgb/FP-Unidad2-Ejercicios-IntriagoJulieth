/*
  Sesion: S11 - Ambito de las variables
  Ejercicio 02: Lineas que no compilan
  Enunciado: comentar las lineas con error con //, escribir el mensaje del compilador y la causa.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    static int total = 0;

    static void sumar(int cantidad) {
        int parcial = cantidad * 2;
        total = total + parcial;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            sumar(i);
        }

        // ERROR 1
        // System.out.println(i);
        // Mensaje: error: cannot find symbol
        //          symbol:   variable i
        //          location: class Ej02_LineasNoCompilan
        // Causa: i se declaro dentro del for, entonces solo existe dentro del for.
        //        Al salir del for la variable desaparece.

        // ERROR 2
        // System.out.println(parcial);
        // Mensaje: error: cannot find symbol
        //          symbol:   variable parcial
        //          location: class Ej02_LineasNoCompilan
        // Causa: parcial es local del metodo sumar, main no la puede ver.

        int resultado = 5;
        // ERROR 3
        // int resultado = 6;
        // Mensaje: error: variable resultado is already defined in method main(String[])
        // Causa: no se puede declarar dos veces el mismo nombre en el mismo ambito.
        //        Para cambiar el valor se escribe solo: resultado = 6;

        // ERROR 4
        // int suma;
        // System.out.println(suma);
        // Mensaje: error: variable suma might not have been initialized
        // Causa: una variable local debe tener un valor antes de usarla.
        //        Se corrige con: int suma = 0;

        System.out.println(total);
        System.out.println(resultado);
    }
}
