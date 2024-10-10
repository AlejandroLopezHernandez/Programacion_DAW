/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoPoblacionExtranjera;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloInfoPoblacionEntranjera {
    
    private String archivo;
    private int total_extranjeros;
    private int total_paises;
    private String pais_origen_max;
    private int max_num_pais;
    private int min_num_pais;
    private String pais_min_origen;
    private Map<String,Integer> poblacion_extranjera_catalunya;
    
    public ModuloInfoPoblacionEntranjera(String archivo){
        
        this.archivo = archivo;
        total_extranjeros = 0;
        total_paises = 0;
        pais_origen_max = "";
        max_num_pais = 0;
        min_num_pais = 0;
        pais_min_origen = "";
        poblacion_extranjera_catalunya = new HashMap<>();
        
        try{
            File file = new File(archivo);
            Scanner lector = new Scanner(file);
                         
        } catch(IOException e){
            System.out.println("Error al acceder o encontrar archivo, código: " + e);
        }
    }
    
    public void obtenerInfoExtranjeria(){
        try{
            File file = new File(archivo);
            Scanner lector = new Scanner(file);
                      
            lector.nextLine();
            
            while(lector.hasNext()){
                
                String linea = lector.nextLine();
                
                //System.out.println(linea);
                
                String [] campos = linea.split(",");
                
                String pais = campos[2];
                
                int numero = Integer.parseInt(campos[3]);
                
                poblacion_extranjera_catalunya.put(pais,numero);
                
                this.total_paises = poblacion_extranjera_catalunya.size();
                
                int cantidad_poblacion_extranjera = 0;
                int num_pais_max = 0;
                String pais_mas_extranjeros = "";
                String pais_menos_inmigrantes = "";
                int min_pais = 1;
                
               for (Map.Entry<String,Integer> entry: poblacion_extranjera_catalunya.entrySet()){
                   if(entry.getValue() > num_pais_max){
                       num_pais_max = entry.getValue();
                       pais_mas_extranjeros = entry.getKey();          
                   } else if (entry.getValue() < min_pais){
                            min_pais = entry.getValue();
                            pais_menos_inmigrantes = entry.getKey();
                   }
                   cantidad_poblacion_extranjera += entry.getValue();
               }
               
               this.total_extranjeros = cantidad_poblacion_extranjera;
               this.max_num_pais = num_pais_max;
               this.pais_origen_max = pais_mas_extranjeros;
               this.pais_min_origen = pais_menos_inmigrantes;
               this.min_num_pais = min_pais;
               
            }
           
            
        } catch(IOException e){
            System.out.println("Error al acceder o encontrar archivo, código: " + e);
        }
    }
    
    public int getTotalExtranjeros(){
        return total_extranjeros;
    }
    public int getTotalPaises(){
        return total_paises;
    }
    public String getMayorPaisOrigen(){
        return pais_origen_max;
    }
    public int getNumeroExtranjerosPais(){
        return max_num_pais;
    }
    public int getNumeroMenorExtranjeros(){
        return min_num_pais;
    }
    public String getPaisMenosOrigen(){
        return pais_min_origen;
    }
            
    
}
