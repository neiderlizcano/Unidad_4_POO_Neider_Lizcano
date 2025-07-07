
package Taller7_Ejercicios;

/*Ejercicio 2: Clase CuentaBancaria Crea una clase CuentaBancaria con las propiedades numeroCuenta (privada), saldo (privada) y tipoCuenta (pública). Define:
- Métodos públicos get y set para saldo.
- Unmétodo público para mostrar los detalles de la cuenta.
- Crea una clase de prueba que intente acceder directamente a numeroCuenta y observe los errores de compilación.
 */

public class PruebaCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.tipoCuenta = "Corriente";
        cuenta.setSaldo(3000.0);

        // Aca sucedera un error porque el atributo es privado
        // cuenta.numeroCuenta = "12345678"; // Error de compilación

 
        System.out.println(cuenta.toString());
    }
}    

