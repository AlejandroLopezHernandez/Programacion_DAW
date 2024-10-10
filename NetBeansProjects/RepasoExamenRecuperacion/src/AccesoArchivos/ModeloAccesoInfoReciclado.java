/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivos;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ModeloAccesoInfoReciclado {
    
    private String nombre_archivo;
    int total_municipios;
    int total_kg_reciclados;
    int total_contenedores;
    String municipio_mas_reciclador;
    private Map<String,Integer> array_asociativo_kg = new HashMap<>();
    private Map<String,Double> array_asociativo_irpc = new HashMap<>(); 

    public ModeloAccesoInfoReciclado (String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
        total_municipios = 0;
        total_kg_reciclados = 0;
        total_contenedores = 0;
        array_asociativo_kg = new HashMap<>();
        array_asociativo_irpc = new HashMap<>();
    }
 
    public void extraer_info_reciclado(){
        try {
            File file = new File(nombre_archivo);
            Scanner lector = new Scanner(file);
            String linea;
            String municipio_mas_reciclador;
            int kg_max = 0;
            lector.nextLine();
            
            while(lector.hasNext()){
                linea = lector.nextLine();
                
                String [] campos = linea.split(";");
                
                //int vidrio_municipio_codigo = Integer.parseInt(campos[1]);
                String vidrio_municipio_nombre = campos[1];
                //int vidrio_anyo = Integer.parseInt(campos [3]);
                int vidrio_numero_habitantes = Integer.parseInt(campos[3]);
                int vidrio_numero_contenedores = Integer.parseInt(campos [4]);
                int vidrio_recogido_kg = Integer.parseInt(campos [5]);
                
                total_municipios = total_municipios +1;
                total_contenedores = total_contenedores + vidrio_numero_contenedores;
                total_kg_reciclados += total_kg_reciclados;
                
                double irpc = ((double) total_kg_reciclados)/ vidrio_numero_habitantes;
                
                if (total_kg_reciclados > kg_max){
                    kg_max = total_kg_reciclados;
                    municipio_mas_reciclador = vidrio_municipio_nombre;
                }
                  array_asociativo_kg.put(vidrio_municipio_nombre, total_kg_reciclados);
                  array_asociativo_irpc.put(vidrio_municipio_nombre, irpc);
            }
            
        } catch(IOException ex){
            System.out.println("Error al leer el archivo: " + ex);
        }
    }
 
    
}
