/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivosAlquiler;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloLectura {
    
    private String archivo;
    private Map<String,Integer> array_asociativo_alquiler_coches;
    private String municipio_mas_empresas;
    private String municipio_menos_empresas;
    private int total_empresas;
    private int total_empresas_palma;
    private int total_empresas_calvia;
    
    public ModuloLectura(String archivo){
        
        this.archivo = archivo;
        this.array_asociativo_alquiler_coches = new HashMap<>();
        this.municipio_mas_empresas = "";
        this.total_empresas = 0;
        this.total_empresas_palma = 0;
        this.total_empresas_calvia = 0;
        this.municipio_menos_empresas = "";
        
    }
    
   public void extraerInfo(){
          
        int max_empresas = Integer.MIN_VALUE;
        int min_empresas = Integer.MAX_VALUE;
       File file = new File(archivo);
       try{
           Scanner lector = new Scanner(file);
           String linea_de_archivo;
           
           lector.nextLine();
           
           while (lector.hasNext()){
                  linea_de_archivo = lector.nextLine();
                  //System.out.println(linea_de_archivo);
                  
                  String campos [] = linea_de_archivo.split(",");
                  
                  String nombre = campos[1];
                  int municipio = Integer.parseInt(campos[2]);
                  
                  array_asociativo_alquiler_coches.put(nombre, municipio);
                  
                  //System.out.println(array_asociativo_alquiler_coches);
              
           }
           
           
       } catch(IOException e){
           System.out.println("Error al leer o encontrar archivo, código de error: " + e);
       }
       int max_municipios = array_asociativo_alquiler_coches.size();
       this.total_empresas = max_municipios;
       
       int contador_empresas_palma = 0;
       int contador_empresas_calvia = 0;
       
       
       for (Map.Entry< String, Integer> entry: array_asociativo_alquiler_coches.entrySet()){
           String ciudad = entry.getKey();
           int numero_empresas = entry.getValue();
           
           if(entry.equals("PALMA")){
               contador_empresas_palma ++;
               this.total_empresas_palma = contador_empresas_palma;
           } else if (entry.equals("CALVIÀ")){
                contador_empresas_calvia ++;
                this.total_empresas_calvia = contador_empresas_calvia;
           } else if (numero_empresas > max_empresas){
               max_empresas = numero_empresas;
               this.municipio_mas_empresas = ciudad;
           } else if (numero_empresas < min_empresas){
               min_empresas = numero_empresas;
               this.municipio_menos_empresas = ciudad;
           }
     
   }
   }
      
    public int getTotalEmpresas(){
        return total_empresas;
    }
       
     public int getTotalEmpresasenPalma(){
         return total_empresas_palma;
     }
     public int getTotalEmpresasCalvia(){
         return total_empresas_calvia;
     }
     public String getCiudadmasEmpresas(){
         return municipio_mas_empresas;
     }
     public String getPueblomenosEmpresas(){
         return municipio_menos_empresas;
     }   
}


    
   
