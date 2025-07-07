
package Taller7_Ejercicios;

 /*Ejercicio 1: Clase Empleado
 Crea una clase Empleado con las propiedades nombre y salario. Define:
 1. La propiedad nombre debe ser pública.
 2. Proporciona métodos get y set públicos para la propiedad salario, con validaciones en el método set.
 3. Crea una clase de prueba que instancie objetos de Empleado y acceda a las propiedades
*/
public class Empleado {

    public String nombre;

    private double salario; 

    public double getSalario() {
        return salario;
    }

   
    public void setSalario(double nuevoSalario) {
        if (nuevoSalario >= 0) {
            salario = nuevoSalario;
        } else {
            System.out.println("Error: el salario no puede ser negativo.");
        }
    }
}

