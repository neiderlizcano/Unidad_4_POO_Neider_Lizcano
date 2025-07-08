
package Taller8_Ejercicios;

public class Prueba_empleado_gerente {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.nombre = "Neider Lizcano";
        empleado.salario = 2500000;

        Gerente gerente = new Gerente();
        gerente.nombre = "Ana Torres";
        gerente.salario = 467800;
        gerente.departamento = "Software";

        System.out.println("Detalles del Empleado:");
        System.out.println(empleado); 

        System.out.println("\nDetalles del Gerente:");
        System.out.println(gerente); 
    }
}
