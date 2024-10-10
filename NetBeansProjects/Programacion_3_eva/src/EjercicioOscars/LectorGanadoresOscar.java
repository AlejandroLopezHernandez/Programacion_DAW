/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioOscars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class LectorGanadoresOscar {
    private String archivo;
    File file;
    Scanner lector;
    
    //Necestiamos un método constructor
    public LectorGanadoresOscar(String archivo){
    this.archivo = archivo;
    file = new File(archivo);
    try{
        lector = new Scanner(file);
    } catch (FileNotFoundException e){
        System.out.println("Error al encontrar o leer el archivo " + e);
    }
}
    //Y este método sirve para poder leer el archivo
    public void mostrarGanadores(){
        try{
            String linea;
            System.out.println("Los ganadores del Oscar 2024 son: ");
            while (lector.hasNext()){
                linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e){
            System.out.println("Error al encontrar o leer archivo " + e);
        }
    }
    //Ahora creamos un StringBuilder para obtener esos datos en forma de String
    public String obtenerDatos(){
        StringBuilder DatosArchivo = new StringBuilder();
        try{
            String linea;
            
            
            while (lector.hasNext()){
                linea = lector.nextLine();
                DatosArchivo.append(linea);
            }
            
        } catch (Exception e){
            System.out.println("Error al leer archivo " + e);
        }
        
        return DatosArchivo.toString();
    }
}
