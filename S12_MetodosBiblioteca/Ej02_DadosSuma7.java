/*
  Sesion: S12 - Metodos de biblioteca
  Ejercicio 02: Dados que suman 7
  Enunciado: lanzar dos dados 1000 veces con Random y mostrar cuantas veces suman 7 y el porcentaje.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    // Lanza un dado y devuelve un numero del 1 al 6
    static int lanzaDado(Random aleatorio) {
        return aleatorio.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int lanzamientos = 1000;
        int contador = 0;

        for (int lanzamiento = 0; lanzamiento < lanzamientos; lanzamiento++) {
            int dado1 = lanzaDado(aleatorio);
            int dado2 = lanzaDado(aleatorio);
            if (dado1 + dado2 == 7) {
                contador++;
            }
        }

        double porcentaje = contador * 100.0 / lanzamientos;
        System.out.println("Lanzamientos: " + lanzamientos);
        System.out.println("Veces que sumo 7: " + contador);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}
