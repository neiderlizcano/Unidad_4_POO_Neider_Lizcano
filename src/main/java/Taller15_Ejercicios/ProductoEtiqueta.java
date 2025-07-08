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

public class ProductoEtiqueta {
    public String generarEtiqueta(Producto1 producto) {
        return "Producto: " + producto.getNombre() +
               " | Precio: $" + producto.getPrecioUnitario() +
               " | Cantidad: " + producto.getCantidad();
    }
}
