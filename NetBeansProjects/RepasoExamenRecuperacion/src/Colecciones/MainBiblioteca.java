/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        
        Libro libro1 = new Libro("Los hermanos Kazamarov","Fiodor Dovstoyevsky",0,0,0);
        Libro libro2 = new Libro("Bodas de sangre","García Lorca",0,0,0);
        Libro libro3 = new Libro("Territorio comanche","Perez Reverte",0,0,0);
        
        biblio.agregar_libro(libro3);
        biblio.agregar_libro(libro2);
        biblio.agregar_libro(libro1);
        
        for (int i = 0; i < 100; i++) {
            biblio.descargar_libro(libro1);
            
        }
        for (int i = 0; i < 50; i++) {
           biblio.descargar_libro(libro3);
            
        }
        
        biblio.valorarLibro("Los hermanos Kazamarov", 5);
        biblio.valorarLibro("Territorio comanche", 4);
        
        
        System.out.println("LIBRO MENOS DESCARGADO: ");
        System.out.println(biblio.obtenerLibroMenosDescargado());
        System.out.println("LIBRO MEJOR VALORADO: ");
        //biblio.obtenerLibroMejorValorado();
        System.out.println(biblio.obtenerLibroMejorValorado());
        
        System.out.println("TOTAL DE DESCARGAS REALIZADAS: ");
        System.out.println(biblio.obtenerTotalDescargas());
        
        System.out.println("DATOS DE LIBROS DE LA BIBLIOTECA");
        biblio.obtenerInfoLibros();
        
        
    }
}
