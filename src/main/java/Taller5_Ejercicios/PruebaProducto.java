package Taller5_Ejercicios;

public class PruebaProducto {

    public static void main(String[] args) {
        Producto prod = new Producto("Celular", 2899.22, 10);
        prod.mostrarInfo();

        // Acceso directo a los miembros porque estamos en el mismo paquete
        System.out.println("Nombre (acceso directo): " + prod.nombre);
        System.out.println("Stock actual: " + prod.stock);
    }
}
