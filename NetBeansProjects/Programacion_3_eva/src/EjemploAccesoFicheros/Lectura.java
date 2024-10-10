/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAccesoFicheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author alejandrolopezhernandez
 */
public class Lectura {
    String archivo;
    File file;
    Scanner lector;
    
    public Lectura (String archivo){
        this.archivo = archivo;
        file = new File(archivo);
        
        try{
            lector = new Scanner(file);
        } catch (IOException ex){
            System.out.println("Error al escribir archivo, código del error: " + ex);
        }
    }
    
    public void leer(){
        try{
            String linea;
            
            while(lector.hasNext()){
                linea = lector.next();
                System.out.println(linea);
            }
        } catch(Exception ex){
            System.out.println("Error al escribir archivo, código del error: " + ex);
        }
    }
}