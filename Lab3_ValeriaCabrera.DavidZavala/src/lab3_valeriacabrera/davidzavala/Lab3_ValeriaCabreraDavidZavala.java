/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_valeriacabrera.davidzavala;

import java.util.Scanner;

public class Lab3_ValeriaCabreraDavidZavala {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        char sn = ' ';
        boolean login = false;
        boolean clau = false;

        String sudo = "SUDO";
        String sudopw = "clau123";
        
        while (sn == ' ') {
            System.out.println("1. log in");
            System.out.println("2. agregar");
            System.out.println("");
            System.out.println("");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    //log in
                    break;
                }
                case 2: {
                    //agregar
                    System.out.println("1. persona \n2. Pisos 0. \nsalir");
                    int sel = read.nextInt();
                    switch (sel) {
                        case 1: {
                            
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 0: {
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    //mod
                    System.out.println("1. persona \n2. Pisos 0. \nsalir");
                    int sel = read.nextInt();
                    switch (sel) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 0: {
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                case 0: {
                    //salir
                    sn = 's';
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
