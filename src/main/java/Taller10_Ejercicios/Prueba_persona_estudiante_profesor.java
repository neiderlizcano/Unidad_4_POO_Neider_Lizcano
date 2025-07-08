
package Taller10_Ejercicios;

/**
 * Ejercicio 1: Clase Persona y Clases Derivadas Estudiante y Profesor - Define
 * una clase Persona con un método presentarse que imprima un mensaje general. -
 * Define dos clases derivadas (Estudiante y Profesor) que sobrescriban el
 * método presentarse para mostrar un mensaje específico - Crea una clase de
 * prueba donde instancies objetos de Persona, Estudiante y Profesor, y utilices
 * polimorfismo para invocar el método presentarse.
 */
public class Prueba_persona_estudiante_profesor {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
