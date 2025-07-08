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
public class ServicioAutenticacion {

    public boolean autenticar(Usuario1 usuario, String correo, String contrasena) {
        return usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena);
    }
}

