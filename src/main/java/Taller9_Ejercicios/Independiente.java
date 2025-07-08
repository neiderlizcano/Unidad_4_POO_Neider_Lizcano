/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9_Ejercicios;

 /*Ejercicio 3: Uso Incorrecto de super
 1. Intenta utilizar super en un contexto que no sea una clase derivada y observa los errores de compilación.
 2. Intenta invocar un atributo privado de la clase base utilizando super y discute por qué ocurre un error.
*/

public class Independiente {

    public void mostrarMensaje() {
        // Error: SUPER solo se puede usar en clases que heredan
        System.out.println(super.toString()); //Aca sale error de compilacion
    }
}
