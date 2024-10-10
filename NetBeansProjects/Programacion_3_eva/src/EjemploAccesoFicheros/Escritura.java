/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAccesoFicheros;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Escritura {
  String archivo;
  FileWriter escritor;
  
  public Escritura (String archivo){
      this.archivo = archivo;
      try {
          escritor = new FileWriter(archivo);
      } catch (IOException ex) {
          System.out.println("Error al escribir archivo, código del error: " + ex);
      }
  }
  
  public void escribir (String archivo){
      try{
          escritor.write(archivo);
          System.out.println("Archivo escrito con éxito");
      } catch (IOException ex){
          System.out.println("Error al escribir archivo, código del error: " + ex);
      }
  }
  
  public void cerrar(){
      try {
          escritor.close();
      } catch (IOException ex){
          System.out.println("Error al escribir archivo, código del error: " + ex);
      }
  }
     
}
