
package Taller4_Ejercicios;

// - Crea una clase que no implemente métodos get y set para un atributo private, y discute cómo podría afectar la protección de datos.

public class Perro {
    private String nombre, raza;
    private int edad;
    
}
/* Los atributos de la clase estan encapsulados correctamente, pero al no tener
metodos get o set que se usan para obtener o setear, no hay forma externa de consultar ni cambiarlos.
Por otra parte, puede causar porblemas si otro componente necesita validar o mostrar algun atributo de ella, limitando la extensabilidad de la clase.
*/
