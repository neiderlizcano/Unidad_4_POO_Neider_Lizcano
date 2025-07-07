
package Taller5_Ejercicios;

/* Ejercicio 1: Clase Producto
 Crea una clase Producto con las propiedades nombre, precio y stock. Define:
 1. Todas las propiedades deben tener acceso de paquete (default).
 2. Crea un constructor con acceso de paquete que inicialice todas las propiedades.
 3. Crea un método mostrarInfo() con acceso de paquete para mostrar los detalles del producto.
 4. Crea una clase de prueba dentro del mismo paquete y verifica que se pueden acceder correctamente a los miembros.
*/

class Producto { // clase con acceso de paquete

    String nombre;       // propiedad con acceso default
    double precio;       // propiedad con acceso default
    int stock;           // propiedad con acceso default


    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock + " unidades");
    }
}

