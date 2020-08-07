/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

/**
 *
 * @author Usuario
 */
public class EstadodeRegistro {
 
    private boolean ingreso;
    private String usuario;
    private String contrasena;

    public EstadodeRegistro() {
    }

    public EstadodeRegistro(boolean ingreso) {
        this.ingreso = ingreso;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    
    @Override
    public String toString() {
        return "EstadodeRegistro{" + "ingreso=" + ingreso + '}';
    }
    
    
    
}
