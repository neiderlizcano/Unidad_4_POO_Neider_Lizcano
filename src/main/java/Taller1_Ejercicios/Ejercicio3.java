/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Ejercicio3 {

    /* Ejercicio 3: Crear una clase Estudiante}
    
 Crea una clase Estudiante que contenga las propiedades: nombre, edad, y curso. Define:
 1. Un constructor por defecto que asigne valores genéricos.
 2. Un constructor que acepte como parámetros el nombre y la edad.
 3. Un constructor que acepte todos los parámetros y utilice this() para llamar a otro constructor */
    public class Estudiante {

        String nombre, curso;
        int edad;

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
}
