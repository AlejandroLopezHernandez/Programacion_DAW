/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main_SistemaAcademico {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico(4,4);
        
        sistema.ponerNota(0, 0, 5);
        sistema.ponerNota(1, 0, 4);
        sistema.ponerNota(2, 0, 8);
        sistema.ponerNota(3, 0, 8);
        
        sistema.ponerNota(0, 1, 6);
        sistema.ponerNota(1, 1, 3);
        sistema.ponerNota(2, 1, 8);
        sistema.ponerNota(3, 1, 10);
        
        sistema.ponerNota(0, 2, 3);
        sistema.ponerNota(1, 2, 4);
        sistema.ponerNota(2, 2, 10);
        sistema.ponerNota(3, 2, 9);
        
        sistema.imprimirTablaNotas();
        System.out.println("---------------------------------------------------------");
        System.out.println("La nota media del Alumno 0 es: "+ sistema.obtenerNotaMedia(0) +" y sus suspensos son: " + sistema.obtenerNumeroSuspensos(0));
        System.out.println("La nota media del Alumno 1 es: "+ sistema.obtenerNotaMedia(1) +" y sus suspensos son: " + sistema.obtenerNumeroSuspensos(1));
        System.out.println("La nota media del Alumno 2 es: "+ sistema.obtenerNotaMedia(2) +" y sus suspensos son: " + sistema.obtenerNumeroSuspensos(2));
        System.out.println("La nota media del Alumno 3 es: "+ sistema.obtenerNotaMedia(3) +" y sus suspensos son: " + sistema.obtenerNumeroSuspensos(3));
        System.out.println("---------------------------------------------------------");
        System.out.println("La mejor nota de la asignatura del Alumno 0 es en la asignatura : " + sistema.obtenerAsignaturaMejorNota(0));
        System.out.println("La mejor nota de la asignatura del Alumno 1 es en la asignatura : " + sistema.obtenerAsignaturaMejorNota(1));
        System.out.println("La mejor nota de la asignatura del Alumno 2 es en la asignatura : " + sistema.obtenerAsignaturaMejorNota(2));
        System.out.println("La mejor nota de la asignatura del Alumno 3 es en la asignatura : " + sistema.obtenerAsignaturaMejorNota(3));
    }
}
