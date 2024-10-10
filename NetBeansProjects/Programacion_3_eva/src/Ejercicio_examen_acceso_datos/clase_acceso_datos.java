/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_examen_acceso_datos;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alejandrolopezhernandez
 */
public class clase_acceso_datos {
    private int total_municipios;
    private int total_contenedores;
    private int total_kg_reciclados;
    private Map <String, Integer> array_asociativoKG = new HashMap<>();
    private Map <String, Integer> array_asociativoIRPC= new HashMap<>();
    private String archivo;
   
    public clase_acceso_datos(String archivo) {
        this.total_municipios = 0;
        this.total_contenedores = 0;
        this.total_kg_reciclados = 0;
        this.archivo = archivo;
        array_asociativoKG = new HashMap<>();
        array_asociativoIRPC = new HashMap<>();
    }
    public void extraer_info_reciclado (){
        try{
            File archivo_reciclado = new File(this.archivo);
            Scanner reader = new Scanner (archivo_reciclado);
            String linea;
            reader.nextLine();
            int kg_max = 0;
            String municipio_max_kg = "";
            
            while (reader.hasNext()){
                linea = reader.nextLine();
                String [] datos = linea.split(";");
                String municipio = datos[1];
                int habitantes = Integer.parseInt(datos[3]);
                int contenedores = Integer.parseInt(datos[4]);
                int kg_reciclados = Integer.parseInt(datos[5]);
                
                total_municipios = total_municipios +1;
                total_contenedores = total_contenedores + contenedores;
                total_kg_reciclados = total_kg_reciclados + kg_reciclados;
                
                double irpc = ((double)kg_reciclados/ habitantes);
                if (kg_reciclados > kg_max){
                    kg_max = kg_reciclados;
                    municipio_max_kg = municipio;
                }
                array_asociativoKG.put(municipio,kg_reciclados);
                array_asociativoIRPC.put(municipio, irpc);
            }
        } catch (Exception e) {
            System.out.println("Error, código de error " + e);
        }
    }
    
    
    
    
}
