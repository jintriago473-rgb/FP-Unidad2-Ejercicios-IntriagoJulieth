/*
  Sesion: S12 - Metodos de biblioteca
  Ejercicio 03: Validar contrasena
  Enunciado: minimo 8 caracteres, al menos una mayuscula y un digito, usando Character.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej03_ValidarContrasenia {

    // Dice si la contrasena tiene al menos una mayuscula
    static boolean tieneMayuscula(String contrasenia) {
        for (int posicion = 0; posicion < contrasenia.length(); posicion++) {
            char letra = contrasenia.charAt(posicion);
            if (Character.isUpperCase(letra)) {
                return true;
            }
        }
        return false;
    }

    // Dice si la contrasena tiene al menos un digito
    static boolean tieneDigito(String contrasenia) {
        for (int posicion = 0; posicion < contrasenia.length(); posicion++) {
            char letra = contrasenia.charAt(posicion);
            if (Character.isDigit(letra)) {
                return true;
            }
        }
        return false;
    }

    // Dice si la contrasena es valida
    static boolean validarContrasenia(String contrasenia) {
        return contrasenia.length() >= 8 && tieneMayuscula(contrasenia) && tieneDigito(contrasenia);
    }

    public static void main(String[] args) {
        System.out.println("Hola1234 es valida? " + validarContrasenia("Hola1234"));
        System.out.println("Hola12 es valida? " + validarContrasenia("Hola12"));
        System.out.println("hola1234 es valida? " + validarContrasenia("hola1234"));
        System.out.println("HolaHola es valida? " + validarContrasenia("HolaHola"));
    }
}
