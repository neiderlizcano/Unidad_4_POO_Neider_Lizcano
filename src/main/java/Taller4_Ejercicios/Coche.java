
package Taller4_Ejercicios;

/* Ejercicio 2: Clase Coche
Crea una clase Coche con las propiedades marca, modelo y velocidadMaxima. 

Define:

 1. Todas las propiedades deben ser privadas.
 2. Proporciona un método acelerar que incremente velocidadMaxima solo si el incremento es positivo.
 3. Crea una clase de prueba que intente acceder a las propiedades directamente y observa los errores de compilación.*/

public class Coche {

    private String marca, modelo;
    private int velocidadMaxima;
    
    
 public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("La velocidad ha sido incrementada. La nueva velocidad máxima es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}

