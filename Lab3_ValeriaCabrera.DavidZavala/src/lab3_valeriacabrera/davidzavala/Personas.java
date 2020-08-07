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
public class Personas {
    
    private String nombre;
    private String posicion;
    private long ID;
    private EstadodeRegistro estado;

    public Personas() {
    }

    public Personas(String nombre, String posicion, long ID, EstadodeRegistro estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.ID = ID;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public EstadodeRegistro getEstado() {
        return estado;
    }

    public void setEstado(EstadodeRegistro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", posicion=" + posicion + ", ID=" + ID + ", estado=" + estado + '}';
    }
    
    
    
}
