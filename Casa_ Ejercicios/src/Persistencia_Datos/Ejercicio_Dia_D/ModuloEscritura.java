package Persistencia_Datos.Ejercicio_Dia_D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alejandro Lopez
 */
public class ModuloEscritura {
    private String archivo;
    Codificador codificador;
    
    public ModuloEscritura (String nombre_archivo){ //Método constructor
        this.archivo= archivo;
        this.codificador = new Codificador();
    }
    
    public void escribir (String mensaje){
        try{
        FileWriter escrituraArchivos = new FileWriter(this.archivo);   
        
        String mensaje_cifrado = this.codificador.cifrar(mensaje);
        escrituraArchivos.write(mensaje_cifrado);
        
        }catch(IOException excepcion){
            System.out.println("¡ERROR CRITICO!");
        }
        
        
    }
}
