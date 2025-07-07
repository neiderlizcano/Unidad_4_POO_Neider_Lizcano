
package Taller5_Ejercicios.vehiculos;

 //Ejercicio 2: Clase Vehículo y Moto en Diferentes Paquetes
 //1. Define una clase Vehículo en el paquete vehiculos con la propiedad tipo de paquete.

class Vehiculo { // acceso de paquete (default)
    String tipo;

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

