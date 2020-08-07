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

    @Override
    public String toString() {
        return "EstadodeRegistro{" + "ingreso=" + ingreso + '}';
    }
    
    
    
}
