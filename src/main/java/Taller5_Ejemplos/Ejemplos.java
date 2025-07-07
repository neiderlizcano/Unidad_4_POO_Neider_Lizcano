
package Taller5_Ejemplos;


public class Ejemplos {
    
 /*   Taller: Modificador de Acceso de Paquete (default) en Java
    
   
 Objetivo del Taller:
 
 El objetivo de este taller es comprender el modificador de acceso de paquete, también conocido como default, en Java. Los estudiantes aprenderán
 cuándo y cómo utilizarlo, cuáles son sus limitaciones, y qué situaciones pueden generar errores o malas prácticas.
 Temario:
    
 1. Contextualización y Definición del Modificador de Paquete (default)
 ○ ¿Quéeselmodificador de acceso de paquete en Java?
 ○ ¿Cómosedefine y cuál es su comportamiento?
    
 2. Objetivos del Uso del Modificador de Paquete
 ○ Visibilidad dentro del mismo paquete.
 ○ Control y organización del código en un mismo contexto.
    
 3. Cuándo Usar y Cuándo No Usar el Modificador de Paquete
 ○ Casosrecomendados y no recomendados.
    
 4. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos.
    
 5. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas de default y no compilan.
    
 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos que son malas prácticas pero que no generan errores.
    
 7. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica el uso correcto e incorrecto del modificador default
     
    
    
    
 1. Contextualización y Definición del Modificador de Paquete (default)
    
 El modificador de paquete, o default, es el nivel de acceso que se aplica a los miembros de una clase cuando no se especifica un modificador de
 acceso explícito. Los miembros con el modificador default son accesibles solo desde otras clases del mismo paquete.
 Definición Técnica:
    
 ● Unatributo, método o clase sin un modificador explícito (como public, private o protected) se considera de paquete o default.
 ● Lavisibilidad se limita al paquete en el que la clase se encuentra definida.
 Ejemplo:   
    
    
 // Clase Producto con nivel de acceso de paquete
    
 class Producto {

        String nombre; // Atributo de paquete (default)
        double precio; // Atributo de paquete (default)
    }

    Producto(String nombre, double precio) { // Constructor de paquete
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() { // Método de paquete
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }

    
2. Objetivos del Uso del Modificador de Paquete
    
 El modificador de paquete cumple con los siguientes objetivos clave:
    
 ● Visibilidad Limitada: Permite que los miembros sean accedidos solo desde dentro del mismo paquete. Es útil cuando se quiere mantener el
 acceso controlado pero visible para clases relacionadas.
 ● Control en la Organización del Código: Facilita la organización del código cuando se quiere agrupar clases y miembros que trabajan juntos
 dentro de un paquete.
    
 Visibilidad y Alcance de Paquete (default)
    
 
 3. Cuándo Usar y Cuándo No Usar el Modificador de Paquete
 Cuándo Usar el Modificador de Paquete:

 ● Para métodos y atributos que solo se utilizarán por otras clases del mismo paquete.
 ● Para mantener detalles internos accesibles solo para clases que pertenecen al mismo contexto o módulo.
 Cuándo No Usar el Modificador de Paquete:
 ● Cuando se necesite acceso desde fuera del paquete.
 ● En atributos o métodos que necesiten ser heredados o expuestos a subclases ubicadas en otros paquetes.
 
 4. Ejemplos de Uso Correcto
 Ejemplo Correcto 1:    

// Clase con miembros de paquete (default)
    class Empleado {

        String nombre;
        double salario;

        Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", Salario: " + salario);
        }
    }

Explicación: Aquí, los atributos nombre y salario tienen acceso de paquete. Esto permite que otras clases dentro del mismo paquete puedan acceder
 a ellos, pero no desde clases fuera del paquete.

    
5. Ejemplos de Uso Incorrecto con Errores de Compilación
    
Ejemplo Incorrecto 1: Intentar acceder a un miembro de paquete desde fuera del paquete    
 
    
     
    // Paquete: paqueteA
    package paqueteA ;

    class Vehiculo {

        String marca;

        Vehiculo(String marca) {
            this.marca = marca;
        }
    }
    // Paquete: paqueteB
    package paqueteB ;

    import paqueteA.Vehiculo ;

    public class Main {

        public static void main(String[] args) {
            Vehiculo v = new Vehiculo("Toyota"); // Error de compilación: Vehiculo no es visible
        }
    }

 Explicación: La clase Vehiculo y su constructor tienen nivel de acceso de paquete (default). Al intentar acceder a ellos desde otro paquete
 (paqueteB), se genera un error de compilación debido a la falta de visibilidad.
 
 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 Ejemplo Incorrecto 2: No utilizar encapsulamiento adecuado



    // Clase Producto con nivel de acceso de paquete
    class Producto {

        String nombre; // Atributo de paquete (default)
        double precio; // Atributo de paquete (default)

        Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }

 Explicación: Aunque los atributos y métodos tienen acceso de paquete, es una mala práctica exponer los atributos sin utilizar métodos de acceso (get y
 set), ya que se permite un acceso descontrolado dentro del mismo paquete. Esto compromete el encapsulamiento
 */

} 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

