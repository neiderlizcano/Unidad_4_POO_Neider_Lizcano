/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10_Ejercicios;

/**
 Ejercicio 3: Uso Incorrecto de Sobrescritura
 1. Intenta sobrescribir un método en una clase derivada cambiando su firma y observa los errores de compilación.
 2. Sobrescribe un método sin usar @Override y analiza por qué es una mala práctica
 */
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
