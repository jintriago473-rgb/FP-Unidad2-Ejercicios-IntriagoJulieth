/*
   Sesion: S12 - Metodos de biblioteca
  Ejercicio 01: Distancia entre dos puntos
  Enunciado: calcular la distancia entre dos puntos usando Math.sqrt y Math.pow.
 Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {

    // Devuelve la distancia entre el punto 1 y el punto 2
    static double distancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    public static void main(String[] args) {
        double primera = distancia(0, 0, 3, 4);
        double segunda = distancia(1, 2, 4, 6);
        System.out.println("Distancia de (0,0) a (3,4): " + primera);
        System.out.println("Distancia de (1,2) a (4,6): " + segunda);
    }
}
