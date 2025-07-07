
package Taller2_Ejercicios;


public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El producto es: /n" + "Nombre= " + nombre + ", precio= " + precio + '}';
    }
    
    
    
}
