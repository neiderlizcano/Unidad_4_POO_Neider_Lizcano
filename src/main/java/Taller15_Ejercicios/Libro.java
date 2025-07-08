/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;

/**
Ejercicio 1: Refactorización de una Clase Libro
Define una clase Libro que contenga métodos relacionados con el manejo de su información, generación de reportes y persistencia.
Identifica y separa las responsabilidades en clases específicas para aplicar el SRP.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public String generarReporte() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas;
    }

    public void guardarEnArchivo() {
        try {
            java.io.FileWriter writer = new java.io.FileWriter("libro.txt");
            writer.write(generarReporte());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

