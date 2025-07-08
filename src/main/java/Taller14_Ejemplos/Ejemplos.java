/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14_Ejemplos;

/**
 *
 * @author EA440 Operator
 */
public class Ejemplos {
    /*
    Taller: Polimorfismo en Java
    
    Objetivo del Taller:

En este taller, los estudiantes aprenderán el concepto de polimorfismo en Java, cómo permite a las clases derivadas especializar el comportamiento de la clase base, y cómo utilizar referencias de la clase base para invocar métodos en tiempo de ejecución. Se proporcionarán explicaciones claras, ejemplos prácticos, y ejercicios para reforzar estos conceptos.

Temario:

Contextualización y Definición del Polimorfismo
○ ¿Qué es el polimorfismo?
○ Tipos de polimorfismo en Java: estático y dinámico.

Objetivos del Uso del Polimorfismo
○ Reutilización de código y especialización de comportamientos.
○ Permitir la interacción uniforme entre diferentes tipos de objetos.

Cuándo Usar y Cuándo No Usar el Polimorfismo
○ Casos recomendados y no recomendados.

Sintaxis y Reglas del Polimorfismo
○ Uso de referencias de la clase base y métodos sobrescritos.

Ejemplos de Uso Correcto
○ Ejemplos prácticos que muestran la implementación y uso del polimorfismo.

Ejemplos de Uso Incorrecto con Errores de Compilación
○ Ejemplos que violan las reglas del polimorfismo y no compilan.

Ejemplos de Uso Incorrecto sin Generar Error de Compilación
○ Ejemplos que son malas prácticas pero que no generan errores.

Ejercicios Propuestos
○ Ejercicios para poner en práctica el uso correcto e incorrecto del polimorfismo.

Contextualización y Definición del Polimorfismo

¿Qué es el Polimorfismo?

El polimorfismo es un principio fundamental de la programación orientada a objetos que permite a un objeto de una clase derivada ser tratado como un objeto de su clase base. El polimorfismo permite que un mismo método tenga diferentes comportamientos según el objeto en el que se invoque.

Tipos de Polimorfismo en Java:

Polimorfismo Estático: También conocido como sobrecarga de métodos. Se determina en tiempo de compilación y permite definir múltiples métodos con el mismo nombre pero con diferentes firmas.

Polimorfismo Dinámico: También conocido como polimorfismo en tiempo de ejecución o sobrescritura de métodos. Permite que las referencias de la clase base apunten a objetos de la clase derivada y ejecuten el método sobrescrito en tiempo de ejecución.

Objetivos del Uso del Polimorfismo

Objetivos Clave:

Reutilización y Extensibilidad: Permitir que las clases derivadas especialicen el comportamiento heredado de la clase base.

Interacción Uniforme entre Objetos: Permitir que las referencias de la clase base inviquen métodos en objetos de las clases derivadas, facilitando el diseño modular y flexible.

Ejemplo Simple de Polimorfismo Dinámico:

java
Copiar código
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Muestra: El perro ladra.

        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Muestra: El gato maúlla.
    }
}
Cuándo Usar y Cuándo No Usar el Polimorfismo

Cuándo Usar el Polimorfismo:

● Cuando se desea que las clases derivadas proporcionen su propia implementación de métodos heredados de la clase base.
● Cuando se necesita permitir que un mismo método tenga diferentes comportamientos según el objeto que lo invoque.
● Cuando se necesita un diseño flexible y extensible.

Cuándo No Usar el Polimorfismo:

● Cuando no se requiere que las clases derivadas modifiquen el comportamiento de la clase base.
● Cuando el diseño de la aplicación no requiere la utilización de jerarquías de clases o herencia.

Sintaxis y Reglas del Polimorfismo

Uso de Referencias de la Clase Base:

En polimorfismo dinámico, se utiliza una referencia de la clase base para apuntar a un objeto de la clase derivada. Los métodos sobrescritos en la clase derivada se ejecutarán en función del objeto referenciado en tiempo de ejecución.

java
Copiar código
public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

public class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche se está moviendo.");
    }
}

public class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo.");
    }
}
Ejemplos de Uso Correcto

Ejemplo Correcto 1: Uso de Polimorfismo para Definir Comportamientos Específicos

java
Copiar código
// Clase base
public class Empleado {
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}

// Clases derivadas
public class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}

public class Ingeniero extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El ingeniero está diseñando.");
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();

        empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
        empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
    }
}
Explicación: La referencia de la clase base Empleado apunta a objetos de diferentes clases derivadas (Gerente e Ingeniero). Esto permite invocar métodos de manera polimórfica.

Ejemplos de Uso Incorrecto con Errores de Compilación

Ejemplo Incorrecto 1: Intentar Invocar un Método que No Existe en la Clase Base

java
Copiar código
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

public class Perro extends Animal {
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.correr(); // Error de compilación: El método correr() no existe en Animal
    }
}
Explicación: Aunque miAnimal apunta a un objeto de tipo Perro, solo se pueden invocar los métodos que existen en la clase base Animal.

Ejemplos de Uso Incorrecto sin Generar Error de Compilación

Ejemplo Incorrecto 2: Uso Innecesario de Polimorfismo

java
Copiar código
public class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

public class Moto extends Vehiculo {
    @Override
    public void mover() {
        super.mover(); // Uso innecesario si no se modifica el comportamiento
    }
}
Explicación: Aunque el código compila, llamar a super.mover() desde Moto es innecesario si no se modifica el comportamiento.
    */
}
