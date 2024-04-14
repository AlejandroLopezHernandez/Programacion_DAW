package Persistencia_Datos.Ejercicio_Dia_D;

import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;

/**
 *
 * @author Alejandro Lopez
 */
public class ModuloLectura {
    private String archivo;
    Codificador codificador;
    
    public ModuloLectura (String nombre_archivo){
        this.archivo = archivo;
        this.codificador = new Codificador();
        
    }
    
    public void leer (){
        try {
            File archivo_leido = new File(archivo);
            String linea_leida;
            Scanner reader = new Scanner(archivo);
            linea_leida = reader.nextLine();
            while(reader.hasNext(linea_leida)){
            linea_leida = reader.nextLine();
                String [] campos = linea_leida.split(",");
                ArrayList <String> instrucciones = new ArrayList<>();
            for (int i = 0; i < campos.length; i++) {
                instrucciones.add(String.valueOf(campos[i]));
            }    

            }
        } catch(IOException exepcion){
            System.out.println("Error al leer el archivo");
        }
    }
}