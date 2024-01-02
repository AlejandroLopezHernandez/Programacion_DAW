/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2Octubre;

/**
 *
 * @author Alejandro Lopez
 */
public class EjerciciosString5 {
    public static void main (String []args){
        String str1 ="192:168:134:23";
        String str2 = str1.replace(':','.'); //remplaza : por.
        System.out.println("Dada la cadena original1 :"+str1);
        System.out.println("Despues de remplazar queda:"+ str2);
    }
}
