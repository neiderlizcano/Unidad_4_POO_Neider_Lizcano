/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11_Ejercicios;

/**
Ejercicio1: Clase Figura y Clases Derivadas Circulo y Rectangulo
- Define unaclase abstracta Figura con un método abstracto calcularArea.
- Creados clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea
- Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área
 */
public class Prueba_figura_circulo_rectangulo {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5.0);
        Figura f2 = new Rectangulo(4.0, 6.0);

        f1.mostrarArea(); // Área del círculo
        f2.mostrarArea(); // Área del rectángulo
    }
}

