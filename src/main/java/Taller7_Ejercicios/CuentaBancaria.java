
package Taller7_Ejercicios;

/*
 Ejercicio 2: Clase CuentaBancaria
 
Crea una clase CuentaBancaria con las propiedades numeroCuenta (privada), saldo (privada) y tipoCuenta (pública). Define:
 1. Métodos públicos get y set para saldo.
 2. Un método público para mostrar los detalles de la cuenta.
 3. Crea una clase de prueba que intente acceder directamente a numeroCuenta y observe los errores de compilación.
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {"
                + "Tipo de cuenta: " + tipoCuenta
                + ", Saldo: $" + saldo
                + "}";
    }
}
