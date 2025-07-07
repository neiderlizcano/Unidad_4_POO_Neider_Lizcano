
package Taller7_Ejercicios;


public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado emple = new Empleado();

        emple.nombre = "Neider Lizcano";        
        emple.setSalario(2678860);             

        System.out.println("Nombre: " + emple.nombre);
        System.out.println("Salario: $" + emple.getSalario());
    }
}
