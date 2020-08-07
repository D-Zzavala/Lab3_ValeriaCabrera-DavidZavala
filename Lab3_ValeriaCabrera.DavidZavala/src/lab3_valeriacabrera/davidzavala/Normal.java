/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Normal extends Personas {
    
    private ArrayList<Pruebas> pruebas = new ArrayList();
    private String descripcion;

    public Normal() {
    }

    public Normal(String descripcion) {
        super();
        this.descripcion = descripcion;
    }

    public ArrayList<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Normal{" + "pruebas=" + pruebas + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
