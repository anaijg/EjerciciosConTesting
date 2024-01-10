package ejercicio01;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class FizzBuzz {
    /*
    Para poder realizar pruebas automatizadas necesitamos crear un método que devuelva algo, en este caso un String (y luego esa cadena la imprimimos)
     */
    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }

    public static String fizzBuzz() {
        String cadena = ""; // iremos añadiendo a esta cadena el resultado de procesar cada número entre 1 y 100
        for (int i = 1; i <= 100; i++) {
             //* - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
            if (i % 3 == 0 && i % 5 == 0) {
                cadena = cadena + "\nfizzbuzz";
            } else if (i % 5 == 0) { // Múltiplos de 5 por la palabra "buzz".
                cadena = cadena + "\nbuzz";
            } else if (i % 3 == 0) { // * - Múltiplos de 3 por la palabra "fizz".
                cadena = cadena + "\nfizz";
            } else {
                cadena = cadena + "\n" + String.valueOf(i);
            }
        }
        return cadena;
    }
}
