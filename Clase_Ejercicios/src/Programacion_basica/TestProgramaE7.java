package Programacion_basica;
import java.util.Scanner;

/**
 *TestProgramaE7
 * 
 * Representa un programa que pide los datos de un planeta del sistema solar, la almacena en variables 
 * y muestra la información introducida por la consola
 * Actividad de refuerzo:
 * Cambia el programa para que también solicite la temperatura superficial del planeta
 * 
 */

public class TestProgramaE7 {


    public static void main(String[] args) {
        // 1.-Estas tres variable nombrePlaneta,masaPlaneta y radioPlaneta nos servirán para guardar los datos de entrada
        // Como puedes observar, dos de ellas son numéricas y una de tipo cadena (String) 
        
        String nombrePlaneta;
        double masaPlaneta ;
        double radioPlaneta;
        
        //1.- Recuerda necesitamos el objeto Scanner para la entrada de datos. 
        Scanner reader = new Scanner(System.in);

        // 2.-Solicita el nombre del planeta y lo leemos con reader.nextLine();
        System.out.print("Nombre del planeta: ");
        nombrePlaneta = reader.nextLine();

        // Solicitar al usuario que ingrese la masa del planeta
        System.out.print("Masa del planeta (en kg): ");
         masaPlaneta = reader.nextDouble();

        // Solicitar al usuario que ingrese el radio del planeta
        System.out.print("Radio del planeta (en metros): ");
        radioPlaneta = reader.nextDouble();

        // Las 4 instrucciones siguientes sirven para imprimir la información que hemos leido previamente y almacenado en variables
        System.out.println("\nInformación del Planeta:");
        System.out.println("Nombre: " + nombrePlaneta);
        System.out.println("Masa: " + masaPlaneta + " kg");
        System.out.println("Radio: " + radioPlaneta + " metros");

        // Cerrar el objeto Scanner
        reader.close();
    }
}
