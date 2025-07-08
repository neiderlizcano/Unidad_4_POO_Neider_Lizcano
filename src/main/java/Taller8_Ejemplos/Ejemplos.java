/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_Ejemplos;

public class Ejemplos {
/*
 Taller: Herencia Simple en Java

 Objetivo del Taller:

 En este taller, los estudiantes aprenderán el concepto de herencia simple en Java, sus ventajas y su correcta implementación. Se proporcionarán
 definiciones claras, se explicará cuándo y cómo utilizar la herencia, y se ofrecerán ejercicios prácticos para reforzar los conceptos.
 Temario:

 1. Contextualización y Definición de Herencia Simple
 ○ ¿Quéeslaherencia simple en Java?
 ○ Ventajas y propósito de la herencia simple.

 2. Objetivos de la Herencia Simple
 ○ Reutilización de código.
 ○ Extensión de funcionalidades.
 ○ Organización jerárquica de clases.

 3. Cuándo Usar y Cuándo No Usar la Herencia Simple
 ○ Casosrecomendados y no recomendados.

 4. Sintaxis de la Herencia Simple
 ○ Usodelapalabra clave extends.
 ○ Relación entre clases base y derivadas.

 5. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos de implementación de herencia simple.

 6. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas de la herencia y no compilan.

 7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos que son malas prácticas pero que no generan errores.

 8. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica la herencia simple de manera correcta e incorrecta. 
    
 1. Contextualización y Definición de Herencia Simple
         
 ¿Qué es la Herencia Simple en Java?
 
 En Java, la herencia es un mecanismo que permite a una clase derivada heredar los atributos y métodos de otra clase llamada clase base o clase padre.
 La herencia simple se refiere al hecho de que una clase puede heredar de una sola clase padre, estableciendo una relación "es-un" entre ambas.
 
 Ventajas de la Herencia Simple:
 ● Reutilización de Código: Permite reutilizar métodos y atributos definidos en la clase base.
 ● Extensión de Funcionalidades: La clase derivada puede agregar nuevas funcionalidades o especializar los comportamientos de la clase base.
 ● Organización Jerárquica: Facilita la organización y la estructura lógica del código en jerarquías de clases.
 
 2. Objetivos de la Herencia Simple
 El principal objetivo de la herencia simple es reutilizar y extender el código. Al heredar de una clase base, una clase derivada obtiene todos los miembros
 públicos y protegidos de la clase base, permitiendo la creación de nuevas funcionalidades sin duplicar el código.
 
 Objetivos Clave:
 
 ● Reutilizar código: Aprovechar métodos y atributos de la clase base para evitar la duplicación.
 ● Extender funcionalidades: Agregar comportamientos específicos en la clase derivada.
 ● Definir relaciones jerárquicas: Establecer una estructura lógica de jerarquías entre clases relacionadas.
 
 3. Cuándo Usar y Cuándo No Usar la Herencia Simple
         
 Cuándo Usar Herencia Simple:
 
 ● Cuandosedesea crear una nueva clase que extienda las características de una clase existente.
 ● Cuandoseestablece una relación lógica "es-un" entre una clase base y una clase derivada.
 ● Cuandosequiere evitar la duplicación de código entre clases relacionadas.
 
 Cuándo No Usar Herencia Simple:
 
 ● Cuandonoexiste una relación lógica clara entre las clases.
 ● Cuandola relación entre clases es de tipo "tiene-un" (composición), en lugar de "es-un".
 ● Cuandosepueden usar otros mecanismos, como la delegación o la composición, para lograr la misma funcionalidad de manera más efectiva.

4. Sintaxis de la Herencia Simple
    
En Java, la palabra clave extends se utiliza para declarar una clase derivada que hereda de una clase base.
Sintaxis Básica de la Herencia
   
    public class ClaseBase {
        // Atributos y métodos de la clase base
    }

    public class ClaseDerivada extends ClaseBase {
        // Atributos y métodos de la clase derivada
    }
    
    
Reglas Básicas

- Una clase derivada hereda todos los atributos y métodos públicos y protegidos de la clase base.
- La clase derivada puede agregar sus propios atributos y métodos.
- La clase derivada puede sobrescribir (override) métodos de la clase base para proporcionar una implementación más específica.

5. Ejemplos de Uso Correcto

Ejemplo Correcto 1: Clase Animal y Clase Perro
 
    // Clase base

    public class Animal {

        protected String especie;

        public Animal(String especie) {
            this.especie = especie;
        }

        public void emitirSonido() {
            System.out.println("El animal hace un sonido.");
        }

        public void mostrarEspecie() {
            System.out.println("Especie: " + especie);
        }
    }
    // Clase derivada

    public class Perro extends Animal {

        private String raza;

        public Perro(String especie, String raza) {
            super(especie); // Llama al constructor de la clase base
            this.raza = raza;
        }

        public void ladrar() {
            System.out.println("El perro ladra.");
        }

        @Override
        public void emitirSonido() {
            System.out.println("El perro ladra.");
        }
    }
Ejemplo Correcto 2: Clase Empleado y Clase Gerente

// Clase base
    public class Empleado {

        protected String nombre;
        protected double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public void mostrarDetalles() {
            System.out.println("Nombre: " + nombre + ", Salario: " + salario);
        }
    }
    // Clase derivada

    public class Gerente extends Empleado {

        private String departamento;

        public Gerente(String nombre, double salario, String departamento) {
            super(nombre, salario);
            this.departamento = departamento;
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Departamento: " + departamento);
        }
    }

Explicación:
La clase Gerente hereda los atributos y métodos de la clase Empleado, y agrega su propio atributo departamento.
También sobrescribe el método mostrarDetalles para incluir información adicional.

6. Ejemplos de Uso Incorrecto con Errores de Compilación
Ejemplo Incorrecto 1: Intentar heredar de múltiples clases

    // Clase base 1
    public class ClaseA {
    }
    // Clase base 2

    public class ClaseB {
    }
    // Clase derivada (incorrecta)

    public class ClaseC extends ClaseA 
    
, ClaseB { // Error de compilación
 }
 
    
    Explicación
    :
En Java, una clase no puede heredar de múltiples clases.Esto genera un error de compilación porque Java no admite la herencia múltiple.Ejemplo Incorrecto 2:
Intentar acceder a atributos privados de la clase base // Clase base


    public class Vehiculo {

        private String marca;

        public Vehiculo(String marca) {
            this.marca = marca;
        }
    }
    // Clase derivada (incorrecta)

    public class Coche extends Vehiculo {

        public void mostrarMarca() {
            System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
        }
    }

7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
Ejemplo Incorrecto 3: No usar super en el constructor

// Clase base
    public class Animal {

        private String especie;

        public Animal(String especie) {
            this.especie = especie;
        }
    }
    // Clase derivada (incorrecta)

    public class Perro extends Animal {

        public Perro(String raza) {
            // No se llama al constructor de la clase base
            System.out.println("Raza: " + raza);
        }
    }  
Explicación:
Aunque el código compila, no se llama explícitamente al constructor de la clase base.
Esto puede llevar a errores o comportamientos inesperados. 
*/
}
