
package Taller9_Ejercicios;

 /*Ejercicio 3: Uso Incorrecto de super
 1. Intenta utilizar super en un contexto que no sea una clase derivada y observa los errores de compilación.
 2. Intenta invocar un atributo privado de la clase base utilizando super y discute por qué ocurre un error.
*/

public class Vehiculo {
    private String marca = "Toyota";

    public Vehiculo() {}
}

/* public class Carro extends Vehiculo {
    public void mostrarMarca() {
        // Error: No se puede acceder directamente a atributos privados de la clase base
        System.out.println(super.marca); //  Error de compilación
    }

En la clase Independiente ocurre un error porque super solo puede usarse en clases 
que extienden otra explícitamente, y esta no lo hace; en cambio, en la clase Vehiculo,
el atributo marca es private, lo que impide accederlo desde una subclase con super 
ya que los atributos privados no son visibles fuera de su propia clase.

}*/

