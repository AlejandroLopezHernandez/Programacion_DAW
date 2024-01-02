/*
 *Vamos a crear un programa que determine si un numero es par o impar
 */
package Semana4Septiembre;
import java.util.Scanner;
/**
 *
 * @author Alejandro Lopez
 */
public class UT2Ejercicio2 {
    public static void main(String[] args){
        int numero = 0;
        Scanner reader = new Scanner (System.in);
        System.out.println("Introduce un numero aleatorio");
        numero =reader.nextInt();
               if (numero %2==0)
                   System.out.println("El numero es par");
               else if (numero !=0)
                       System.out.println("El numero es impar");
               
                   
                   
               
    }              
    
}
