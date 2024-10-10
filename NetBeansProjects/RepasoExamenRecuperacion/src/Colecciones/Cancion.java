/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Cancion {

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", formato=" + formato + '}';
    }

    public Cancion(String titulo, String artista, int duracion, String formato) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getFormato() {
        return formato;
    }
    
    private String titulo;
    private String artista;
    private int duracion;
    private String formato;
    
}
