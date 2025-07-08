/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12_Ejercicios;

/**
Ejercicio 2: Clase Pez con Interfaces Nadador y Respirador
 1. Define una interfaz Nadador con un método nadar.
 2. Define una interfaz Respirador con un método respirar.
 3. Crea una clase Pez que implemente ambas interfaces y defina sus métodos.
 4. Crea una clase de prueba para instanciar un objeto de Pez y usar ambos métodos.
 */
public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez nada en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira a través de sus branquias.");
    }
}

