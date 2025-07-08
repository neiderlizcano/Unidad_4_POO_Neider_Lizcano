
package Taller11_Ejercicios;

/**
Ejercicio1: Clase Figura y Clases Derivadas Circulo y Rectangulo
- Define unaclase abstracta Figura con un método abstracto calcularArea.
- Creados clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea
- Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área
 */
public abstract class Figura {
    public abstract double calcularArea(); 

    public void mostrarArea() { 
        System.out.println("Área: " + calcularArea());
    }
}

