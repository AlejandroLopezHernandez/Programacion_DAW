/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloAccesoInfoContaminacion {
    private String agente_mas_contaminante_CO;
    private String agente_mas_contaminante_CO2;
    private String archivo;
    private Map<String, Double> array_asociativo_CO = new HashMap<>();
    private Map<String, Double> array_asociativo_CO2 = new HashMap<>();
    
    
    public ModuloAccesoInfoContaminacion (String archivo){
        this.archivo = archivo;
        array_asociativo_CO = new HashMap<>();
        array_asociativo_CO2 = new HashMap<>();
        
        
    }
    
    public void extraerInfoContaminacion (){
        try {
            File file = new File(this.archivo);
            Scanner lector = new Scanner(file);
            String linea;
            
            lector.nextLine();
            
            while (lector.hasNext()){
                   linea = lector.nextLine();
                   String [] campos = linea.split(";");
                   
                   //String anyo = campos[1];
                   Double atm_sector = Double.parseDouble(campos[2]);
                   String atm_descripcion = campos[3];
                   String atm_desc = campos[4];
                   String atm_cantidad = campos[5];
                   
                   if (atm_desc.contains("CO")){
                      array_asociativo_CO.put(atm_descripcion,atm_sector);
                   } else{
                      array_asociativo_CO2.put(atm_descripcion,atm_sector);
                           }
                   }
                   
            }
             catch (FileNotFoundException ex) {
            Logger.getLogger(ModuloAccesoInfoContaminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String agenteMasContaminanteCO2(){
        String agente_mas_contaminante_CO2 = "";
        Double nivel_mayor_CO2 = 0.0;
        for (Map.Entry<String, Double> entry :array_asociativo_CO2.entrySet()){
            if (entry.getValue()>nivel_mayor_CO2){
                nivel_mayor_CO2 = entry.getValue();
                agente_mas_contaminante_CO2 = entry.getKey();
            }
        }
        return agente_mas_contaminante_CO2;
    }
    
    public String agenteMasContaminanteCO(){
        String agente_mas_contaminante_CO = "";
        double mayor_nivel_CO = 0.0;
        
        for (Map.Entry<String, Double> entry : array_asociativo_CO.entrySet()){
            if (entry.getValue()>mayor_nivel_CO){
                mayor_nivel_CO = entry.getValue();
                agente_mas_contaminante_CO = entry.getKey();
            }
        }
        
        return agente_mas_contaminante_CO;
    }
    
    /*public double getNivelCOAgente(String codigo){
        double nivel_co = 0.0;
        
        for (Map.Entry<String,Double> entry : array_asociativo_CO.entrySet()){
            if (entry.getValue() = )
        }
        
        return nivel_co;
    }*/
    
    /*public double getNivelCO2Agente (String codigo){
        
    }*/
    
}
