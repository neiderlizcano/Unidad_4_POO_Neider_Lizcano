
package Taller6_Ejemplos;

public class Ejemplos {
    
    
    /*
 1. Contextualización y Definición del Modificador protected
    
 El modificador de acceso protected en Java proporciona un nivel de visibilidad intermedio. Los miembros de una clase (atributos o métodos) definidos
 como protected son accesibles desde:
    
 ● La misma clase.
 ● Subclases, incluso si están en diferentes paquetes.
 ● Clases del mismo paquete.
    
 Definición Técnica:
 ● Un miembro declarado como protected puede ser accedido directamente desde la misma clase, desde las subclases (tanto en el mismo paquete
 como en un paquete diferente), y desde otras clases dentro del mismo paquete.
 Ejemplo:
    
    // Clase base en un paquete específico
    package vehiculos ;

    public class Vehiculo {

        protected String tipo;

        public Vehiculo(String tipo) {
            this.tipo = tipo;
        }
    }

 2. Objetivos del Uso de protected
    
 El uso del modificador protected cumple con varios objetivos clave en la programación orientada a objetos, especialmente en el contexto de la herencia:
    
 ● Permitir la Herencia Controlada: Permite a las subclases acceder y sobrescribir métodos o atributos protegidos de la clase base, proporcionando
 una forma segura de extender funcionalidad.
    
 ● Protección de Datos para Subclases: Proporciona un nivel de protección más elevado que public al limitar el acceso desde clases que no
 heredan de la clase base
    
    
   3. Cuándo Usar y Cuándo No Usar el Modificador protected
    
Cuándo Usar protected:
- Cuando se desea que un atributo o método sea accesible para subclases en diferentes paquetes.
- Para permitir que las subclases sobrescriban métodos protegidos de la clase base.
- Para proteger detalles de implementación que solo deben ser conocidos por subclases o clases relacionadas.

    Cuándo No Usar protected:
- En atributos que necesitan ser completamente encapsulados y no deben ser accesibles ni siquiera desde subclases.
- En métodos que no deben ser modificados por subclases para preservar la integridad del comportamiento de la clase.

 4.EjemplosdeUsoCorrecto
 Ejemplo Correcto1:Atributos protected en una Clase Base
    

    package vehiculos ;

    public class Vehiculo {

        protected String marca;
        protected double velocidad;

        public Vehiculo(String marca, double velocidad) {
            this.marca = marca;
            this.velocidad = velocidad;
        }

        protected void mostrarDetalles() {
            System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
        }
    }
    // Clase derivada en el mismo paquete
    package vehiculos ;

    public class Coche extends Vehiculo {

        private int puertas;

        public Coche(String marca, double velocidad, int puertas) {
            super(marca, velocidad);
            this.puertas = puertas;
        }

        public void mostrarInformacion() {
            mostrarDetalles(); // Accede al método protegido de la clase base
            System.out.println("Número de puertas: " + puertas);
        }
    }

 Ejemplo Correcto 2: Métodos protected que pueden ser Sobrescritos


    package animales ;

    public class Animal {

        protected String especie;

        public Animal(String especie) {
            this.especie = especie;
        }

        protected void emitirSonido() {
            System.out.println("El animal hace un sonido.");
        }
    }
    package animales ;

    public class Perro extends Animal {

        public Perro(String especie) {
            super(especie);
        }

        @Override
        protected void emitirSonido() {
            System.out.println("El perro ladra.");
        }
    }

 Explicación: En este ejemplo, el método emitirSonido es protected en la clase Animal, lo que permite que la subclase Perro lo sobrescriba para
 proporcionar su propia implementación

    
5. Ejemplos de Uso Incorrecto con Errores de Compilación
    
 Ejemplo Incorrecto 1: Intentar Acceder a un Miembro protected Desde una Clase No Relacionada    
    

// Paquete: paquete1
    package paquete1 ;

    public class Persona {

        protected String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }
    // Paquete: paquete2
    package paquete2 ;
    import paquete1.Persona ;

    public class Main {

        public static void main(String[] args) {
            Persona p = new Persona("Juan");
            System.out.println(p.nombre); // Error de compilación: nombre tiene acceso protegido
        }
    }

 6. Ejemplos de Uso Incorrecto sin Generar Error de Compilación
 Ejemplo Incorrecto 2: Uso Inadecuado de protected en Datos Sensibles

    package seguridad ;

    public class Usuario {

        protected String contraseña; // No debería ser `protected`

        public Usuario(String contraseña) {
            this.contraseña = contraseña;
        }
    }

 Explicación: Aunque el código compila, es una mala práctica permitir que subclases o clases del mismo paquete accedan directamente a datos sensibles
 como la contraseña.
    
*/
}
