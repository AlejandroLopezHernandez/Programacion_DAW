/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioOscars;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrolopezhernandez
 */
public class EscritorGanadoresOscar {
    private String archivo;
    FileWriter escritor;
    
    //Método constructor ´
public EscritorGanadoresOscar (String archivo){
    this.archivo = archivo;
        try {
            escritor = new FileWriter(archivo);
        } catch (IOException ex) {
            System.out.println("Error al escribir archivo " + ex);
        }
}
//Métododo 1 para escribir
public void escribirGanador (String nombreGanador, String categoria){
    try{
        escritor.write("#Mejor actor para : " + nombreGanador);
        escritor.write("#Mejor pelicula para : " + categoria);
    }catch (IOException ex){
        System.out.println("Error al escribir archivo " +ex);
    }
}
//Muy importante, hay que cerrar el escritor
public void cerrarEscritor(){
    try{
       escritor.close();
    }catch (IOException ex){
        System.out.println("Error al escribir archivo " +ex);
}
}
//Estos métodos son una copia entre ellos
public void escribirGanadorMejorActriz (String nombreGanador){
    try{
        escritor.write("#Mejor actriz: " + nombreGanador);
    } catch (IOException ex){
        System.out.println("Error al escribir archivo " +ex);
}
}
public void escribirGanadorMejorActor (String nombreGanador){
    try{
        escritor.write("#Mejor actor: " + nombreGanador);
    } catch (IOException ex){
        System.out.println("Error al escribir archivo " +ex);
}
}
public void escribirGanadorMejorPelicula (String nombreGanador){
    try{
        escritor.write("#Mejor pelicula: " + nombreGanador);
    } catch (IOException ex){
        System.out.println("Error al escribir archivo " +ex);
}
}
}