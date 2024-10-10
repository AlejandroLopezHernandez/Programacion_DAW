/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ListaReproduccion {
 
    private ArrayList<Cancion> canciones;
    private int reproducciones;
    
     public ListaReproduccion() {
        
        canciones = new ArrayList<>();
        this.reproducciones = reproducciones;
    }
     
    public void agregarCancion(Cancion ca){
        canciones.add(ca);
    }
    public void quitarCancion(Cancion ca){
        canciones.remove(ca);
    }
    public void reproducir(){
        reproducciones ++;
    }
    public int obtener_reproducciones(){
        int numero_reproducciones = 0;
        numero_reproducciones += this.reproducciones;
        
        return numero_reproducciones;
    }
    public void mostrarCanciones(){
        System.out.println("Las canciones que hay en la lista de reproducción son: "); 
        for(Cancion ca: canciones){
            System.out.println(ca);
        }    
    }
    public ArrayList<Cancion> getCancionesMP3(){
        ArrayList<Cancion> cancionesMP3 = new ArrayList<>();
        
        for (Cancion ca : canciones) {
            if(ca.getFormato().equalsIgnoreCase("MP3")){
               cancionesMP3.add(ca);
            }
        }
        return cancionesMP3;
    }
    public ArrayList<Cancion> getCancionesMP4(){
        ArrayList<Cancion> cancionesMP4 = new ArrayList<>();
        
        for (Cancion ca : canciones) {
            if(ca.getFormato().equalsIgnoreCase("MP4")){
                cancionesMP4.add(ca);
            }
        }
        return cancionesMP4;
    }
}
