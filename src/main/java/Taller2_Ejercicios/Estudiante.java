package Taller2_Ejercicios;

/* Ejercicio 2: Llamada a Constructores con this()
 1. Define una clase Estudiante con los atributos nombre y edad.
 2. Crea un constructor por defecto que llame a un constructor con dos parámetros utilizando this().
 3. Define un método que imprima los detalles del estudiante.*/
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

    @Override
    public String toString() {
        return "El Estudiante es:\nNombre: " + nombre + ", edad: " + edad;
    }

}
