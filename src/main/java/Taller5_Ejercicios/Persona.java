
package Taller5_Ejercicios;

//Ejercicio 3: Comparación entre private y default
// 1. Crea una clase Persona con los atributos nombre (privado) y edad (de paquete). Define métodos get y set para nombre.
// 2. Crea una clase de prueba dentro del mismo paquete y verifica qué atributos y métodos son accesibles.
// 3. Discute las diferencias de acceso entre los atributos private y de paquete.

public class Persona {
    private String nombre; 
    int edad;              


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}


