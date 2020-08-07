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
public class Pisos {
    
    private String admin;
    private ArrayList<Ranker> evaluadores = new ArrayList();
    private Ranker director;
    private ArrayList<Personas> habitantes;
    private int nivel;

    public Pisos() {
    }

    public Pisos(String admin, Ranker director, int nivel) {
        this.admin = admin;
        this.director = director;
        this.nivel = nivel;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public ArrayList<Ranker> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<Ranker> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public Ranker getDirector() {
        return director;
    }

    public void setDirector(Ranker director) {
        this.director = director;
    }

    public ArrayList<Personas> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Personas> habitantes) {
        this.habitantes = habitantes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pisos{" + "admin=" + admin + ", evaluadores=" + evaluadores + ", director=" + director + ", habitantes=" + habitantes + ", nivel=" + nivel + '}';
    }
    
    
    
    
    
}
