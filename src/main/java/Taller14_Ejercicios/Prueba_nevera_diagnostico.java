/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Prueba_nevera_diagnostico {
    public static void main(String[] args) {
        // Nevera nevera = new Nevera(); // No compila si Nevera no implementa los métodos

        Frigorifico frigorifico = new Frigorifico();
        frigorifico.mostrarEstado();
        frigorifico.diagnosticar();
    }
}