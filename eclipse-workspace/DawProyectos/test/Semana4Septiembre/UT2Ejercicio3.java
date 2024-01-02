/*
 * Este programa va a determinar si has aprobado o suspendido un examen despues de hacer introducido tu nota previamente
 */
package Semana4Septiembre;
import java.util.Scanner;

/**
 *
 * @author Alejandro Lopez
 */
public class UT2Ejercicio3 {
    public static void main (String[] args){
        double nota = 0;
        Scanner reader = new Scanner (System.in);
        System.out.println("Introduce tu nota");
        nota = reader.nextDouble();
        if (nota >=5)
            System.out.println("Has aproabado");
        else 
            System.out.println("Has suspendido");
            
    }
    
}
