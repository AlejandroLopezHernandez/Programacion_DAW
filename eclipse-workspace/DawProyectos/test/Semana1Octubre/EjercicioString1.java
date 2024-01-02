/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semana1Octubre;
import java.util.Scanner;

/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioString1 {
    public static void main (String []args){
        String cadena1="1DAW2023";
        String cadena2="1DAW2023";
        String cadena3="1DAW2023";
        String cadena4="1DAW2023";
        if (cadena1.equals(cadena2)){
        System.out.println("son iguales");}
        {
            System.out.println("son diferentes");
            char ultimo;
            char primero;
            int longitud=cadena1.length();
            ultimo= cadena1.charAt(longitud-1);
            primero=cadena1.charAt(0);
            System.out.println(ultimo);
            System.out.println(primero);
            String subcadena="DAW";
            if (cadena1.contains(subcadena)){
                System.out.println("la subcadena"+" esta en"+cadena1);
            }else{
                System.out.println("La subcadena"+subcadena+" no esta en"+cadena1);
                
                
            }
            int posicion_del_primer_2=cadena1.indexOf(subcadena);
                System.out.print(posicion_del_primer_2);
        }
    }
}
