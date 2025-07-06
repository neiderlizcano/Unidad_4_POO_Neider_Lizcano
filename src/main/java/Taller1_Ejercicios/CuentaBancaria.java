package Taller1_Ejercicios;

public class CuentaBancaria {

    /*Ejercicio 2: Crear una clase CuentaBancaria
 Define una clase CuentaBancaria con las propiedades: numeroCuenta, saldo y tipoCuenta. Define:
 1. Un constructor por defecto.
 2. Un constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta).
 3. Un constructor sobrecargado con tres parámetros (numeroCuenta, saldo, y tipoCuenta).*/
    int numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Datos de la CuentaBancaria {\n"
                + "  Número de la Cuenta: '" + numeroCuenta + "',\n"
                + "  Saldo: " + saldo + ",\n"
                + "  Tipo de Cuenta: '" + tipoCuenta + "'\n"
                + '}';
    }

}
