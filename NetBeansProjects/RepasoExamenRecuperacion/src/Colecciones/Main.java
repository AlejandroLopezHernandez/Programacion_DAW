/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
        EcosistemaForestal bosque = new EcosistemaForestal();
        
        Arbol pino = new Arbol("Pino",10.0,false,5.2);
        Arbol roble = new Arbol("Roble",15,true,3.8);
        Arbol abeto = new Arbol ("Abeto",8.2,false,4.0);
        
       bosque.agregar_arbol(abeto);
       bosque.agregar_arbol(pino);
       bosque.agregar_arbol(roble);
       
        //System.out.println(bosque.toString());
        System.out.println(bosque.getAreaTotal());
        System.out.println(bosque.getEspecieDominante());
        System.out.println(bosque.hay_plaga_ecosistema());
        System.out.println(bosque.getCrecimientoFuturo("abeto", 6));
    }
}
