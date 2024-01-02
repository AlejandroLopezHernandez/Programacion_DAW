/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semana2Octubre;
import java.util.Scanner;

/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioString7 {
    public static void main (String[]args){
        String dni;
        String letras_validas_dni = "TRWAGMYFPDXBNJZSQVHLCKE";
        
      Scanner reader = new Scanner (System.in);
       System.out.println("Introduce tu DNI");
      dni= reader.nextLine();
      char ultimo_caracter = dni.charAt (dni.length()-1);
      String ultima_letra_cadena= String.valueOf(ultimo_caracter);
      boolean es_valido = letras_validas_dni.contains(ultima_letra_cadena);
 if (dni.length()<9 && !es_valido){
     System.out.println("El DNI no es valido");
      }
 else if (dni.length()>9 && !es_valido){
     System.out.println("El DNI no es valido");
 }
 else if (dni.length()==9 && es_valido){
     System.out.println("El DNI es valido");
 }
 else if (dni.length()==9){
     System.out.println("El DNI no tiene letra");
 }
 else if (dni.length()==9 && !es_valido){
     System.out.println("El DNI tiene una letra no valida");
 }
 }
}

