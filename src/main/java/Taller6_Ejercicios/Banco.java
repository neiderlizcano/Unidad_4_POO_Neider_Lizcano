package Taller6_Ejercicios;

// Ejercicio 3: Uso Incorrecto de protected en Datos Críticos
// 1. Crea una clase Banco con la propiedad saldo como protected. Discute por qué esta implementación no es segura y cómo podría mejorar.
// 2. Propón una solución para encapsular la propiedad saldo de manera adecuada.

public class Banco {

    protected double saldo1;


// Discusión:
// Al usar 'protected' para el atributo saldo, cualquier subclase puede acceder directamente a ese dato, incluso si está en otros paquetes.
// Esto representa un riesgo, ya que se expone información crítica, como el saldo de la cuenta,
// y se abre la posibilidad de que se realicen modificaciones no controladas desde fuera de la clase.
// Por eso, en el caso de datos sensibles, se recomienda aplicar un control total de acceso y modificación,
// utilizando el modificador 'private' junto con métodos públicos que validen cada operación.

// Para mi forma de ver el ejericio propongo:
private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

// Lo propuse porque, al observar los ejercicios, el atributo 'saldo' está completamente encapsulado 
// y solo puede modificarse mediante métodos con validación, como 'depositar' o 'retirar'.
// Esto evita que subclases u otras clases externas puedan modificar directamente el saldo,
// lo cual es fundamental al tratarse de un dato muy delicado dentro de un sistema financiero.
}
