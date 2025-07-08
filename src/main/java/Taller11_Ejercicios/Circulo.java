package Taller11_Ejercicios;

/**
Ejercicio1: Clase Figura y Clases Derivadas Circulo y Rectangulo
- Define unaclase abstracta Figura con un método abstracto calcularArea.
- Creados clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea
- Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
