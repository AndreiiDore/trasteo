/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trasteo;

/**
 *
 * @author andre
 */
public class Usuario {

    private String nombre;
    private String contaseña;
    
    public Usuario(){}
    public Usuario(String nombre, String contaseña) {
        this.nombre = nombre;
        this.contaseña = contaseña;
    }
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contaseña
     */
    public String getContaseña() {
        return contaseña;
    }

    /**
     * @param contaseña the contaseña to set
     */
    public void setContaseña(String contaseña) {
        this.contaseña = contaseña;
    }
    
}
