/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10_Ejemplos;
public class Ejemplos {
    
}
/**
 Taller: Sobrescritura de Métodos en Java
 
 Objetivo del Taller:
 
 En este taller, los estudiantes aprenderán el concepto de sobrescritura de métodos en Java, sus reglas y su propósito en la programación orientada a
 objetos. Se proporcionarán explicaciones claras sobre cómo y cuándo sobrescribir métodos, y se mostrarán ejemplos prácticos y ejercicios para reforzar
 estos conceptos. Además, se explicarán las diferencias entre la sobrescritura y la sobrecarga de métodos.
 
 Temario:
 1. Contextualización y Definición de la Sobrescritura de Métodos
 ○ ¿Qué es lasobrescritura de métodos?
 ○ Diferencias entre sobrescritura y sobrecarga de métodos.
 
 2. Objetivos de la Sobrescritura de Métodos
 ○ Permitir el polimorfismo.
 ○ Especializar el comportamiento heredado de una clase base.

 3. Cuándo Usar y Cuándo No Usar la Sobrescritura de Métodos
 ○ Casos recomendados y no recomendados.
 
 4. Sintaxis y Reglas de la Sobrescritura de Métodos
 ○ Usod elaanotación @Override.
 ○ Reglas básicas para sobrescribir métodos correctamente.
 
 5. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos de sobrescritura de métodos.
 
 6. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas de la sobrescritura y no compilan.
 
 7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos que son malas prácticas pero que no generan errores.
 
 8. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica el uso correcto e incorrecto de la sobrescritura de métodos
 
 
  1. Contextualización y Definición de la Sobrescritura de Métodos
 ¿Qué es la Sobrescritura de Métodos?
 
 La sobrescritura de métodos es un mecanismo en Java que permite a una clase derivada proporcionar una implementación específica de un método que
 ya existe en su clase base. La sobrescritura se utiliza para modificar o extender el comportamiento heredado sin cambiar el código original de la clase
 base.
 
 Diferencias Entre Sobrescritura y Sobrecarga de Métodos:
 
 ● Sobrescritura: Se refiere a redefinir un método en una clase derivada que ya existe en la clase base con la misma firma (nombre y parámetros).
 Permite especializar el comportamiento heredado.
 ● Sobrecarga: Consiste en definir múltiples métodos con el mismo nombre dentro de la misma clase, pero con diferentes firmas (distintos tipos o
 números de parámetros). Permite variar la funcionalidad de un método.
 
 2. Objetivos de la Sobrescritura de Métodos
 Objetivos Clave:
 
 1. Permitir el Polimorfismo: La sobrescritura de métodos permite el polimorfismo, es decir, que una referencia a la clase base pueda invocar
 métodos de la clase derivada en tiempo de ejecución.
 
 2. Especializar el Comportamiento: Permite a las clases derivadas especializar o modificar el comportamiento de los métodos heredados de la
 clase base.
 
 3. Cuándo Usar y Cuándo No Usar la Sobrescritura de Métodos
 Cuándo Usar la Sobrescritura de Métodos:
 
 ● Cuando se desea modificar el comportamiento heredado de una clase base para adaptarlo a una clase derivada.
 ● Cuando se requiere implementar métodos específicos en una jerarquía de clases que comparten un comportamiento común.
 Cuándo No Usar la Sobrescritura de Métodos:
 ● Cuando se desea agregar nuevas funcionalidades en lugar de modificar un método existente (se puede crear un nuevo método en lugar de
 sobrescribir)
 ● Cuando no se necesita modificar el comportamiento heredado.
 
4. Sintaxis y Reglas de la Sobrescritura de Métodos
Uso de la Anotación @Override:

En Java, se utiliza la anotación @Override para indicar que un método está sobrescribiendo un método de la clase base. Esta anotación no es obligatoria, pero es una buena práctica ya que ayuda a detectar errores en tiempo de compilación.
Reglas Básicas de la Sobrescritura:
- El método en la clase derivada debe tener el mismo nombre y la misma lista de parámetros que el método en la clase base.
- El tipo de retorno del método sobrescrito debe ser el mismo o compatible con el tipo de retorno del método en la clase base.
- El método en la clase derivada no puede tener un nivel de acceso más restrictivo que el método en la clase base.
- Solo se pueden sobrescribir métodos que no sean final o private.

Ejemplo de Sobrescritura de un Método:

// Clase base
public class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
// Clase derivada

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

5.Ejemplos de Uso Correcto
 Ejemplo Correcto1: Clase Empleado y Clase Gerente
  
 // Clase base
 public class Empleado {

    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}
// Clase derivada

public class Gerente extends Empleado {

    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}
 Ejemplo Correcto 2: Uso de la Sobrescritura para Permitir el Polimorfismo
Explicación:
La clase Gerente sobrescribe el método trabajar() de su clase base (por ejemplo, Empleado) para proporcionar un comportamiento más específico. Esto permite aplicar polimorfismo, donde una misma llamada a trabajar() se comporta de forma distinta según el tipo de objeto que la invoque.

 
 
public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente(); // Polimorfismo
        empleado.trabajar(); // Muestra: El empleado está trabajando.
        gerente.trabajar(); // Muestra: El gerente está gestionando el equipo.
    }
}

6. Ejemplos de Uso Incorrecto con Errores de Compilación
Ejemplo Incorrecto 1: Método Sobrescrito con Diferente Firma

// Clase base
public class Vehiculo {

    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}
// Clase derivada (incorrecta)

public class Coche extends Vehiculo {
    // Error de compilación: Diferente firma del método

    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}

7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
Ejemplo Incorrecto 2: Sobrescribir un Método sin Usar @Override

// Clase base
public class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
// Clase derivada (sin usar @Override)

public class Gato extends Animal {

    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}

Explicación:
Aunque el código compila y funciona, no usar @Override puede llevar a errores difíciles de detectar, especialmente si se cambian los métodos en la clase base.

 
*/
