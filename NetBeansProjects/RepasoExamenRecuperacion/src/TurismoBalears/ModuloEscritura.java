/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurismoBalears;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloEscritura {
    private String archivo;
    private FileWriter escritor;
    
    public ModuloEscritura(String archivo){
        this.archivo = archivo;
        try{
            escritor = new FileWriter(archivo);
        } catch(IOException e){
            System.out.println("Error al escribir" + e);
        }
    }
    public void escribir(String linea){
        try{         
            escritor.write(linea);
            escritor.flush();
        } catch(IOException e){
            System.out.println("Error al escribir" + e);
        }
    }
    
    public static void main(String[] args) {
        ModuloEscritura escribir = new ModuloEscritura("peste.txt");
        String linea = "Aujourd'hui maman est morte,ou peut-être hier, je ne sais pas.";
        escribir.escribir(linea);
        
    }
}
