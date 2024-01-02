/*
 * Este programa si un número que introduces es positivo o negativo
 */
package Semana4Septiembre;

import java.util.Scanner;
/**
 *
 * @author Alejandro Lopez
 */
public class UT2Ejercicio1 {
    public static void main (String[] args) {
        int numero = 0;
                Scanner reader = new Scanner (System.in);
                System.out.println ("Introduce un numero en pantalla");
                numero = reader.nextInt();
                if (numero >= 0)
                    System.out.println("Este numero es positivo");
                if (numero <=0)
                    System.out.println("Este numero es negativo");
    

}
}