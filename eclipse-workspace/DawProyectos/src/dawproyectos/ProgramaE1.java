/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawproyectos;

import java.util.Scanner;

/**
 * Test programa E1 Programa que dada una temperatura imprime el nivel de calor
 *
 * @author Alejandro López
 */
public class ProgramaE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temperatura = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el valor de la temperatura que tiene tu clase");
        temperatura = reader.nextInt();
        if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("hace frio");
        } else if (temperatura > 23 && temperatura <= 30) {
            System.out.println("hace calor");
        } else if (temperatura >=31);
        System.out.println("hace mucho calor");
    

    System.out.println ("hace temperatura ambiente");
    
        
    System.out.println ("Aqui termina el programa,esta es la ultima insturccion");
    }
}
        
