package Taller5_Ejercicios.vehiculos;

 //Ejercicio 2: Clase Vehículo y Moto en Diferentes Paquetes
 //2. Define una clase Moto en el paquete vehiculos que herede de Vehículo.

class Moto extends Vehiculo {
    void configurar() {
        tipo = "Motocicleta";
        mostrarTipo();
    }
}

