package Taller2_Ejercicios;

/*Ejercicio 1: Clase Producto con Constructor y Métodos de Acceso
 1. Define una clase Producto con los atributos nombre y precio.
 2. Crea un constructor que reciba los parámetros nombre y precio y utiliza this para diferenciarlos de los atributos.
 3. Define un método mostrarProducto que imprima los detalles del producto */
public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El producto es: /n" + "Nombre= " + nombre + ", precio= " + precio + '}';
    }

}
