package Taller1_Ejercicios;

public class Estudiante {

    /* Ejercicio 3: Crear una clase Estudiante}
    
 Crea una clase Estudiante que contenga las propiedades: nombre, edad, y curso. Define:
 1. Un constructor por defecto que asigne valores genéricos.
 2. Un constructor que acepte como parámetros el nombre y la edad.
 3. Un constructor que acepte todos los parámetros y utilice this() para llamar a otro constructor */
    private String nombre, curso;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Datos del Estudiante {\n"
                + "  Nombre: '" + nombre + "',\n"
                + "  Curso: '" + curso + "',\n"
                + "  Edad: " + edad + "\n"
                + '}';
    }

}
