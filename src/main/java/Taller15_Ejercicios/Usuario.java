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
public class Usuario {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public boolean autenticar(String correo, String contrasena) {
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
    }

    public boolean validarCorreo() {
        return correo.contains("@") && correo.contains(".");
    }

    public boolean validarContrasena() {
        return contrasena.length() >= 4;
    }
}
