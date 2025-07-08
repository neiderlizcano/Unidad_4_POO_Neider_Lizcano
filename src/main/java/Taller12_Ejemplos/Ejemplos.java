
package Taller12_Ejemplos;


public class Ejemplos {
  /*  
 Taller: Herencia Múltiple en Java (Uso de Interfaces)
         
 Objetivo del Taller:
         
 En este taller, los estudiantes aprenderán a implementar herencia múltiple en Java utilizando interfaces. A lo largo del taller, se explicará qué es la
 herencia múltiple, por qué Java no permite herencia múltiple con clases, y cuál es el propósito de las interfaces. Además, se discutirán las características
 de las interfaces, sus diferencias con las clases abstractas, y cómo se pueden utilizar para implementar herencia múltiple de manera correcta y crear
 jerarquías de clases. Se proporcionarán ejemplos prácticos y ejercicios para reforzar los conceptos.
 
 Temario Expandido:
         
 1. Contextualización y Definición de Herencia Múltiple con Interfaces
 ○ ¿Quéeslaherencia múltiple y por qué Java no la permite directamente con clases?
 ○ ¿Quésonlas interfaces?
 ○ Definición y propósito de las interfaces.
 ○ Diferencias entre interfaces y clases abstractas.
         
 2. Objetivos de la Herencia Múltiple con Interfaces
 ○ Definir contratos claros para clases.
 ○ Desacoplar la implementación.
 ○ Permitir la implementación de múltiples comportamientos.
 ○ Facilitar la organización y el mantenimiento del código.
         
 3. Cuándo Usar y Cuándo No Usar la Herencia Múltiple
 ○ Casos recomendados y no recomendados.
         
 4. Sintaxis y Estructura de las Interfaces
 ○ Definición de interfaces en Java.
 ○ Métodos abstractos y métodos predeterminados (default) en interfaces.
 ○ Usodelapalabra clave implements.
         
 5. Ejemplos de Uso Correcto
 ○ Ejemplos prácticos de implementación de herencia múltiple con interfaces.
 ○ Ejemplos con métodos predeterminados.
         
 6. Ejemplos de Uso Incorrecto con Errores de Compilación
 ○ Ejemplos que violan las reglas de las interfaces y no compilan.
         
 7. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 ○ Ejemplos de malas prácticas que no generan errores.
         
 8. Ejercicios Propuestos
 ○ Ejercicios para poner en práctica la herencia múltiple de manera correcta e incorrecta.
 
 Contextualización y Definición de Herencia Múltiple con Interfaces
         
 ¿Qué es la Herencia Múltiple?
         
 La herencia múltiple permite que una clase herede atributos y métodos de múltiples clases. Sin embargo, en Java, esta forma de herencia no se permite
 directamente para evitar ambigüedades y problemas de diseño conocidos como el problema del diamante. Este problema ocurre cuando una clase
 derivada hereda de dos clases base que tienen métodos o atributos con el mismo nombre, lo cual genera confusión sobre cuál método o atributo debe ser
 heredado por la clase derivada.
 Para resolver esto, Java introduce interfaces, que son un mecanismo para lograr herencia múltiple de manera controlada y segura.
 
¿Qué son las Interfaces?
         
 En Java, una interfaz es una colección de métodos abstractos (sin cuerpo) que definen un contrato que las clases deben implementar. Las interfaces
 permiten definir un conjunto de métodos que diferentes clases deben cumplir, y una clase puede implementar múltiples interfaces, logrando así una forma
 de herencia múltiple.
         
 
 Diferencias entre Interfaces y Clases Abstractas:
         
 ● Interfaces: Definen métodos abstractos de forma predeterminada. A partir de Java 8, pueden contener métodos predeterminados (default) y
 métodos estáticos.
 ● ClasesAbstractas: Pueden contener métodos abstractos y métodos con implementación. También pueden tener atributos y constructores.
 Objetivos de la Herencia Múltiple con Interfaces
 Objetivos Clave:

 ● Definir Contratos: Permitir que diferentes clases implementen las mismas operaciones, asegurando consistencia y limpieza en el código.
 ● Desacoplar la Implementación: Al separar la definición de un comportamiento de su implementación específica, las interfaces facilitan un diseño
 flexible y desacoplado.
 ● Permitir Múltiples Comportamientos: Las interfaces permiten que una clase tenga múltiples comportamientos relacionados al implementar varias
 interfaces sin estar limitadas por una única jerarquía de clases.   
 
 
 
 Cuándo Usar y Cuándo No Usar las Interfaces para la Herencia Múltiple
 Cuándo Usar Interfaces para Herencia Múltiple:
         
 ● Cuando una clase debe tener múltiples comportamientos no relacionados entre sí.
 ● Cuando se desea definir un conjunto de métodos que diferentes clases deben implementar.
 ● Cuando se necesita desacoplar la definición de un comportamiento de su implementación.
 ● Cuando se desea garantizar que varias clases diferentes tengan un conjunto común de métodos.
 Cuándo No Usar Interfaces para Herencia Múltiple:
 ● Cuando se necesita compartir atributos o métodos con una implementación común.
 ● Cuando se necesita establecer relaciones jerárquicas de "es-un" (herencia de clases).
 ● Cuando se definen capacidades innecesarias en una clase, complicando el diseño.
 Sintaxis y Estructura de las Interfaces
 Definición Básica de Interfaces:
 Las interfaces se definen utilizando la palabra clave interface. Los métodos definidos en una interfaz son abstractos de manera implícita, lo que
 significa que no tienen cuerpo, a menos que se declaren explícitamente como predeterminados (default) o estáticos.
 
 
// Definición de una interfaz
 public interface Volador {

        void volar(); // Método abstracto
    }
    // Definición de una clase que implementa una interfaz

    public class Pajaro implements Volador {

        @Override
        public void volar() {
            System.out.println("El pájaro está volando.");
        }
    }

    Interfaces con

    Métodos Predeterminados(default) 
        y Métodos Estáticos:
        A  partir de Java 8, se permite la inclusión de métodos predeterminados(default ) y métodos estáticos en las interfaces. Los métodos predeterminados
 permiten proporcionar una implementación por defecto, mientras que los métodos estáticos no pueden ser sobrescritos por las clases que implementan la
 interfaz.    
    
  // Definición de una interfaz con un método predeterminado y un método abstracto
 public interface Saludador {
 
 void saludar(); // Método abstracto
 
 default void decirAdios() {
 
 System.out.println("Adiós."); }
 
 static void mostrarMensaje() {
 
 System.out.println("Este es un mensaje estático de la interfaz.");
 }
}
 
Implementación de Múltiples Interfaces:    
    
 Una clase puede implementar múltiples interfaces separándolas por comas.

public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}

Reglas Básicas:
- Una clase puede implementar múltiples interfaces separándolas por comas.
- La clase que implementa una interfaz debe proporcionar implementaciones para todos los métodos de la interfaz.

Ejemplos de Uso Correcto e Incorrecto de Herencia Múltiple con Interfaces
5. Ejemplos de Uso Correcto
Ejemplo Correcto 1: Implementación de Múltiples Interfaces

 // Interfaz Volador
 public interface Volador {

    void volar();
}
// Interfaz Nadador

public interface Nadador {

    void nadar();
}
// Clase Pato que implementa ambas interfaces

public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
// Clase de prueba

public class Main {

    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
    }
}

 Explicación: La clase Pato implementados interfaces(Volador y Nadador).EstopermitequePatotengadoscomportamientosdiferentes:volary
 nadar.

Ejemplo Correcto2: Clase Robot que Implementa Interfaces de Caminador y Hablador

 // Interfaz Caminador
 public interface Caminador {

    void caminar();
}
// Interfaz Hablador

public interface Hablador {

    void hablar();
}
// Clase Robot que implementa ambas interfaces

public class Robot implements Caminador, Hablador {

    @Override
    public void caminar() {
        System.out.println("El robot está caminando.");
    }

    @Override
    public void hablar() {
        System.out.println("El robot está hablando.");
    }
}

Explicación:

La clase Robot implementa dos interfaces (Caminador y Hablador). Esto permite que Robot tenga dos comportamientos independientes: caminar y hablar.

Ejemplo Correcto 3: Uso de Métodos Predeterminados en Interfaces


// Interfaz Vehiculo con un método abstracto y un método predeterminado
 public interface Vehiculo {

    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
// Clase Coche que implementa la interfaz Vehiculo

public class Coche implements Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}   

6.Ejemplos de Uso Incorrecto con Errores de Compilación
 EjemploIncorrecto1: No Implementar Todos los Métodos de la Interfaz    

    
// Interfaz Volador
 public interface Volador {

    void volar();
}
// Clase incorrecta que no implementa todos los métodos

public class Avion implements Volador {
    // Error de compilación: La clase Avion debe implementar el método volar()
}
    
Explicación: La clase Avion no implementa el método volar de la interfazVolador, locualgeneraunerrordecompilación.
 EjemploIncorrecto2:ConflictodeMétodosenInterfaces
 // Interfaz Volador
 public interface Volador {

    default void despegar() {
        System.out.println("Volador despega.");
    }
}
// Interfaz Nadador

public interface Nadador {

    default void despegar() {
        System.out.println("Nadador despega.");
    }
}
// Clase incorrecta que implementa ambas interfaces

public class Anfibio implements Volador, Nadador {
    // Error de compilación: conflicto entre los métodos predeterminados de las interfaces
}


7.Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 EjemploIncorrecto1:Implementación Innecesaria de Interfaces
 // Interfaz Corredor
 public interface Corredor {

    void correr();
}
// Clase incorrecta que implementa la interfaz pero no tiene lógica relacionada

public class Arbol implements Corredor {

    @Override
    public void correr() {
        // El árbol no tiene una lógica para correr, lo cual no tiene sentido
        System.out.println("Los árboles no pueden correr.");
    }
}

Explicación

:Implementar la interfaz Corredor de una clase Arbol no tiene sentido,yaquelosárbolesnotienenunalógicarelacionadaconcorrer.Esta
 esunamalapráctica,aunqueelcódigocompila.
 EjemploIncorrecto2:ImplementaciónInnecesariadeInterfacesenClasesSinSentido
 // Interfaz Movible
 public interface Movible {

    void moverse();
}
 // Clase incorrecta que implementa una interfaz innecesaria
 public class Casa implements Movible {
     @Override
 public void moverse() {
 // La lógica aquí no tiene sentido para una Casa
 System.out.println("Las casas no se mueven.");
 }
 }

Explicación: Aunque el código compila, implementar una interfaz que no tiene sentido para la clase Casa es una mala práctica. Las clases deben
 implementar interfaces solo cuando la lógica de la clase está alineada con los métodos definidos en la interfaz
*/
}
