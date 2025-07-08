/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14_Ejercicios;

/**
Ejercicio 1: Clase Figura con Clases Derivadas Rectangulo y Triangulo
 1. Define una clase abstracta Figura con un método abstracto calcularArea.
 2. Crea dos clases derivadas (Rectangulo y Triangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea.
 3. Crea una clase de prueba que instancie objetos de Rectangulo y Triangulo y muestre sus áreas.
 */
public class Prueba_figura_rectangulo_triangulo {

    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(10, 5);
        Figura triangulo = new Triangulo(8, 4);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}

