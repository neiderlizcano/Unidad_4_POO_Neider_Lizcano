/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9_Ejercicios;

/*
Ejercicio 1: Clase Persona y Clase Empleado
- Define una clase Persona con los atributos nombre y edad, y un método mostrarDetalles.
- Define una clase Empleado que herede de Persona y agregue un atributo departamento.
- En la clase Empleado, sobrescribe el método mostrarDetalles para mostrar también el departamento utilizando super.
*/
public class Prueba_empleado_persona {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.nombre = "Neider Lizcano";
        empleado.edad = 26;
        empleado.departamento = "Software";

        System.out.println(empleado); 
    }
}

