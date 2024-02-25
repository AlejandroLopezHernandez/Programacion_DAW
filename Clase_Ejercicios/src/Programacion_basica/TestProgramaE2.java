package refuerzo;

import java.util.Scanner;

/**
 * TestProgramaE2
 * Representa un programa que pide dos números y los suma, el resultado lo imprime por pantalla
 * Actividad de refuerzo:
 *  Añade otra variable que se denomina resta y asignale el valor de la resta de los dos núemros 
 * anteriores e imprime el resultado por pantalla
 * @author 
 */


public class TestProgramaE2 {
     public static void main(String[] args) {
     
     /* 1.- Declaramos tres variables de tipo int: nuemro1,numero2 y suma*/
     /* Recuerda siempre necesitamos declarar varibles en los programas*/
     int numero1; // la forma de declarar una variable es poniendo tipo identificador; , en este caso  int numero1;
     int numero2; 
     int suma;
    
     /*2.- Declaramos el objeto Scanner porque necesitamos leer por teclado*/
     Scanner reader = new Scanner(System.in); //creamos una clase para leer por tecado
     
      /* 2.- Pide que introduzca por teclado el valor de la variable operando1 y almacénala en la variable operando1*/
     System.out.println("Introduce un número");
     numero1= reader.nextInt(); // le pedimos a la clase que devuelva 
     
     /* 3.- Pide que introduzca por teclado el valor de la variable operando2 y almacénala en la variable operando2*/
     System.out.println("Introduce otro número");
     numero2= reader.nextInt(); // le pedimos a la clase que devuelva 
        
     /* 5.-Realiza la operación suma y almacénala en la variable con identificador suma*/
     suma=numero1+numero2;
     
     /* 6.-Imprime por pantalla el valor de la variable suma*/
     System.out.println("El resultado de la suma es :"+suma);
     
     
     }
    
}
