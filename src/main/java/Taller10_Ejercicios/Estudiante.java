/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10_Ejercicios;

/**
Ejercicio 1: Clase Persona y Clases Derivadas Estudiante y Profesor
- Define una clase Persona con un método presentarse que imprima un mensaje general.
- Define dos clases derivadas (Estudiante y Profesor) que sobrescriban el método presentarse para mostrar un mensaje específico
- Crea una clase de prueba donde instancies objetos de Persona, Estudiante y Profesor, y utilices polimorfismo para invocar el método
 presentarse.
 */

public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}
