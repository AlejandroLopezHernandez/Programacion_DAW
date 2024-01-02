/*
 * Escribir un programa para probar si una cadena determinada contiene
una secuencia especificada por teclado
 */
package Semana2Octubre;

import java.util.Scanner;
        
/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioString1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    
        String str1 = "Tutor DAW1";
        String substr ="DAW";
        boolean esta_contenida= str1.contains(substr);
        
        
        System.out.println("Cadena concatenada:" +esta_contenida);
        
    }
}
