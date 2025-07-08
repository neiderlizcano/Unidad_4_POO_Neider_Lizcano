
package Taller8_Ejercicios;

/**
 * Ejercicio 3: Clase Empleado y Clase Gerente - Define una clase Empleado con
 * atributos nombre y salario, y un método mostrarDetalles que muestre ambos
 * atributos. - Crea una clase Gerente que herede de Empleado y agregue un
 * atributo departamento. - Define un método en Gerente que sobrescriba el
 * método mostrarDetalles de Empleado para mostrar también el departamento. -
 * Crea una clase de prueba para instanciar objetos de Empleado y Gerente, y
 * utiliza sus métodos.
 */
public class Empleado {

    String nombre;
    double salario;

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: $" + salario;
    }
}
