/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13_Ejercicios;

/**
 Ejercicio 3: Uso Incorrecto de Clases Abstractas e Interfaces
 1. Intenta crear una clase concreta que implemente una interfaz sin proporcionar implementaciones de sus métodos y observa los errores de
 compilación.
 2. Intenta definir métodos predeterminados en una clase abstracta y discute por qué esto no es posible.
 */
public class Fruta extends Producto {
    private double precioPorKilo;
    private double kilos;

    public Fruta(double precioPorKilo, double kilos) {
        this.precioPorKilo = precioPorKilo;
        this.kilos = kilos;
    }

    @Override
    public double calcularPrecio() {
        return precioPorKilo * kilos;
    }
}

