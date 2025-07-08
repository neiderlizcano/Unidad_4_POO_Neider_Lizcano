
package Taller8_Ejercicios;

/**
Ejercicio1: Clase Vehiculo y Clase Coche
 - Define una clase Vehiculo con los atributos marca y velocidadMaxima. -
 - Define una clase Coche que herede de Vehiculo y agregue un atributo
 - numeroDePuertas. - Define métodos para mostrar la información del vehículo y
  del coche
 
 */
public class Coche extends Vehiculo {

    int numeroDePuertas;

    @Override
    public String toString() {
        return "Marca: " + marca
                + ", Velocidad Máxima: " + velocidadMaxima + " km/h"
                + ", Número de puertas: " + numeroDePuertas;
    }
}
