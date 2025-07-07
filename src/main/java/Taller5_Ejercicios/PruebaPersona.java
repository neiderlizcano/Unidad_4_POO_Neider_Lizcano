
package Taller5_Ejercicios;

 /*Ejercicio 3: Comparación entre private y default
 1. Crea una clase Persona con los atributos nombre (privado) y edad (de paquete). Define métodos get y set para nombre.
 2. Crea una clase de prueba dentro del mismo paquete y verifica qué atributos y métodos son accesibles.
 3. Discute las diferencias de acceso entre los atributos private y de paquete.
*/
public class PruebaPersona {
    
public static void main(String[] args) {
        Persona p = new Persona();

        // Acceso a edad porque está en el mismo paquete
        p.edad = 25;

        // Acceso a nombre, directamente no se puede, es private)
        // p.nombre = "Neider"; // Esto causaría error de compilación

      
        p.setNombre("Neider");
        System.out.println("Nombre: " + p.getNombre());
    }
}

/*
En pocas palabras, el modificador de acceso private protege los atributospara que solo la propia clase los maneje, en cambio el acceso default permite que otras clases dentro
del mismo pquete lo usen, pero fuera del paquete esta complemente bloqueado
*/