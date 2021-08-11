/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasoparcial2021.objetos;

import java.util.Date;

/**
 *
 * @author juanoviedo28
 */
public class Curso {
    
    private Date fecha;
    private String catedra;

    public Curso() {
    }

    public Curso(Date fecha, String catedra) {
        this.fecha = fecha;
        this.catedra = catedra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString() {
        return "Curso{" + "fecha=" + fecha + ", catedra=" + catedra + '}';
    }
    
    
    
    
}
