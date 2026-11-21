/*
  Sesion: S12 - Metodos de biblioteca
  Ejercicio 04: Contar vocales
  Enunciado: contar las vocales de un texto (mayusculas y minusculas) usando String y Character.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej04_ContarVocales {

    // Devuelve cuantas vocales tiene el texto
    static int contarVocales(String texto) {
        int cantidad = 0;
        for (int posicion = 0; posicion < texto.length(); posicion++) {
            char letra = Character.toLowerCase(texto.charAt(posicion));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        System.out.println("Hola Mundo tiene " + contarVocales("Hola Mundo") + " vocales");
        System.out.println("AEIOUaeiou tiene " + contarVocales("AEIOUaeiou") + " vocales");
    }
}
