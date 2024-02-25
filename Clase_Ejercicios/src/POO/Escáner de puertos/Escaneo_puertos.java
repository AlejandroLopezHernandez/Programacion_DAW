/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obtener_puertos;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Lopez
 */
public class Escaneo_puerto {

    public Escaneo_puerto(int puerto_inicial, int puerto_origen, String maquina_destino) {
        this.puerto_inicial = puerto_inicial;
        this.puerto_origen = puerto_origen;
        this.maquina_destino = maquina_destino;
    }
    private int puerto_inicial;
    private int puerto_origen;
    private String maquina_destino;
    
    
    public void escanear(){
     for (int puerto = this.puerto_inicial; puerto < this.puerto_origen; puerto++){
         try {
             Socket socket = new Socket (this.maquina_destino, puerto);
             System.out.println(" La máquina tiene el puerto abierto: " + puerto + " abiertos");//Se detecta una excepción que impide al programa funcionar
         } catch (IOException ex) {
          
         }
        
         }
     }   
}


