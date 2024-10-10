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
public class Biblioteca {
    private int numero_descargas;
    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        
        libros = new ArrayList<>();
        this.numero_descargas = 0;
    }
    
    public void agregar_libro (Libro li){
        libros.add(li);
    }
    
    public void descargar_libro(Libro li){
        li.incrementar_descargas();
        numero_descargas ++;
    }
    
    public void valorarLibro(String titulo, int valoracion){
        for (Libro li : libros) {
            if(li.getTitulo().equalsIgnoreCase(titulo)){
                double libro_valoracion = (li.getValoracion_media() * li.getNumero_valoraciones() + valoracion)/
                        (li.getNumero_valoraciones() + 1);
                        li.incrementar_valoraciones();
        }
        }
    }
    
    public String obtenerLibroMejorValorado(){
        String libro_mejor_valorado = " ";
        double max_valoracion = 0.0;
        for (Libro li : libros) {
            if(li.getValoracion_media() > max_valoracion){
                libro_mejor_valorado = li.getTitulo();
                max_valoracion = li.getValoracion_media();
            }
        }
        return libro_mejor_valorado;
    }
    
    public String obtenerLibroMenosDescargado(){
        String libro_menos_descarga = " ";
        int num_min_descarga = Integer.MAX_VALUE;
        
        for (Libro li : libros) {
            if(li.getNumero_descargas() < num_min_descarga){
                num_min_descarga = li.getNumero_descargas();
                libro_menos_descarga = li.getTitulo();
            }
        }
        return libro_menos_descarga;
    }
    
    public int obtenerTotalDescargas(){
       return numero_descargas;
    }
    
    public void obtenerInfoLibros(){
        for (Libro li : libros) {
            System.out.println("Libro: " + li.getTitulo() + " ||autor: " + li.getAutor() + li.getNumero_descargas() + li.getNumero_valoraciones() + li.getValoracion_media());
        }
    }
}
