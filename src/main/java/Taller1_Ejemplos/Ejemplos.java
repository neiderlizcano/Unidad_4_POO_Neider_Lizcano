package Taller1_Ejemplos;

public class Ejemplo1 {

// Los constructores en Java son bloques de código que se ejecutan cuando se crea una instancia de una clase. Su principal función es inicializar el objeto
// con valores iniciales.
// Características de un Constructor:
// - Notiene un tipo de retorno (ni siquiera void).
// - Tiene el mismo nombre que la clase.
// - Puedeser sobrecargado para aceptar diferentes conjuntos de parámetros.
// Ejemplo de Constructor Simple:
    public class Persona {

        String nombre;
        // Constructor

        public Persona() {
            nombre = "Sin nombre";
        }
    }

//2. Tipos de Constructores en Java
    //2.1. Constructor por defecto
    //Es un constructor sin parámetros que inicializa las propiedades con valores predeterminados
    public class Coche {

        String marca;
        // Constructor por defecto

        public Coche() {
            marca = "Desconocida";
        }
    }

    // 2.2. Constructor Parametrizado
    // Se usa para inicializar propiedades con valores proporcionados por el usuario.
    public class Coche {

        String marca;
        // Constructor parametrizado

        public Coche(String marca) {
            this.marca = marca;
            // 2.3. Sobrecarga de Constructores
            // Es posible definir múltiples constructores dentro de la misma clase, cada uno con un conjunto diferente de parámetros
   
        public class Coche {

            String marca;
            String modelo;
            // Constructor por defecto

            public Coche() {
                this.marca = "Desconocida";
            }
            // Constructor parametrizado

            public Coche(String marca) {
                this.marca = marca;
            }
            // Constructor sobrecargado con dos parámetros

            public Coche(String marca, String modelo) {
                this.marca = marca;
                this.modelo = modelo;
            }
        }

        // 3. Uso de this() y super()
        // 3.1. this(): Llamada a otro constructor en la misma clase    
        public class Coche {

            String marca;
            String modelo;
            // Constructor con un parámetro

            public Coche(String marca) {
                this.marca = marca;
            }
        }

        // 3.2. super(): Llamada al constructor de la clase padre
        //Se utiliza en herencia para llamar al constructor de la clase base.
        public class Vehiculo {

            String tipo;

            public Vehiculo(String tipo) {
                this.tipo = tipo;
            }
        }

        public class Coche extends Vehiculo {

            String marca;
            // Llama al constructor de la clase base usando `super()`

            public Coche(String tipo, String marca) {
                super(tipo);
                this.marca = marca;
            }
        }

// 4. Buenas Prácticas con Constructores
// - Encapsulamiento: Utilizar los constructores junto con los métodos get y set para controlar el acceso a las propiedades.
// - Validación de datos: Validar los datos en los constructores para evitar asignar valores inconsistentes a las propiedades del objeto
    }























