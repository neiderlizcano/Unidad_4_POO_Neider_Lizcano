
package Taller3_Ejercicios;

public class Coche {

    /*Ejercicio 1: Clase Coche con Contador de Instancias
    
 1. Crea una clase Coche con los atributos marca, modelo y un atributo static llamado contadorCoches.
 2. Define un constructor que incremente contadorCoches cada vez que se cree un objeto de la clase.
 3. Crea un método static para mostrar cuántos coches se han creado.*/
    String marca;
    int modelo;
    static int contadorCoches = 0;

    public Coche(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Coches creados: " + contadorCoches);
    }

}
