
package Taller10_Ejercicios;

/**
 Ejercicio 3: Uso Incorrecto de Sobrescritura
 1. Intenta sobrescribir un método en una clase derivada cambiando su firma y observa los errores de compilación.
 2. Sobrescribe un método sin usar @Override y analiza por qué es una mala práctica
 */
public class Perro extends Animal {

    // Este método NO sobrescribe correctamente porque cambia la firma
    //    (agrega un parámetro). Esto NO es una sobrescritura sino una sobrecarga.
    public void hacerSonido(String sonido) {
        System.out.println("El perro dice: " + sonido);
    }

    //    En cmbio este método, sí sobrescribe, pero no tiene @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

