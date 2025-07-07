/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7_Ejemplos;


public class Ejemplos {
    
 /*Taller: Modificador de Acceso public en Java
    
 Objetivo del Taller:
    
 En este taller, los estudiantes aprenderán el uso correcto y la importancia del modificador de acceso public en Java. Se proporcionarán definiciones
 claras, se explicará cuándo y cómo utilizarlo, y se ofrecerán ejercicios prácticos para reforzar los conceptos.
 
    Temario:
 1. Contextualización y Definición del Modificador public
 ○ ¿Quéeselmodificador public?
 ○ ¿Cómosedefine y cuál es su comportamiento?
    
 2. Objetivos del Uso de public
 ○ Visibilidad sin restricciones.
 ○ Exposición de métodos y datos a todas las partes del programa.
    
 3. Cuándo Usar y Cuándo No Usar el Modificador public
 ○ Casosrecomendados y no recomendados.
    
 4. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos.
    
 5. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas de public y no compilan.
    
 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos que son malas prácticas pero que no generan errores.
    
 7. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica el uso correcto e incorrecto del modificador public.

1. Contextualización y Definición del Modificador public
    
 El modificador public en Java proporciona el nivel de acceso más amplio. Los miembros (atributos, métodos y clases) definidos como public son
 accesibles desde cualquier lugar del programa, independientemente del paquete o de la clase desde la que se acceda.
 
Definición Técnica:
    
 ● Unatributo, método o clase declarado como public es accesible desde cualquier clase o paquete en el programa.
 ● Eslaopción predeterminada cuando se quiere exponer miembros o métodos públicamente a otras partes del programa.
 
Ejemplo:


 // Clase definida como pública
 public class Persona {

        public String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }


 2. Objetivos del Uso de public
         
3. Cuándo Usar y Cuándo No Usar el Modificador public
Cuándo Usar public:
- Cuando se desea que un método o clase sea accesible desde cualquier parte del programa.
- Para definir métodos que actúan como puntos de entrada (main) o como interfaces públicas de una clase.
- En atributos que deben ser visibles y accesibles para otras clases, como constantes públicas.
Cuándo No Usar public:
- En datos sensibles o privados que no deben ser accesibles o modificables por otras clases.
- En métodos internos o de implementación que no son relevantes para el usuario de la clase.


4. Ejemplos de Uso Correcto
Ejemplo Correcto 1: Métodos públicos para acceso a atributos

    public class Coche {

        private String marca;
        private double velocidadMaxima;

        public Coche(String marca, double velocidadMaxima) {
            this.marca = marca;
            this.velocidadMaxima = velocidadMaxima;
        }
        // Método público para obtener la marca del coche

        public String getMarca() {
            return marca;
        }
        // Método público para establecer la velocidad máxima

        public void setVelocidadMaxima(double velocidadMaxima) {
            if (velocidadMaxima > 0) {
                this.velocidadMaxima = velocidadMaxima;
            }
        }
        // Método público para mostrar la información del coche

        public void mostrarInformacion() {
            System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
        }
    }
    
 Ejemplo Correcto 2:Clase public con Métodos de Utilidad    

    public class Utilidades {

        public static void imprimirMensaje(String mensaje) {
            System.out.println(mensaje);
        }
    }
    
    Explicación
    : La clase Utilidades define un método público y estática imprimirMensaje, que puede ser accedido desde
    cualquier otra clase.
            
    5. Ejemplos de Uso Incorrecto con Errores de Compilación
    Ejemplo Incorrecto 1: Intentar Acceder a una Clase No Pública Desde Fuera del Paquete // Paquete: paquete1
    
            package paquete1 ;

    class Persona {

        public String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }
    // Paquete: paquete2
    package paquete2 ;
    import paquete1.Persona ;

    public class Main {

        public static void main(String[] args) {
            Persona p = new Persona("Juan"); // Error de compilación: Persona no es visible
        }
    }

 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
    
 Ejemplo Incorrecto 2: Exposición Pública de Atributos Sensibles
  
    
  
    public class CuentaBancaria {

        public double saldo;

        public CuentaBancaria(double saldoInicial) {
            saldo = saldoInicial;
        }
    }

Explicación: Aunque el código compila, es una mala práctica exponer atributos sensibles como public, ya que permite un acceso descontrolado y
 compromete la seguridad de los datos.
  */

}












