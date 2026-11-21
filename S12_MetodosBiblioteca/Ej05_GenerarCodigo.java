/*
  Sesion: S12 - Metodos de biblioteca
  Ejercicio 05: Codigo de 6 caracteres
  Enunciado: generar un codigo con 3 letras aleatorias y 3 digitos aleatorios.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    // Devuelve una letra mayuscula al azar
    static char letraAleatoria(Random aleatorio) {
        return (char) ('A' + aleatorio.nextInt(26));
    }

    // Devuelve un digito al azar del 0 al 9
    static int digitoAleatorio(Random aleatorio) {
        return aleatorio.nextInt(10);
    }

    // Devuelve un codigo de 3 letras y 3 digitos
    static String generarCodigo(Random aleatorio) {
        String codigo = "";
        for (int cantidad = 0; cantidad < 3; cantidad++) {
            codigo = codigo + letraAleatoria(aleatorio);
        }
        for (int cantidad = 0; cantidad < 3; cantidad++) {
            codigo = codigo + digitoAleatorio(aleatorio);
        }
        return codigo;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        System.out.println("Codigo 1: " + generarCodigo(aleatorio));
        System.out.println("Codigo 2: " + generarCodigo(aleatorio));
        System.out.println("Codigo 3: " + generarCodigo(aleatorio));
    }
}
