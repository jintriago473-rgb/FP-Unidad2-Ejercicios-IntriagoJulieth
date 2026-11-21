/*
  Sesion: S10 - Argumentos y parametros
  Ejercicio 03: Aplicar descuento
  Enunciado: escribir aplicarDescuento(double[] precios, double pct) que modifique el arreglo y lo imprima antes y despues.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej03_AplicarDescuento {

    // Le quita el porcentaje de descuento a cada precio del arreglo
    static void aplicarDescuento(double[] precios, double porcentaje) {
        for (int posicion = 0; posicion < precios.length; posicion++) {
            double descuento = precios[posicion] * porcentaje / 100;
            precios[posicion] = precios[posicion] - descuento;
        }
    }

    // Imprime todos los precios en una linea
    static void imprimirPrecios(double[] precios) {
        for (int posicion = 0; posicion < precios.length; posicion++) {
            System.out.print(precios[posicion] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] precios = {100, 50, 20, 80};
        System.out.println("Precios antes del descuento:");
        imprimirPrecios(precios);
        aplicarDescuento(precios, 10);
        System.out.println("Precios despues del descuento del 10%:");
        imprimirPrecios(precios);
    }
}
