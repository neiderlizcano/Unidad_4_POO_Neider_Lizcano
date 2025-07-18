package Taller1_Ejercicios;

public class Libro {

    /* Ejercicio 1: Crear una clase Libro
 Crea una clase Libro con las siguientes propiedades: titulo, autor, numeroPaginas. Define:
 1. Un constructor por defecto que asigne valores predeterminados.
 2. Un constructor parametrizado que permita asignar valores específicos.
 3. Métodos para mostrar los detalles del libro   
     */
    private String titulo, autor;
    private int numeroPaginas;

    public Libro() {
        titulo = "desconocido";
        autor = "desconocido";
        numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Los detalles del libro son los siguientes: \n" + "Título: " + this.titulo
                + "\n" + "Autor: " + this.autor + "\n";
    }
}
