/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12_Ejercicios;

/**
Ejercicio 1: Clase Ave con Interfaces Volador y Cantante
 1. Define una interfaz Volador con un método volar.
 2. Define una interfaz Cantante con un método cantar.
 3. Crea una clase Ave que implemente ambas interfaces y defina sus métodos.
 4. Crea una clase de prueba para instanciar un objeto de Ave y usar ambos métodos.
 */
// Ejercicio 1: Clase Ave con Interfaces Volador y Cantante

public class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando.");
    }
}

