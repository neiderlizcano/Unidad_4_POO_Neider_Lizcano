/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_Ejercicios;

/**
Ejercicio1: Clase Vehiculo y Clase Coche

- Define una clase Vehiculo con los atributos marca y velocidadMaxima.
- Define una clase Coche que herede de Vehiculo y agregue un atributo numeroDePuertas.
- Define métodos para mostrar la información del vehículo y del coche

 */
public class Vehiculo {

    String marca;
    int velocidadMaxima;

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}


