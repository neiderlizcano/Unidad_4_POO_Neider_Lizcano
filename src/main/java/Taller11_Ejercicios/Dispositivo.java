/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11_Ejercicios;

/**
 Ejercicio 3: Uso Incorrecto de Clases Abstractas
 1. Intenta instanciar una clase abstracta directamente y observa los errores de compilación.
 2. Intenta definir un método concreto en una clase abstracta que sea necesario sobrescribir en las clases derivadas.
 */
    
public abstract class Dispositivo {
    public void encender() {
        System.out.println("Encendiendo dispositivo...");
    }
}

