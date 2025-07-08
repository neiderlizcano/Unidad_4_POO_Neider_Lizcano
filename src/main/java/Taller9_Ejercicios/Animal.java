/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9_Ejercicios;

/**
 Ejercicio 2: Clase Animal y Clase Pez
 1. Define una clase Animal con un atributo especie y un método mostrarEspecie.
 2. Define una clase Pez que herede de Animal y agregue un atributo tipoDeAgua.
 3. Utiliza super para invocar el constructor y el método de la clase base desde Pez.
 */
public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

