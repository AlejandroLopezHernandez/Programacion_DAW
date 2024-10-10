/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivosTurismo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloAccesoInfoCovid {
    
    private String archivo;
    private String municipio_mas_contagiado;
    private double mayor_nivel_positividad;
    private Map<String,Double> datos_covid_baleares;
    
    public ModuloAccesoInfoCovid(String archivo){
        this.archivo = archivo;
        
        try{
            File file = new File(archivo);
            Scanner lector = new Scanner(file);
            
            
        } catch(IOException e){
            System.out.println("Error al encontrar o abrir el archivo, código: " + e);
        }
        this.municipio_mas_contagiado = "";
        this.mayor_nivel_positividad = 0.0;
        datos_covid_baleares = new HashMap<>();
    }
    
    public void obtenerInfoCovid(){
        try {
            File file = new File(archivo);
            Scanner lector = new Scanner(file);
            
            String linea = "";
            
            lector.nextLine();
            
            while (lector.hasNext()){
                
                linea = lector.nextLine();
                
                String [] campos = linea.split(",");
                
                String fecha = campos[0];
                
                double positividad = Double.parseDouble(campos[4]);
     
                //System.out.println(linea);
                
                datos_covid_baleares.put(fecha,positividad);
                
                for (Map.Entry<String, Double> entry: datos_covid_baleares.entrySet()){
                    if(entry.getValue() > mayor_nivel_positividad){
                        mayor_nivel_positividad = entry.getValue();
                        municipio_mas_contagiado = entry.getKey();
                    }
                }
              
            }
            
        } catch(IOException e){
            System.out.println("Error al encontrar o abrir el archivo, código: " + e);
        }
    }
    
    public double obtener_mayor_positividad(){
        return mayor_nivel_positividad;
    }
    public String obtener_municipio_mas_contagio(){
        return municipio_mas_contagiado;
    }
    
}
