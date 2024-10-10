/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainJuego {
    public static void main(String[] args) {
        
        Enano enano = new Enano(10,4,2,4,0);
        Elfo elfo = new Elfo(10,2,5,3,0);
        Mago mago = new Mago(10,3,6,3,0);
        
        System.out.println("Los personajes creados en el juego son: ");
        System.out.println("Enano:" + enano.obtenerCadenaVector());
        System.out.println("Elfo: "+elfo.obtenerCadenaVector());
        System.out.println("Mago: " +mago.obtenerCadenaVector());
        
        enano.subir_nivel();
        mago.subir_nivel();
        System.out.println("----------------------------------------------------");
        System.out.println("Después de subir su nivel son ");
        
        System.out.println("Enano:" + enano.obtenerCadenaVector());
        System.out.println("Elfo: "+elfo.obtenerCadenaVector());
        System.out.println("Mago: " +mago.obtenerCadenaVector());
        
        
        
    }
}
