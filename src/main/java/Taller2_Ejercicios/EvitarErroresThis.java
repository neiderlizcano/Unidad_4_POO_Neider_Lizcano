
package Taller2_Ejercicios;

public class EvitarErroresThis {
    
    
    public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante() {
        this("Desconocido", 0);

    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método static que intenta usar this (provoca error de compilación)
    public static void metodoIncorrecto() {
        // System.out.println(this.nombre); 
    }

    // Ahora esta es la forma correcta sin uso de 'this'
    public static void metodoCorregido() {
        System.out.println("Este es un método estático. No se puede usar 'this' aquí.");
    }


    @Override
    public String toString() {
        return "El Estudiante es:\nNombre: " + nombre + ", edad: " + edad;
    }
    
}
}
