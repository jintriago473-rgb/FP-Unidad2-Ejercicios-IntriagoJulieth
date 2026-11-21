/*
  Sesion: S11 - Ambito de las variables
  Ejercicio 03: Traza del contador static
  Enunciado: programa con un contador static y, en un comentario, la tabla linea | variables vivas | valor.
  Autor: Intriago Julieth
  Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0;

    static void incrementar(int paso) {
        contador = contador + paso;
    }

    public static void main(String[] args) {
        int veces = 2;
        incrementar(1);
        incrementar(veces);
        System.out.println("Contador: " + contador);
    }
}

/*
  TRAZA (los numeros de linea son los de este archivo)
 
  Linea | Variables vivas              | Valor
  ------|------------------------------|---------------------------------
   11   | contador (static)            | contador = 0
   18   | contador, veces (main)       | veces = 2
   19   | contador, veces              | se llama incrementar(1)
   13   | contador, veces, paso        | paso = 1 (nace al entrar al metodo)
   14   | contador, veces, paso        | contador = 0 + 1 = 1
   15   | contador, veces              | paso desaparece al terminar el metodo
   20   | contador, veces              | se llama incrementar(veces)
   13   | contador, veces, paso        | paso = 2
   14   | contador, veces, paso        | contador = 1 + 2 = 3
   15   | contador, veces              | paso desaparece otra vez
   21   | contador, veces              | imprime "Contador: 3"
   23   | contador                     | veces desaparece al terminar main
 
  Conclusion: contador es static y vive todo el programa, por eso conserva el
  valor entre las dos llamadas. paso es local y nace y muere en cada llamada.
 */
