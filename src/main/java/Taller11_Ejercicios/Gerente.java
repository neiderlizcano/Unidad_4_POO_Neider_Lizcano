
package Taller11_Ejercicios;

/**
 * Ejercicio 2: Clase Empleado y Clases Derivadas Gerente y Vendedor 1. Define
 * una clase abstracta Empleado con un método abstracto calcularSalario. 2. Crea
 * dos clases derivadas (Gerente y Vendedor) que extiendan Empleado y
 * proporcionen sus propias implementaciones de calcularSalario. 3. Define un
 * método mostrarDetalles en Empleado y utiliza calcularSalario para mostrar los
 * detalles del empleado.
 */
public class Gerente extends Empleado {

    private double salarioBase;
    private double bono;

    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
