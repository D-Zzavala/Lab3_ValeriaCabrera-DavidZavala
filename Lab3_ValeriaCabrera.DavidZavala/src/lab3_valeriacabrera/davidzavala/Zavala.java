/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

import static lab3_valeriacabrera.davidzavala.Lab3_ValeriaCabreraDavidZavala.read;

public class Zavala {

    char sn = ' ';
    boolean login = false;
    boolean clau = false;
    String sudo = "SUDO";
    String sudopw = "clau123";
    while (sn

    
        == ' ') {
            System.out.println("1. Log in");
        int op = read.nextInt();
        switch (op) {
            case 1: {
                //Validacion login hecho ya
                if (login == true) {
                    System.out.println("El login ya se realizo.");
                } else if (login == false) {
                    //realiza login
                    System.out.println("Usuario: ");
                    String usuario = read.next();
                    System.out.println("Contrasena: ");
                    String contrasena = read.next();
                    //validaciones login
                    if (usuario.equals(sudo) && contrasena.equals(sudopw)) {
                        clau = true;
                        login = true;
                    }
                    if (clau) {                                                        //usuarios normales
                                 
                    } else if (clau) {

                    }

                }
                break;
            }
            case 3: {
                break;
            }
            case 0: {
                break;
            }
            default: {
                break;
            }
        }
    }
}
