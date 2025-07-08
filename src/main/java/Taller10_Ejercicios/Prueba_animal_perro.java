package Taller10_Ejercicios;

/**
 * Ejercicio 3: Uso Incorrecto de Sobrescritura 1. Intenta sobrescribir un
 * método en una clase derivada cambiando su firma y observa los errores de
 * compilación. 2. Sobrescribe un método sin usar @Override y analiza por qué es
 * una mala práctica
 */
public class Prueba_animal_perro {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal perro = new Perro(); // Polimorfismo

        animal.hacerSonido(); // 
                perro.hacerSonido();  // 
        // perro.hacerSonido("guau"); // Error de compilación si la variable es de tipo Animal
    }
}
