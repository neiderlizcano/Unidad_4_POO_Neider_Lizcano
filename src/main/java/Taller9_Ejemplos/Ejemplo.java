/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9_Ejemplos;

/**
Taller: Uso de super en Java
 
 Objetivo del Taller:
 
 En este taller, los estudiantes aprenderán el propósito y el uso correcto de la palabra clave super en Java. Se explicará cómo se utiliza super para
 acceder a miembros y métodos de la clase base, así como para invocar constructores de la clase base. Se proporcionarán ejemplos prácticos y ejercicios
 para reforzar estos conceptos y evitar errores comunes.
 
 Temario:
 
 1. Contextualización y Definición del Uso de super
 ○ ¿QuéessuperenJava?
 ○ ¿Cómoseutiliza y cuál es su propósito?
 
 2. Objetivos del Uso de super
 ○ Accesoamiembros y métodos de la clase base.
 ○ Invocación de constructores de la clase base.

 3. Cuándo Usar y Cuándo No Usar super
 ○ Casosrecomendados y no recomendados.

 4. Sintaxis del Uso de super
 ○ Usodesuperpara acceder a métodos y atributos de la clase base.
 ○ Usodesuperpara invocar constructores de la clase base.

 5. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos que muestren la invocación de métodos y constructores.

 6. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas del uso de super y no compilan.
 
 7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos que son malas prácticas pero que no generan errores.
 
 8. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica el uso correcto e incorrecto de super.
 
 1. Contextualización y Definición del Uso de super
 
 ¿Qué es super en Java?
 
 En Java, la palabra clave super se utiliza para referirse a la clase base (también llamada clase padre) desde una clase derivada. super permite:
 ● Acceder a los métodos y atributos de la clase base que han sido heredados.
 ● Invocar constructores de la clase base desde el constructor de la clase derivada.
 
 Propósito de super:
 super se utiliza principalmente en el contexto de herencia, cuando se necesita hacer referencia explícita a miembros o métodos de la clase base, o
 invocar un constructor específico de la clase base desde la clase derivada.
 
 2. Objetivos del Uso de super
 Objetivos Principales:
 
 1. Acceder a Métodos y Atributos de la Clase Base: Cuando la clase derivada sobrescribe un método de la clase base, super permite invocar el
 método de la clase base para reutilizar su comportamiento.
 
 2. Invocar Constructores de la Clase Base: super permite a la clase derivada invocar el constructor de la clase base, lo cual es esencial para
 inicializar los miembros heredados correctamente.
 Ejemplo Simple de Uso de super para Invocar un Constructor:

public class Ejemplo {
    


 public class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
}

public class Perro extends Animal {

    private String raza;

    public Perro(String especie, String raza) {
        super(especie); // Llama al constructor de la clase base
        this.raza = raza;
    }
}

Cuándo usar super
- Cuando se necesita reutilizar el comportamiento de la clase base en un método sobrescrito.
- Cuando se necesita invocar el constructor de la clase base para inicializar atributos heredados.
- Cuando se requiere acceso explícito a miembros o métodos de la clase base que han sido ocultados o sobrescritos por la clase derivada.

Cuándo no usar super
- En métodos que no sobrescriben los métodos de la clase base.
- Cuando no se necesita invocar el constructor de la clase base explícitamente (Java invoca implícitamente el constructor por defecto de la clase base si no se utiliza super()).
- En contextos donde no hay herencia directa.

 4.Sintaxis del Uso de super
 Uso de super para Acceder a Métodos y Atributos de la Clase Base

 public class Empleado {
 protected String nombre;
 public void mostrarNombre() {
 System.out.println("Nombre: " + nombre);
 }
 }
 public class Gerente extends Empleado {
 private String departamento;
 @Override
 public void mostrarNombre() {
 super.mostrarNombre(); // Llama al método de la clase base
 System.out.println("Departamento: " + departamento);
 }
 
 * Uso de super para Invocar Constructores de la Clase Base:
 
public class Vehiculo {

    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche(String marca, int numeroDePuertas) {
         * super(marca); // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }
}

5.Ejemplos de Uso Correcto
 Ejemplo Correcto1: Invocar el Constructor de la Clase Base:

 public class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

public class Gato extends Animal {

    private String color;

    public Gato(String especie, String color) {
        super(especie); // Llama al constructor de la clase base
        this.color = color;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método de la clase base
        System.out.println("Color: " + color);
    }
}

6.Ejemplos de Uso Incorrecto con Errores de Compilación
 Ejemplo Incorrecto 1:Intentar Usar super Fuera del Contexto de una Clase Derivada
 public class Planta {

    private String tipo;

    public Planta(String tipo) {
        this.tipo = tipo;
    }
}

public class Main {

    public static void main(String[] args) {
        // Error: No se puede usar `super` aquí porque Main no es una clase derivada de Planta
        super.tipo = "Orquídea"; // Error de compilación
    }
}

 Ejemplo Incorrecto 2: Uso Innecesario de super

 public class Vehiculo {

    protected String tipo;

    public void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

public class Bicicleta extends Vehiculo {

    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario si el método no está sobrescrito o modificado
        System.out.println("Este es un tipo de bicicleta.");
    }
}

 Explicación: Aunque el uso de super aquí no genera un error de compilación, es innecesario, ya que el método mostrarTipo de la clase base no ha
 sido modificado. */