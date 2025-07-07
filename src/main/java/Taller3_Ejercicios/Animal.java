
package Taller3_Ejercicios;

public class Animal {
    
 /* Ejercicio 3: Uso Incorrecto de static
 1. Intenta crear un método static en una clase que intente acceder y modificar un atributo no estático. Observa los errores de compilación y explica
 por qué suceden.
 2. Corrige el código para que sea correcto.    */
    
    private String nombre;

   /* En este metodo, sucede el error
    public static void cambiarNombre(String nuevoNombre) {
         System.out.println("Nombre actual: " + nombre); 
        nombre = nuevoNombre; // Error de compilación 
    }
}
    El error sucede porque el metodo cambiarNombre es static y trata de acceder al atributo "nombre"
    y ese atributo no es estatico. Entonces como static pertenece a la clase y no a una instancia, no puede acceder directamente a datos que dependen de cada objeto específico

 */
   // A continuación se muestra el metodo corregido:

   
}
