/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import static lab3_valeriacabrera.davidzavala.Lab3_ValeriaCabreraDavidZavala.read;

/**
 *
 * @author Usuario
 */
public class Valeria {
    
    static Scanner leer = new Scanner(System.in);
    static Random rnd = new Random();
    
    
    public Valeria(){
    //opcion de posiciones
    ArrayList<Personas> personas = new ArrayList();
    ArrayList<Personas> ranker = new ArrayList();
    ArrayList<Personas> normal = new ArrayList();
    ArrayList<Pruebas> prueba = new ArrayList();
    ArrayList<Pisos> pisos = new ArrayList();
    
    int contp=0,contpr=0,contpi=0;
    
    
    
    //agregar
                    System.out.println("1. Agregar Persona \n2. Agregar Prueba \n3. Agregar Piso 0. \nsalir");
                    int sel = read.nextInt();
                    switch (sel) {
                        case 1: {
                          
                            System.out.println("1) Agregar Normal");
                            System.out.println("2) Agregar Ranker");
                            System.out.println("Ingrese el tipo de persona que desea agregar: ");
                            int pers = leer.nextInt();
                            
                            while (pers<0 || pers>2){
                                System.out.println("Asegurese de ingresar una de las opciones de personas");
                                System.out.println("1) Agregar Normal");
                                System.out.println("2) Agregar Ranker");
                                System.out.println("Ingrese el tipo de persona que desea agregar: ");
                                pers = leer.nextInt();
                            }
                            
                            if(pers==1){
                                personas.add(agregarNormal(personas,contp));
                                normal.add(agregarNormal(personas,contp));
                            }else if(pers==2){
                                personas.add(agregarRanker(personas,contp));
                                ranker.add(agregarNormal(personas,contp));
                            }
                          
                          contp++;
                            
                        }
                        break;
                        case 2: {
                            
                            
                            prueba.add(agregarPrueba(prueba,contpr,ranker,normal));
                            contpr++;
                            
                            
                        }
                        break;
                        case 3:{
                            
                            
                            
                        }
                        break;
                        case 0: {
                            break;
                        }
                        default: {
                            break;
                        }
                    }
   
    
    
    
    }
    
    public static Personas agregarNormal(ArrayList<Personas> personas, int contp){
        
        System.out.println("Ingrese el nombre: ");
        String nom = leer.next();
        
        ((Normal) personas.get(contp)).setNombre(nom);
                            
        System.out.println("Posiciones");
        System.out.println("1) Pescador");
        System.out.println("2) Portador de Lanzas");
        System.out.println("3) Portador de Luz");
        System.out.println("4) Explorador");
        System.out.println("5) Manipulador de Ondas");
        System.out.println("Ingrese el numero de la posicion que desea asignar: ");
        int pos = leer.nextInt();

        while(pos<0 || pos>5){
            System.out.println("Asegurese de ingresar ");
            System.out.println("Posiciones");
            System.out.println("1) Pescador");
            System.out.println("2) Portador de Lanzas");
            System.out.println("3) Portador de Luz");
            System.out.println("4) Explorador");
            System.out.println("5) Manipulador de Hondas");
            System.out.println("Ingrese el numero de la posicion que desea asignar: ");
            pos = leer.nextInt();
        }
                            
        if(pos==1){
            ((Normal) personas.get(contp)).setPosicion("Pescador");
        }else if(pos==2){
            ((Normal) personas.get(contp)).setPosicion("Portador de Lanzas");
        }else if(pos==3){
            ((Normal) personas.get(contp)).setPosicion("Portador de Luz");
        }else if(pos==4){
            ((Normal) personas.get(contp)).setPosicion("Explorador");
        }else if(pos==5){
            ((Normal) personas.get(contp)).setPosicion("Manipulador de Hondas");
        }
        
        System.out.println("Ingrese su ID: ");
        long id = leer.nextLong();
                            
        ((Normal) personas.get(contp)).setID(id);
                            
        System.out.println("Estado de Registro: ");
        System.out.println("1) Regular");
        System.out.println("2) Irregular");
        System.out.println("Ingrese el numero de su estado: ");
        int est = leer.nextInt();
                            
        while(est<0 || est>2){
            System.out.println("Asegurese de ingresar una de las opciones del estado: ");
            System.out.println("Estado de Registro: ");
            System.out.println("1) Regular");
            System.out.println("2) Irregular");
            System.out.println("Ingrese el numero del estado: ");
            est = leer.nextInt();
        }//fin de la validacion
                            
        if(est==1){
            System.out.println("Ingrese du usuario: ");
            String user = leer.next();
            System.out.println("Ingrese su contraseña: ");
            String pass = leer.next();
                                
            ((Normal) personas.get(contp)).setEstado(new Regular(user,pass,true));
        }else if(est==2){
            ((Normal) personas.get(contp)).setEstado(new Irregular(false));
                                
        }
        
        ArrayList<Pruebas> participo = new ArrayList();
        ((Normal) personas.get(contp)).setPruebas(participo);
        
        System.out.println("Ingrese una descripcion de su objetivo para escalar la torre: ");
        String desc = leer.next();
        
        ((Normal) personas.get(contp)).setDescripcion(desc);
        
        
        
        return personas.get(contp);
        
    }
    
    public static Personas agregarRanker(ArrayList<Personas> personas, int contp){
        
        System.out.println("Ingrese el nombre: ");
        String nom = leer.next();
        
        ((Ranker) personas.get(contp)).setNombre(nom);
                            
        System.out.println("Posiciones");
        System.out.println("1) Pescador");
        System.out.println("2) Portador de Lanzas");
        System.out.println("3) Portador de Luz");
        System.out.println("4) Explorador");
        System.out.println("5) Manipulador de Ondas");
        System.out.println("Ingrese el numero de la posicion que desea asignar: ");
        int pos = leer.nextInt();

        while(pos<0 || pos>5){
            System.out.println("Asegurese de ingresar ");
            System.out.println("Posiciones");
            System.out.println("1) Pescador");
            System.out.println("2) Portador de Lanzas");
            System.out.println("3) Portador de Luz");
            System.out.println("4) Explorador");
            System.out.println("5) Manipulador de Hondas");
            System.out.println("Ingrese el numero de la posicion que desea asignar: ");
            pos = leer.nextInt();
        }
                            
        if(pos==1){
            ((Ranker) personas.get(contp)).setPosicion("Pescador");
        }else if(pos==2){
            ((Ranker) personas.get(contp)).setPosicion("Portador de Lanzas");
        }else if(pos==3){
            ((Ranker) personas.get(contp)).setPosicion("Portador de Luz");
        }else if(pos==4){
            ((Ranker) personas.get(contp)).setPosicion("Explorador");
        }else if(pos==5){
            ((Ranker) personas.get(contp)).setPosicion("Manipulador de Hondas");
        }
        
        System.out.println("Ingrese su ID: ");
        long id = leer.nextLong();
                            
        ((Ranker) personas.get(contp)).setID(id);
                            
        System.out.println("Estado de Registro: ");
        System.out.println("1) Regular");
        System.out.println("2) Irregular");
        System.out.println("Ingrese el numero de su estado: ");
        int est = leer.nextInt();
                            
        while(est<0 || est>2){
            System.out.println("Asegurese de ingresar una de las opciones del estado: ");
            System.out.println("Estado de Registro: ");
            System.out.println("1) Regular");
            System.out.println("2) Irregular");
            System.out.println("Ingrese el numero del estado: ");
            est = leer.nextInt();
        }//fin de la validacion
                            
        if(est==1){
            System.out.println("Ingrese du usuario: ");
            String user = leer.next();
            System.out.println("Ingrese su contraseña: ");
            String pass = leer.next();
                                
            ((Normal) personas.get(contp)).setEstado(new Regular(user,pass,true));
        }else if(est==2){
            ((Normal) personas.get(contp)).setEstado(new Irregular(false));
                                
        }
        
        ArrayList<Pruebas> evaluar = new ArrayList();
        ((Ranker) personas.get(contp)).setPruebas(evaluar);
        
        return personas.get(contp);
        
    }
    
    
    
    public static Pruebas agregarPrueba(ArrayList<Pruebas> prueba, int contpr, ArrayList<Personas> rank, ArrayList<Personas> norm){
        
        System.out.println("Ingrese el nombre de la prueba: ");
        String nombre = leer.next();
        
        ((Pruebas) prueba.get(contpr)).setNombre(nombre);
        
        System.out.println("Ingrese el nombre del evaluador: ");
        String nomE = leer.next();
        
        boolean flag=false;
        int r=0;
        
        for (int i = 0; i < rank.size(); i++) {
            if(nomE.equalsIgnoreCase(rank.get(i).getNombre())){
                flag=true; 
                r=i;
            }
        }
        
        while(flag==false){
            System.out.println("El nombre que ingreso no corresponde a ningun ranker");
            System.out.println("Ingrese el nombre del evaluador: ");
            nomE = leer.next();
        
            for (int i = 0; i < rank.size(); i++) {
                if(nomE.equalsIgnoreCase(rank.get(i).getNombre())){
                    flag=true; 
                    r=i;
                }
            }
        }//validacion de que sea ranker
        
        ((Pruebas) prueba.get(contpr)).setEvaluador(((Personas)rank.get(r)));
        
        //equipo
        
        System.out.println("Ingrese el nombre de la persona normal que participo: ");
        String nomN = leer.next();
        
        boolean flag2=false;
        int n=0;
        
        for (int i = 0; i < norm.size(); i++) {
            if(nomE.equalsIgnoreCase(norm.get(i).getNombre())){
                flag2=true; 
                n=i;
            }
        }
        
        while(flag==false){
            System.out.println("El nombre que ingreso no corresponde a ninguna persona normal");
            System.out.println("Ingrese el nombre de la persona normal que participo: ");
            nomN = leer.next();
        
            for (int i = 0; i < norm.size(); i++) {
                if(nomE.equalsIgnoreCase(norm.get(i).getNombre())){
                    flag2=true;
                    n=i;
                }
            }
        }//validacion de que sea ranker
        
        ((Pruebas) prueba.get(contpr)).getEquipo().add((Personas) norm.get(n));
        
        System.out.println("Estado");
        System.out.println("1) Prueba Aprobada");
        System.out.println("2) Prueba Reprobada");
        System.out.println("Ingrese el estado de la prueba: ");
        int est = leer.nextInt();
        
        while(est<0 || est>2){
            System.out.println("Asegurese de ingresar una de las opciones de estado");
            System.out.println("Estado");
            System.out.println("1) Prueba Aprobada");
            System.out.println("2) Prueba Reprobada");
            System.out.println("Ingrese el estado de la prueba: ");
            est = leer.nextInt();   
        }
        
        if(est==1){
            ((Pruebas) prueba.get(contpr)).setEstado(true);
        }else if(est==2){
            ((Pruebas) prueba.get(contpr)).setEstado(false);
        }
        
        
        return prueba.get(contpr);
        
        
    }
    
    public static Pisos agregarPiso(ArrayList<Pisos> pisos, int contpi,ArrayList<Personas> rank){
        
        System.out.println("Ingrese el nombre del administrador: ");
        String admin = leer.next();
        
        ((Pisos) pisos.get(contpi)).setAdmin(admin);
        
        System.out.println("Ingrese la cantidad de evaluadores que desea: ");
        int eva = leer.nextInt();
        
        while(eva>0){
            System.out.println("Ingrese el nombre del evaluador: ");
            String nomE = leer.next();

            boolean flag=false;
            int r=0;

            for (int i = 0; i < rank.size(); i++) {
                if(nomE.equalsIgnoreCase(rank.get(i).getNombre())){
                    flag=true; 
                    r=i;
                }
            }

            while(flag==false){
                System.out.println("El nombre que ingreso no corresponde a ningun ranker");
                System.out.println("Ingrese el nombre del evaluador: ");
                nomE = leer.next();

                for (int i = 0; i < rank.size(); i++) {
                    if(nomE.equalsIgnoreCase(rank.get(i).getNombre())){
                        flag=true; 
                        r=i;
                    }
                }
            }//validacion de que sea ranker
            
            ((Pisos) pisos.get(contpi)).getEvaluadores().add((Personas) rank.get(r));
            
            eva--;
            
        }//fin del while
        
        int i = 0+rnd.nextInt(rank.size());
        
        System.out.println("El director es: "+((Personas)rank.get(i)).getNombre());
        
        ((Pisos) pisos.get(contpi)).setDirector(((Personas) rank.get(i)));
        
        //nivel
        System.out.println("Ingrese el numero del piso");
        int piso = leer.nextInt();
        
        while(piso<0 || piso>134){
            System.out.println("Recuerde que solo hay 134 pisos existentes");
            System.out.println("Ingrese el numero del piso");
            piso = leer.nextInt();
        }
        
        if(piso>=67){
            
            ((Superior) pisos.get(contpi)).setNivel(piso);
        }else if(piso<67){
            ((Inferior) pisos.get(contpi)).setNivel(piso);
        }
        
        return pisos.get(contpi);
        
        
    }
    
    //metodos para visualizar
    
    public static void verPisos(ArrayList<Pisos> pisos){
        
        for (Object o : pisos) {
            System.out.println((pisos.indexOf(o)+1) + "- " + o);
        }
        
    }
    
    public static void verPruebas(ArrayList<Pruebas> prueba){
        
        for (Object o : prueba) {
            System.out.println((prueba.indexOf(o)+1) + "- " + o);
        }
        
    }
    
    
    
    
    
}

