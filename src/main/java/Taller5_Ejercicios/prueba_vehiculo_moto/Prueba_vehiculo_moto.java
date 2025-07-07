
package Taller5_Ejercicios.prueba_vehiculo_moto;

//Ejercicio 2: Clase Vehículo y Moto en Diferentes Paquetes

// 3. Crea una clase de prueba en otro paquete e intenta acceder a los miembros de Vehículo y Moto. Observa los errores de compilación y discute
// por qué suceden.


public class Prueba_vehiculo_moto {
    
public static void main(String[] args) {
        //Moto miMoto = new Moto();       // Error: Moto no es public
        //miMoto.configurar();           //  Error: Moto y métodos internos no accesibles por visibilidad de paquete
        // miMoto.mostrarTipo();       //  Error: mostrarTipo() no es accesible
        // miMoto.tipo = "MotoX";      //  Error: tipo no es accesible
    }
}
//Java lanza esos errores porque los métodos y atributos están con acceso limitado,
//y solo se pueden usar dentro del mismo paquete. Si intent0 usarlos desde otro paquete, 
//Java no me deja porque no son públicos. 

