/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import java.util.Scanner;
/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioFunciones4 {
    public static void main (String []args){
        String texto_introducido = "";
        String cadena_cifrada = "";
        System.out.println("Introduce un texto que quieras cifrar");
        Scanner reader = new Scanner (System.in);
        texto_introducido = reader.nextLine();
        cadena_cifrada = cifrado_de_Cesar(texto_introducido);
        System.out.println("La cadena cifrada es " + cadena_cifrada);
    }
     public static String cifrado_de_Cesar(String Texto_a_cifrar){
     StringBuilder  cadena_cifrada = new StringBuilder();
         
            for (int i = 0; i < Texto_a_cifrar.length(); i ++){
             
             char caracter_cifrado;
             caracter_cifrado = (char)(Texto_a_cifrar.charAt(i)+2);
             cadena_cifrada.append(caracter_cifrado);
         }
         return cadena_cifrada.toString();
     }
}

