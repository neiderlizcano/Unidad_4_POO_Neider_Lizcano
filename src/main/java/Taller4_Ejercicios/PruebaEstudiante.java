
package Taller4_Ejercicios;


public class PruebaEstudiante {
    
        public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNombre("Neider");
        estudiante1.setEdad(26);
        estudiante1.setNotaPromedio(4.5);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

        // Ahora aca se comprueban las validaciones
        
        estudiante1.setNombre("");
        estudiante1.setEdad(-1);
        estudiante1.setNotaPromedio(7.0);
    }

}
