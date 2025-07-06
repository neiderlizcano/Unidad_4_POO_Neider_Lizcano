package Taller1_Ejercicios;

import Taller1_Ejercicios.*;
import java.util.Scanner;

public class EjericicioFinal {

    /* Ejercicio Final: Proyecto Integrador
 Desarrolla una aplicación Java que contenga las clases que definiste en los ejercicios anteriores (Libro, CuentaBancaria, y Estudiante). Crea un
 archivo main que:
 1. Cree al menos un objeto de cada clase utilizando diferentes constructores.
 2. Permita ingresar datos por consola para inicializar los objetos.
 3. Muestre los detalles de los objetos utilizando el método toString(). */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        String nombreEstudiante, cursoEstudiante, tipoCuenta, titulo, autor;
        int edadEstudiante, numeroCuenta, numeroPaginas;
        double saldo;

        // Objetos creados predeterminados por mí
        Libro Libro1 = new Libro("Neider", "Lizcano", 10);
        CuentaBancaria cuenta1 = new CuentaBancaria(152932, "Ahorros");
        Estudiante estudiante1 = new Estudiante("Neider", 26, "Ing Software 2");

        // Objetos creados por consola
        //Estudiante
        System.out.println("Hola\n");
        System.out.println("Ingrese el nombre del estudiante");
        nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer antes de leer el curso
        System.out.println("Ingrese el curso del estudiante");
        cursoEstudiante = scanner.nextLine();
        Estudiante estudiante2 = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

        // Libro
        System.out.println("\nIngrese el título del libro:");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas del libro:");
        numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);

        // Cuenta bancaria
        System.out.println("\nIngrese el número de cuenta bancaria:");
        numeroCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Ingrese el tipo de cuenta:");
        tipoCuenta = scanner.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, tipoCuenta);

        // Mostrar detalles de los objetos creados por consola
        System.out.println("\n DATOS DE LOS OBJETOS CREADOS POR CONSOLA: ");
        System.out.println(estudiante2);
        System.out.println(libro2);
        System.out.println(cuenta2);

        // También puedes mostrar los objetos predeterminados si deseas
        System.out.println("\n DATOS DE OBJETOS PREDETERMINADOS: ");
        System.out.println(estudiante1);
        System.out.println(Libro1);
        System.out.println(cuenta1);

    }
}
