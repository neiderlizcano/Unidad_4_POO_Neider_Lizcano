
package Taller8_Ejercicios;

/**
Ejercicio 4: Uso Incorrecto de la Herencia
 1. Intenta crear una clase que herede de múltiples clases e identifica el error de compilación.
 2. Intenta acceder a atributos privados de una clase base desde una clase derivada y explica por qué ocurre el error.
 */
public class ClaseA {
    private String datoPrivado = "Confidencial";
}

/* public class ClaseB extends ClaseA {
    public void mostrarDato() {
        //Error: 'datoPrivado' es privado y no accesible desde ClaseB
        System.out.println(datoPrivado);
    }
} */
//En pocas palabras, como el atributo es privado, solo puede usarse dentro de la ClaseA.
//Para la ClaseB que es la hija, no puede acceder directamente a este atributo