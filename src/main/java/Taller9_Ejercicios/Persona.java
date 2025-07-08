
package Taller9_Ejercicios;

/*
Ejercicio 1: Clase Persona y Clase Empleado
- Define una clase Persona con los atributos nombre y edad, y un método mostrarDetalles.
- Define una clase Empleado que herede de Persona y agregue un atributo departamento.
- En la clase Empleado, sobrescribe el método mostrarDetalles para mostrar también el departamento utilizando super.
*/
public class Persona {

    String nombre;
    int edad;

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
