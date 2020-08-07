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
public class Pruebas {
    
    private String nombre;
    private Ranker evualuador;
    private ArrayList<Personas> equipo = new ArrayList();
    private EstadodeRegistro estado;

    public Pruebas() {
    }

    public Pruebas(String nombre, Ranker evualuador, EstadodeRegistro estado) {
        this.nombre = nombre;
        this.evualuador = evualuador;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ranker getEvualuador() {
        return evualuador;
    }

    public void setEvualuador(Ranker evualuador) {
        this.evualuador = evualuador;
    }

    public ArrayList<Personas> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Personas> equipo) {
        this.equipo = equipo;
    }

    public EstadodeRegistro getEstado() {
        return estado;
    }

    public void setEstado(EstadodeRegistro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pruebas{" + "nombre=" + nombre + ", evualuador=" + evualuador + ", equipo=" + equipo + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
