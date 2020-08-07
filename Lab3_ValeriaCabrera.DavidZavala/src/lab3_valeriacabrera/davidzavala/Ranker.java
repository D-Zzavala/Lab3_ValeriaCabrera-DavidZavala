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
public class Ranker extends Personas{
    
    private ArrayList<Pruebas> pruebas = new ArrayList();

    public Ranker() {
        super();
    }

    public Ranker(String nombre, String posicion, long ID, EstadodeRegistro estado) {
        super(nombre, posicion, ID, estado);
    }

    public ArrayList<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public String toString() {
        return "Ranker{" + "pruebas=" + pruebas +super.toString()+ '}';
    }
    
    
    
    
    
}
