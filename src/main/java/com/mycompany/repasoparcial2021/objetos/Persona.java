/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasoparcial2021.objetos;

/**
 *
 * @author juanoviedo28
 */
public class Persona {
    
    private String documento;
    private String apellido, nombre;

    public Persona() {
    }

    public Persona(String documento, String apellido, String nombre) {
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
    
    
}
