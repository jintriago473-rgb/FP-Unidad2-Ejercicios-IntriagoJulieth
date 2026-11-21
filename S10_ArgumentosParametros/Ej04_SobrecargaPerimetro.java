/*
  Sesion: S10 - Argumentos y parametros
  Ejercicio 04: Sobrecarga de perimetro
  Enunciado: escribir dos versiones de perimetro (cuadrado y rectangulo) y llamarlas desde main.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    // Perimetro del cuadrado: un solo dato
    static double perimetro(double lado) {
        return 4 * lado;
    }

    // Perimetro del rectangulo: dos datos
    static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        double cuadrado = perimetro(5);
        double rectangulo = perimetro(5, 10);
        System.out.println("Perimetro del cuadrado: " + cuadrado);
        System.out.println("Perimetro del rectangulo: " + rectangulo);
    }
}
