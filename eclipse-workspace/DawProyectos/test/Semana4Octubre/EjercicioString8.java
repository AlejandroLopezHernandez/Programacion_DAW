/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semana4Octubre;

/**
 *
 * @author Alejandro Lopez
 */

import java.util.Scanner;
public class EjercicioString8 {
    public static void main (String []args){
      String direccion_ip;
      System.out.println("Introduce una direccion IP");
      Scanner reader = new Scanner (System.in);
      direccion_ip = reader.nextLine();
      int indice_ultima_aparicion = direccion_ip.lastIndexOf(".");
      direccion_ip.substring(indice_ultima_aparicion);
      indice_ultima_aparicion = Integer.parseInt(direccion_ip);
      if (direccion_ip.length()<245){
         System.out.println("La direccion del host es !"+ indice_ultima_aparicion);
         
      }
      else if (direccion_ip.length()>245){
          System.out.println("La direccion del host es"+"no es valida");
      }  
    }
}
