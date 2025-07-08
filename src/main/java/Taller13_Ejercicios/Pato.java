/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13_Ejercicios;

/**
 *
 * @author EA440 Operator
 */
public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada en el lago.");
    }
}

