/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Libro {
       
    private String titulo;
    private String autor;
    private int numero_descargas;
    private double valoracion_media;
    private int numero_valoraciones;

    public Libro(String titulo, String autor, int numero_descargas, int valoracion_media, int numero_valoraciones) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.numero_descargas = numero_descargas;
        this.valoracion_media = valoracion_media;
        this.numero_valoraciones = numero_valoraciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_descargas() {
        return numero_descargas;
    }

    public void setNumero_descargas(int numero_descargas) {
        this.numero_descargas = numero_descargas;
    }

    public double getValoracion_media() {
        return valoracion_media;
    }

    public void setValoracion_media(double valoracion) {
        this.valoracion_media = valoracion;
    }

    public int getNumero_valoraciones() {
        return numero_valoraciones;
    }

    public void setNumero_valoraciones(int numero_valoraciones) {
        this.numero_valoraciones = numero_valoraciones;
    }
    
    public void incrementar_descargas(){
        numero_descargas ++;
    }
    
    public void incrementar_valoraciones(){
        numero_valoraciones ++;
    }
    
    
}
