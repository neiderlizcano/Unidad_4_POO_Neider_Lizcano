/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;

/**
Ejercicio 1: Refactorización de una Clase Libro
Define una clase Libro que contenga métodos relacionados con el manejo de su información, generación de reportes y persistencia.
Identifica y separa las responsabilidades en clases específicas para aplicar el SRP
 */
public class LibroReporte {

    public String generarReporte(Libro libro) {
        return "Libro: " + libro.getTitulo() + " | Autor: " + libro.getAutor() + " | Páginas: " + libro.getPaginas();
    }
}
