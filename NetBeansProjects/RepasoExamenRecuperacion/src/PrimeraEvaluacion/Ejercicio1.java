/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraEvaluacion;

import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejercicio1 {
        public static void main(String[] args) {
            
        String [] usuarios = {"user1","user2","userB","userA"};
        String [] contrasenyas = {"abcde123","a23456","c5678","1234ghMH"};
        
        Scanner reader = new Scanner(System.in);
        
        
            System.out.println("------------------------------------------------");
            for (int i = 0; i < contrasenyas.length; i++) {
                if(contrasenyas[i].length()<7){
                   System.out.println("La contraseña del usuarios: " + usuarios[i] + " es débil, por favor, introduzca una contraseñaa nueva");
                   String contrasenya_nueva = reader.nextLine();
                } 
            }
            System.out.println("------------------------------------------------");
            System.out.println(" Listado de todos los usuarios y contraseñas: ");
            for (int i = 0; i < contrasenyas.length; i++) {
                
                System.out.println("usuario: " + usuarios[i] + " ||contraseña: " + contrasenyas[i]);
                
            }
            int contador = 0;
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i].endsWith("A")||usuarios[i].endsWith("B")){
                    contador ++;
                }
            }
            System.out.println("Los usuarios cuyo nombre termina por A o B son: " + contador);
            System.out.println("------------------------------------------------");
            
            System.out.println("Los usuarios con contraseñas típicas son: ");
            for (int i = 0; i < contrasenyas.length; i++) {
                if(contrasenyas[i].contains("123")||contrasenyas[i].contains("1234")){
                    System.out.println("usuario: " + usuarios[i] + " || contraseña: " + contrasenyas[i]);
                    
                }
                
            }
            
        
    }
}
