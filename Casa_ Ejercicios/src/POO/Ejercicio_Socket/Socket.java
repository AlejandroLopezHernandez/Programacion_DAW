package POO.Ejercicio_Socket;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Socket {

/**
 *
 * @author Alejandro Lopez
 */

    public Socket(int puerto_inicial, int puerto_origen, String maquina_destino) {
        this.puerto_inicial = puerto_inicial;
        this.puerto_origen = puerto_origen;
        this.maquina_destino = maquina_destino;
    }
    private int puerto_inicial;
    private int puerto_origen;
    private String maquina_destino;
    
    
    public void escanear(){
     for (int puerto = this.puerto_inicial; puerto < this.puerto_origen; puerto++){
             Socket socket = new Socket(puerto, puerto, maquina_destino);
             System.out.println(" La máquina tiene el puerto abierto: " + puerto + " abiertos");//Se detecta una excepción que impide al programa funcionar
         }
     }   
}



