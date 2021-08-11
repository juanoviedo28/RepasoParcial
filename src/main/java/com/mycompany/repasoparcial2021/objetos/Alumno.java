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
public class Alumno {
    
    private String matricula;

    public Alumno() {
    }
    
    

    public Alumno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return matricula;
    }
    
    
    
    
}
