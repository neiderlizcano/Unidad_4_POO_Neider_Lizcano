/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Prueba_figura_rectangulo_triangulo {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(4, 5);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
