
package Taller4_Ejercicios;


public class PruebaCoche {

    public static void main(String[] args) {
        Coche coche1 = new Coche();

        // Las siguientes líneas generan error de compilación porque los atributos son privados
        // coche1.marca = "Toyota";
        // coche1.modelo = "Hilux";
        // coche1.velocidadMaxima = 190;
        
        // Solo se puede acceder a métodos públicos
        coche1.acelerar(20);
        coche1.acelerar(-5);  // Intento inválido
    }
}

