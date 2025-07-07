
package Taller4_Ejercicios;

public class PruebaBarco {
 
    public static void main(String[] args) {
        Barco barco1 = new Barco();

        // Error de compilación porque 'nombre' tiene acceso privado en la clase llamada Barco
        // System.out.println(barco.nombre);
    }
}


