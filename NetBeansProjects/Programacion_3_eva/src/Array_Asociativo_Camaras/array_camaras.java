/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Asociativo_Camaras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class array_camaras {
    
    String nombre_archivo;
    Map<String,Integer> array_camaras;
    int total_camaras;
    int total_localizaciones;
    String ubicacion_mas_vigilada;
    
    public array_camaras(String archivo){
        this.nombre_archivo = nombre_archivo;
        array_camaras = new HashMap<>();
        total_localizaciones = 0;
        ubicacion_mas_vigilada = " ";
    }
    
    public int getTotalCamaras(){
        return total_camaras;
    }
    public int getTotalLocalizaciones(){
        return total_localizaciones;
    }
    public String getUbicacionesMasVigilada(){
        return ubicacion_mas_vigilada;
    }
    
    public void extraerInformacionVigilancia(){
        File file = new File(nombre_archivo);
        Scanner lector;
        
        try{
           lector = new Scanner(file);
           String linea;
           
           lector.nextLine();
           
           while(lector.hasNext()){
               linea = lector.nextLine();
               
               String [] campos = linea.split(";");
               String ubicacion = campos[2];
               
               if(array_camaras.containsKey(ubicacion)){
                   int numero_camaras = array_camaras.get(ubicacion);
                   numero_camaras ++;
                   array_camaras.put(ubicacion, numero_camaras);
               } else {
                   array_camaras.put(ubicacion,1);
               }         
           }
        } catch(FileNotFoundException ex){
            
        }
        this.total_localizaciones = array_camaras.size();
        
        int max_camaras = 0;
        
        for (Map.Entry<String,Integer>entry: array_camaras.entrySet()){
            String localizacion = entry.getKey();
            int camaras = entry.getValue();
            
            total_camaras = total_camaras + camaras;
            
            if(camaras > max_camaras){
                max_camaras = camaras;
                this.ubicacion_mas_vigilada = localizacion;
            }
        }
    }
}
