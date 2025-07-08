/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14_Ejercicios;

/**
Ejercicio 1: Clase Figura con Clases Derivadas Rectangulo y Triangulo
 1. Define una clase abstracta Figura con un método abstracto calcularArea.
 2. Crea dos clases derivadas (Rectangulo y Triangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea.
 3. Crea una clase * de prueba que instancie objetos de Rectangulo y Triangulo y muestre sus
 * áreas.
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

