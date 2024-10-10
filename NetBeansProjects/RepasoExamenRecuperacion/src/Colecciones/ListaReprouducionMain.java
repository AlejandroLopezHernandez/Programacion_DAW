/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ListaReprouducionMain {
    public static void main(String[] args) {
        ListaReproduccion lista_de_reproduccion = new ListaReproduccion();
        
        Cancion cancion1 = new Cancion("I want to break free","Queen",4,"MP3");
        Cancion cancion2 = new Cancion("The Nights","Avicii",5,"MP4");
        Cancion cancion3 = new Cancion("Smells like your teen spirit","Nirvana",4,"MP4");
        
        lista_de_reproduccion.agregarCancion(cancion3);
        lista_de_reproduccion.agregarCancion(cancion2);
        lista_de_reproduccion.agregarCancion(cancion1);
        
        lista_de_reproduccion.mostrarCanciones();
        lista_de_reproduccion.reproducir();
        lista_de_reproduccion.reproducir();
        lista_de_reproduccion.reproducir();
        System.out.println(lista_de_reproduccion.obtener_reproducciones());
        System.out.println("Las canciones que están en formado MP3 son: " + lista_de_reproduccion.getCancionesMP3());
        System.out.println("Las canciones que están en formato MP4 son: " + lista_de_reproduccion.getCancionesMP4());
        
        
        
    }
}
