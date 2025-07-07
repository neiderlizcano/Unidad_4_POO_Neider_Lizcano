
package Taller7_Ejercicios;

/*
 Ejercicio 3: Clase Utilidades

1. Define una clase Utilidades con métodos públicos que realicen operaciones matemáticas básicas (suma, resta, multiplicación, división).
2. Crea una clase de prueba que acceda a estos métodos y valide su correcto funcionamiento
*/

public class PruebaUtilidades {

    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();

        System.out.println("Suma: " + utilidades.sumar(6, 5));           
        System.out.println("Resta: " + utilidades.restar(10, 6));        
        System.out.println("Multiplicación: " + utilidades.multiplicar(7, 2)); 
        System.out.println("División: " + utilidades.dividir(9, 3));     
    }
}

