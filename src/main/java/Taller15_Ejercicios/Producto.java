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
public class Producto {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Producto(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
    }

    public String generarEtiqueta() {
        return "Producto: " + nombre + " | Precio: $" + precioUnitario + " | Cantidad: " + cantidad;
    }

    public double calcularPrecioTotal() {
        return precioUnitario * cantidad;
    }
}


