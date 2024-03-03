package Programacion_basica;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 * TestProgramaE5 
 * Representa un programa que calcula el área de un cuadrado, para ello pide el valor del lado por teclado
 * @author
 *
 */
public class TestProgramaE5 {

    public static void main(String[] args) {

        /* 1.- Declaramos dos variables double (números reales decimales): lado y area*/
       
        double lado = 0.0;
        double area = 0.0;
        
        /* 2.-Recuerda que necesitamos el scanner y siempre lo declaramos coomo sigue*/
        Scanner reader = new Scanner(System.in);

        /* 3.-Pide el valor del lado por teclado*/
        System.out.println(" Introduce valor del lado del cuadrado:");
        /* El valor que se introduzca se asignará a lado*/
        lado = reader.nextDouble(); // Fijate que como leemos un dato real podemos reader.nextDouble();
        
        /*4.- Ahora aplicamos la formlula sencilla para calcular el área que es area=lado*lado*/
        area = lado * lado; // aquí como novedad ves que aparece la variable lado dos veces. Recurda que se sustituye por su valor 
        
        /*5.- Imprimimos el resultado*/
        System.out.println("El valor del área es "
                + area);

    }

}
