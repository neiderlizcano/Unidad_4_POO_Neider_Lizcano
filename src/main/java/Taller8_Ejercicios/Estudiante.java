/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_Ejercicios;

/*Ejercicio 2: Clase Persona y Clase Estudiante (continuación)
- Crea una clase Persona con los atributos nombre y edad.
- Define una clase Estudiante que herede de Persona y agregue un atributo matricula.
- Define un método en Estudiante que sobrescriba un método en Persona para mostrar los detalles del estudiante incluyendo el nombre, la edad y la matrícula.
- Crea una clase de prueba donde instancies objetos de Estudiante y utilices sus métodos.
*/

public class Estudiante extends Persona {
    String matricula;

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Edad: " + edad +
               ", Matrícula: " + matricula;
    }
}



