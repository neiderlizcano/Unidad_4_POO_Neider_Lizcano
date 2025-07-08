
package Taller11_Ejercicios;

/**
Ejercicio1: Clase Figura y Clases Derivadas Circulo y Rectangulo
- Define unaclase abstracta Figura con un método abstracto calcularArea.
- Creados clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea
- Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
