/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Angy
 */
@ManagedBean
public class FormularioCtrl {

    /**
     * Creates a new instance of FormularioCtrl
     */
    private String nombre;
    private String apellido;
    private String completo;
    
    public void enviar() {
        this.completo = this.nombre.toUpperCase()+" "+
                this.apellido.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCompleto() {
        return completo;
    }

   

   
    
    
    
}
