/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Prueba_producto_srp {
    public static void main(String[] args) {
        Producto1 producto = new Producto1("Café", 6000.0, 2);

        ProductoEtiqueta etiqueta = new ProductoEtiqueta();
        ProductoPrecio precio = new ProductoPrecio();

        System.out.println(etiqueta.generarEtiqueta(producto));
        System.out.println("Precio total: $" + precio.calcularTotal(producto));
    }
}

