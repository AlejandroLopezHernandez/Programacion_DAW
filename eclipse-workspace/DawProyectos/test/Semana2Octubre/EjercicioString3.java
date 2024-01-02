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
public class EjercicioString3 {
    public static void main (String []args){
        String str1="Ejercicios de Java";
        String cadena_terminacion ="Java";
        boolean ends1 =str1.endsWith(cadena_terminacion);
       System.out.println("La cadena 2 termina con el contenido de la cadena 1"+ ends1);
    }
}
