/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6_Ejercicios;

 /*Ejercicio 2: Clase Vehículo y Clase Moto
 1. Define una clase Vehículo con las propiedades tipo y marca como protected.
 2. Crea una subclase Moto que herede de Vehículo y tenga una propiedad adicional cilindrada.
 3. Enuna clase de prueba, intenta acceder a los miembros protected desde una clase no relacionada y observa los errores de compilación.
*/
public class PruebaAcceso_vehiculo_moto {

    public static void main(String[] args) {
        Moto m = new Moto();

        // Acceso a miembros protected desde clase no relacionada.
        // m.tipo = "Deportiva";        
        // m.marca = "Yamaha";         
        // m.cilindrada = 600;         
        
       /*
        Se puede decdir que suceden errores de compliacion porque estoy tratando de acceder a miembros protected
        desde una clase no relacionada y un paquete diferente, porque protected protege los atributos fuera del alcance 
        de clases externas que no heredan.
        */
    }
}

