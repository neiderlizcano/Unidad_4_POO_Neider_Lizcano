/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;


import java.io.FileWriter;
import java.io.IOException;

public class LibroPersistencia {
    public void guardarEnArchivo(String contenido, String nombreArchivo) {
        try {
            FileWriter writer = new FileWriter(nombreArchivo);
            writer.write(contenido);
            writer.close();
            System.out.println("Archivo guardado como: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
            e.printStackTrace();
        }
    }
}
