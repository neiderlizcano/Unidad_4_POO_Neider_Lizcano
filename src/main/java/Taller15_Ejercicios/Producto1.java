/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;

/**
 Ejercicio 2: Separación de Responsabilidades en una Clase Producto
 1. Define una clase Producto que maneje datos del producto, generación de etiquetas y cálculo de precios.
 2. Refactoriza la clase para dividir las responsabilidades utilizando el SRP.
 */

public class Producto1 {

    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Producto1(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}
