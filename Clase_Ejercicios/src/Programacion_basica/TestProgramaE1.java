
package Programacion_basica;

import java.util.Scanner;

/**
 * TestProgramaE1
 * Representa un programa que pide un dato por teclado y lo imprime por pantalla con un mensaje
 * Este programa utiliza una variable de tipo String
 * Recuerda! donde apararezca el valor de una variable se sustituirá por el valor que tenga en memoria
 * Actividad de refuerzo:
 * Declara en otra variable denominada nacimiento el año de nacimeinto, e imprimelo con el siguiente mensaje
 * "y naciste el año "+nacimiento)
 * @author 
 */


public class TestProgramaE1 {
    
    public static void main(String[] args) {
        //1.- variable que permite guarda el el valor de la ciudad
        // recuerda una variable se define con [Tipo] [identificador];
        // En este caso el Tipo es String y el identificador es ciudadNacimiento;
        String ciudadNacimiento;
        
        System.out.println("Teclea la ciudad donde naciste :"); // imprime por pantalla "Teclea la ciudad donde naciste :"
        
        //2.- Estas dos lineas sirven para que leas un dato por teclado
        Scanner reader = new Scanner(System.in); //creamos una clase para leer por tecado
        ciudadNacimiento= reader.nextLine(); //  reader.nextLine() lee una cadana de texto por teclado
        
        //3.- esta instrucción imprime por pantalla. Ya la has visto en el programa anterior!
        System.out.println(" la ciudad "+ ciudadNacimiento + " es muy  bonita");
        
    }
    }

