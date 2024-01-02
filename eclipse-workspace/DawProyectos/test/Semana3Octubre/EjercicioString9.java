package Semana3Octubre;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioString9 {
    public static void main (String []args){
        String cadena_adn;
        String patron_adn;
        char primer_caracter;
        char segundo_caracter;
        Scanner reader = new Scanner (System.in);
        System.out.println("Cadena ADN de entrada");
        cadena_adn = reader.nextLine();
        boolean condicion_primer_caracter = cadena_adn.charAt(0)== 'T'||cadena_adn.charAt(0)== 'G'||cadena_adn.charAt(0)== 'C'||cadena_adn.charAt(0)== 'A';
        boolean condicion_segundo_caracter = cadena_adn.charAt(1)== 'T'||cadena_adn.charAt(1)== 'G'||cadena_adn.charAt(1)== 'C'||cadena_adn.charAt(1)== 'A';
        boolean patron_adn_existe;
        if (condicion_primer_caracter && !condicion_segundo_caracter){
            System.out.println("El patron no esta en la cadena de ADN");
        }else if (!condicion_primer_caracter && !condicion_segundo_caracter){
                    System.out.println("El patron no esta en la cadena de ADN");
                    
        }patron_adn = reader.nextLine();
            System.out.println("Introduce el patron de ADN a buscar");
            
}    
}
