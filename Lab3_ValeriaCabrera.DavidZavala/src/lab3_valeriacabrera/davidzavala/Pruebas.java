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
    private Ranker evaluador;
    private ArrayList<Personas> equipo = new ArrayList();
    private boolean estado;

    public Pruebas() {
    }

    public Pruebas(String nombre, Ranker evualuador, boolean estado) {
        this.nombre = nombre;
        this.evaluador = evualuador;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ranker getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Ranker evaluador) {
        this.evaluador = evaluador;
    }

    public ArrayList<Personas> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Personas> equipo) {
        this.equipo = equipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Informe de Prueba: "+nombre+"\nAdministrador: "+evaluador+" - "+evaluador.getPosicion()+"\nEquipo: "+imprimir(equipo)+"\nEstado: "+estado(estado);
    }
    
    //imprimir arraylist
    public String imprimir(ArrayList<Personas> p){
        
        String acum="";
        
        for (int i = 0; i < p.size(); i++) {
            acum+=((Personas) p.get(i)).getNombre()+" - "+((Personas) p.get(i)).getPosicion();
        }
        
        return acum;
    }
    
    public String estado(boolean e){
        
        if(e){
            return "aprobado";
        }else{
            return "reprobada";
        }
        
    }
    
    
    
    
    
}
