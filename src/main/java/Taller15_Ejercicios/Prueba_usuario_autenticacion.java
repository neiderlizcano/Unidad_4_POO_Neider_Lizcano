/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15_Ejercicios;

/**
Ejercicio 3: Separar la Lógica de Autenticación en un Sistema
 1. Define una clase Usuario con datos de usuario, autenticación y validación.
 2. Refactoriza la clase utilizando el SRP para crear servicios especializados para autenticación y validación.
 */
public class Prueba_usuario_autenticacion {
    public static void main(String[] args) {
        Usuario1 usuario = new Usuario1("Neider", "neider@example.com", "1234");

        ServicioValidacion validador = new ServicioValidacion();
        ServicioAutenticacion autenticador = new ServicioAutenticacion();

        if (validador.validarCorreo(usuario.getCorreo()) && validador.validarContrasena(usuario.getContrasena())) {
            if (autenticador.autenticar(usuario, "neider@example.com", "1234")) {
                System.out.println("Autenticación exitosa. Bienvenido, " + usuario.getNombre());
            } else {
                System.out.println("Autenticación fallida.");
            }
        } else {
            System.out.println("Datos inválidos: correo o contraseña incorrectos.");
        }
    }
}
