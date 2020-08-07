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
public class Inferior extends Pisos{
    
    private int nivel;

    public Inferior() {
        super();
    }

    public Inferior(int nivel) {
        super();
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Inferior{" + "nivel=" + nivel + super.toString()+ '}';
    }
    
    
    
    
    
    
    
}
