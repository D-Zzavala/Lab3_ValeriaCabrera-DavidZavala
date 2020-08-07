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
public class Superior extends Pisos{
    
    private int nivel;

    public Superior() {
        super();
    }

    public Superior(int nivel, String admin, Ranker director) {
        super(admin, director);
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
        return "Superior{" + "nivel=" + nivel + super.toString()+ '}';
    }
    
    
    
    
    
    
    
}
