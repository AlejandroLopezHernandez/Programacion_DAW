/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3Octubre;

/**
 *
 * @author Alejandro Lopez
 */
public class AprendiendoArrays1 {
    public static void main (String [] args) {
        double []temperaturas = new double [5];
      
    temperaturas[0]=12.3;
    temperaturas[1]=5.2;
    temperaturas[2]=10.3;
    temperaturas[3]=40.5;
    temperaturas[4]=38.4;
   
  System.out.println(temperaturas[2]);
  
  int [] ataque_spam = {2,5,4,10,9,8,5};
  int longitud_array=ataque_spam.length;
          System.out.println(ataque_spam[3]);
    String []estudiantes = {"Ana " , "Adrian ", "Victoria ", "Jose "};
    double [] notas = { 4.0, 5.5, 6.7, 9.8};
    System.out.println(estudiantes [0]+ notas [0]);
     System.out.println(estudiantes [1]+ notas [1]);
      System.out.println(estudiantes [2]+ notas [2]);
       System.out.println(estudiantes [3]+ notas [3]);
       int [] numeros = {1,4,7,3};
       int suma = numeros[0]+numeros[1]+numeros[2]+numeros[3];
       System.out.println(suma);
       String [] palabras = {" lugar " ," Mancha " ," En " ," de " ," un " ," la "};
   System.out.println(palabras[2]+palabras[4]+palabras[0]+palabras[3]+palabras[5]+palabras[1]);
       String [] jugadores = {"userl", "raal", "ghu", "orn"};
       int [] score = {230, 100, 20, 450};
       System.out.println(jugadores [2]+" "+score[2]);
       double [] notas2 ={2.0, 5.3, 6.5, 7.8};
       double aux = notas2[0];
       notas2[2]= notas[3];
       notas2[3]=aux;
       
       String nombre = "Alex";
       for (int i=0; i<10; i ++){
           System.out.println("Alex");
       }
       
}
}