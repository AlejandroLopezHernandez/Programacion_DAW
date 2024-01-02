/*
 * Desarrolla un programa que imprima un captcha por pantalla(un sencillo
texto que implique una frase con lugares). El programa solicitará que se
indique el número de lugares que aparecen en la frase. Si el número
introducido coincide con el número de lugares el programa debe
imprimir “Prueba superada”, en otro caso “Prueba no superada”.
 */
package Semana4Septiembre;

/**
 *
 * @author Alejandro Lopez
 */
import java.util.Scanner;
public class Ejercicio6 {
    
    String frase="En un lugar de la Mancha de cuyo nombre no quiero acordarme";
    int respuesta_correcta=1;
            int respuesta_usuario;
            Scanner reader = new Scanner (System.in);
            System.out.println("Cuantas ciudades lees");
            respuesta_usuario=reader.nextInt();
            if (respuesta_usuario==respuesta_correcta)
            System.out.println("Prueba pasada");
            else
            System.out.println("Prueba no pasada");
            
            
                    
            
            
}
