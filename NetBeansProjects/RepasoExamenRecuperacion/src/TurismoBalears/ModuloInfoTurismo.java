/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurismoBalears;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModuloInfoTurismo {
    
    private String archivo;
    private double porcentaje_origen;
    private String comunidad_mayor_origen;
    private Map<String,Double> turismo_baleares;
    private String segunda_comunidad;
    private double segundo_porcentaje;
    
    public ModuloInfoTurismo(String archivo){
        this.archivo = archivo;
        comunidad_mayor_origen = "";
        porcentaje_origen = 0;
        turismo_baleares = new HashMap<>();
    }
    
    public void getInfoTurismo(){
        try{
            File file = new File(archivo);
            Scanner lector = new Scanner(file);
            
            lector.nextLine();
            
            while(lector.hasNext()){
                
                String linea = lector.nextLine();
                
                //System.out.println(linea);
                
                String [] campos = linea.split(";");
                
                String comunidad = campos[3];
                
                Double porcentaje = Double.parseDouble(campos[4]);
                
                turismo_baleares.put(comunidad, porcentaje);
                
                String comunidad_max_turismo= "";
                double porcentaje_max_turismo = 0.0;
                double segundo = Double.MIN_NORMAL;
                String segundo2 = "";
                for (Map.Entry<String, Double> entry: turismo_baleares.entrySet()){
                    if(entry.getValue() > porcentaje_max_turismo){
                        porcentaje_max_turismo = entry.getValue();
                        comunidad_max_turismo = entry.getKey();
                    } else if(entry.getValue() > segundo  ){
                        segundo = entry.getValue();
                        segundo2 = entry.getKey();
                    }
                }    
                
                
                this.comunidad_mayor_origen = comunidad_max_turismo;
                this.porcentaje_origen = porcentaje_max_turismo;
                this.segunda_comunidad = segundo2;
                this.segundo_porcentaje = segundo;
            }
            
            
        } catch(IOException ex){
            System.out.println("Error al leer o accede al archivo, código:" + ex);
        }
    }
    
    public double getPorcentajeMayor(){
        return porcentaje_origen;
    }
    
    public String getComunidadMayorOrigen(){
        return comunidad_mayor_origen;
    }
    
    public String getSegundaComunidad(){
        return segunda_comunidad;
        
    }
    public double getSegundoPorcentaje(){
        return segundo_porcentaje;
    }
}
