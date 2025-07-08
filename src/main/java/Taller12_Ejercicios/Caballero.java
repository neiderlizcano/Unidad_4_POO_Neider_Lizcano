/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12_Ejercicios;

/**
Ejercicio 3: Implementación Incorrecta de Múltiples Interfaces
 1. Intenta crear una clase que implemente una interfaz sin proporcionar las implementaciones de sus métodos y observa los errores de compilación.
 2. Intenta implementar interfaces en clases que no tienen lógica relevante para esas interfaces y discute por qué es una mala práctica.
 */
// Aca sucedera un error porque el Caballero implementa Curador pero no tiene lógica para curar.
public class Caballero implements Atacante, Curador {
    @Override
    public void atacar() {
        System.out.println("El caballero ataca con lanza.");
    }

    @Override
    public void curar() {
        // Implementación sin sentido
        System.out.println("El caballero no sabe curar, pero se forzó a implementar este método.");
    }
}

