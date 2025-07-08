/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Prueba_carrito_fruta_pagable {
    public static void main(String[] args) {
        Fruta fruta = new Fruta(3000, 2.5); // 2.5 kilos a $3000
        fruta.mostrarInformacion();
        System.out.println("Precio total de la fruta: $" + fruta.calcularPrecio());

        // Carrito carrito = new Carrito(); // Aca se lanza error si Carrito no implementa pagar()
    }
}

