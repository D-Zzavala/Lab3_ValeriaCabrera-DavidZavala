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
public class Posiciones {
    
    private Personas pescador;
    private Personas lanzas;
    private Personas luz;
    private Personas explorador;
    private Personas manipulador;

    public Posiciones() {
    }

    public Posiciones(Personas pescador, Personas lanzas, Personas luz, Personas explorador, Personas manipulador) {
        this.pescador = pescador;
        this.lanzas = lanzas;
        this.luz = luz;
        this.explorador = explorador;
        this.manipulador = manipulador;
    }

    public Personas getPescador() {
        return pescador;
    }

    public void setPescador(Personas pescador) {
        this.pescador = pescador;
    }

    public Personas getLanzas() {
        return lanzas;
    }

    public void setLanzas(Personas lanzas) {
        this.lanzas = lanzas;
    }

    public Personas getLuz() {
        return luz;
    }

    public void setLuz(Personas luz) {
        this.luz = luz;
    }

    public Personas getExplorador() {
        return explorador;
    }

    public void setExplorador(Personas explorador) {
        this.explorador = explorador;
    }

    public Personas getManipulador() {
        return manipulador;
    }

    public void setManipulador(Personas manipulador) {
        this.manipulador = manipulador;
    }

    @Override
    public String toString() {
        return "Posiciones{" + "pescador=" + pescador + ", lanzas=" + lanzas + ", luz=" + luz + ", explorador=" + explorador + ", manipulador=" + manipulador + '}';
    }
    
    
    
    
    
}
