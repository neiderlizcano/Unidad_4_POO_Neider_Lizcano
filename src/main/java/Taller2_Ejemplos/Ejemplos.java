package Taller2_Ejemplos;

public class Ejemplos {

    /* Taller: El Uso de this en Java
 Objetivo del Taller:
 En este taller, los estudiantes aprenderán a comprender y utilizar correctamente la palabra clave this en Java. Se explicará qué es this, su propósito y
 cómo puede facilitar el desarrollo de clases y métodos en la programación orientada a objetos.
 Temario:
 1. Contextualización y Definición de this
 - ¿QuéesthisenJava?
 - ¿Cómoseutiliza y cuál es su propósito?
 2. Objetivos del Uso de this
 - Diferenciar entre atributos y parámetros.
 - Llamar a otros constructores de la misma clase.
 - Referenciar el objeto actual.
 3. Cuándo Usar y Cuándo No Usar this
 - Casosrecomendados y no recomendados.
 4. Ejemplos de Uso Correcto
 - Ejemplos prácticos de la palabra clave this.
 5. Ejemplos de Uso Incorrecto con Errores de Compilación
 - Ejemplos que violan las reglas del uso de this y no compilan.
 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 - Ejemplos que son malas prácticas pero que no generan errores.
 7. Ejercicios Propuestos
 - Ejercicios para poner en práctica el uso correcto e incorrecto de this

 1. Contextualización y Definición de this
 ¿Qué es this en Java?
 En Java, la palabra clave this se utiliza para referirse al objeto actual dentro de un método o constructor. Es una forma de decir "este objeto" y se utiliza
 para diferenciar entre los atributos de la clase y los parámetros de un método o constructor.
 Propósito de this:
    
 ● Ayudaaresolver ambigüedades entre los nombres de los parámetros y los nombres de los atributos.
 ● Permite a un objeto referenciarse a sí mismo.
 ● Facilita la llamada a otros constructores de la misma clase.
    
 2. Objetivos del Uso de this
 Objetivos Principales:
    
 1. Diferenciar entre Atributos y Parámetros: Cuando los nombres de los atributos de la clase y los nombres de los parámetros de un método o
 constructor son iguales, this se utiliza para diferenciar el atributo del parámetro.
 2. Referenciar al Objeto Actual: Permite que un objeto se refiera a sí mismo, lo cual es útil para pasar el objeto como parámetro a otros métodos.
 3. Llamar a Otros Constructores de la Misma Clase: Se puede usar this() para invocar otro constructor de la misma clase y reutilizar lógica de
 inicialización.
    
 Ejemplo Simple de this para Diferenciar Atributos y Parámetros: */
    public class Persona {

        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre; // Usamos `this` para referirnos al atributo de la clase
        }

        public void mostrarNombre() {
            System.out.println("Nombre: " + this.nombre); // Usamos `this` para referirnos al atributo
        }
    }


    /* 3.Cuándo Usar y Cuándo No Usar this
    
Cuándo Usar this:
● Cuando hay ambigüedad entre un atributo y un parámetro.
● Para invocar otros constructores de la misma clase y evitar la repetición de código.
● Cuando se quiere pasar una referencia del objeto actual como argumento a otro método.
Cuándo No Usar this:
● En métodos estáticos (static), ya que this solo puede referenciar a instancias de la clase.
● Cuando no hay ambigüedad, la referencia al objeto actual no es necesaria.
    
Ejemplos de Uso Correcto
    
Ejemplo Correcto 1: Diferenciación de Atributos y Parámetros
     */
    public class Coche {

        private String marca;

        public Coche(String marca) {
            this.marca = marca; // Usamos `this` para referirnos al atributo de la clase  
        }

        public void setMarca(String marca) {
            this.marca = marca; // Usamos `this` para evitar la confusión entre el atributo y el parámetro  
        }

        public void mostrarMarca() {
            System.out.println("Marca: " + this.marca);
        }
    }

    /*
Explicación: En este ejemplo, this se usa para referirse al atributo marca y evitar confusiones con el parámetro marca en el constructor y el método setMarca.

Ejemplo Correcto 2: Llamada a Otro Constructor con this()

     */
    public class Coche {

        private String marca;
        private int velocidadMaxima;

        public Coche() {
            this("Desconocida", 0); // Llama al constructor de dos parámetros
        }

        public Coche(String marca, int velocidadMaxima) {
            this.marca = marca;
            this.velocidadMaxima = velocidadMaxima;
        }

        public void mostrarInformacion() {
            System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
        }
    }

//Explicación: Aquí, this() se utiliza para llamar a otro constructor de la misma clase, evitando la repetición de código y facilitando la inicialización.
//5. Ejemplos de Uso Incorrecto con Errores de Compilación
//Ejemplo Incorrecto 1: Uso de this en un Contexto Estático
//Explicación: Aquí, se intenta utilizar this en un método static, lo cual no es válido ya que this se refiere a una instancia de la clase y los métodos static no dependen de instancias.
    public class Persona {

        private String nombre;
    }

    public static void mostrarNombre() {
        System.out.println(this.nombre); // Error de compilación: No se puede usar `this` en un contexto estático
    }

//6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
//Ejemplo Incorrecto 2: Uso Innecesario de this sin Ambigüedad
    public class Persona {

        private String nombre;

        public void setNombre(String nombre) {
            this.nombre = nombre; // Aquí `this` es necesario
            // Uso innecesario de `this` dentro de un método sin ambigüedad
            this.mostrarNombre(); // Aunque compila, `this` aquí es innecesario
        }

        public void mostrarNombre() {
            System.out.println("Nombre: " + nombre); // `this` no es necesario aquí
        }
    }

    // Explicación: En este caso, aunque el uso de this no genera un error, es innecesario y puede llevar a un código menos claro. Evitar el uso excesivo de
    // this cuando no es necesario es una buena práctica.
}
