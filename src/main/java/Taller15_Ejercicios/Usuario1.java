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

public class Usuario1 {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario1(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}
