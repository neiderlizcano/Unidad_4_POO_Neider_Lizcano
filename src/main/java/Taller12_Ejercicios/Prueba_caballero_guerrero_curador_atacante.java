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
public class Prueba_caballero_guerrero_curador_atacante {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero();
        Sanador sanador = new Sanador();
        Caballero caballero = new Caballero(); // Ejemplo de mala práctica

        guerrero.atacar();
        sanador.curar();
        caballero.atacar();
        caballero.curar(); // Lógica sin sentido
    }
}

