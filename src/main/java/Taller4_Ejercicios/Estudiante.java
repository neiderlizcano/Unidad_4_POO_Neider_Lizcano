
package Taller4_Ejercicios;

/*Ejercicio 1: Clase Estudiante

Crea una clase Estudiante con las propiedades nombre, edad y notaPromedio. Define

1. Todas las propiedades deben ser privadas.
2. Proporciona métodos get y set para cada propiedad, incluyendo validaciones en los métodos set.
3. Crea una clase de prueba para crear instancias de Estudiante y acceder a las propiedades. */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre() {
        return nombre;
    }

public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }


    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota de su promedio debe estar entre 0.0 y 5.0.");
        }
    }
}

