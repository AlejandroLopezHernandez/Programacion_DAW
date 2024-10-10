/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainArbol {
    public static void main(String[] args) {
    ArrayList<Arbol> arboles = new ArrayList<>();
    
    Pino pino = new Pino(10,false,5.0,5.2,0);
    Roble roble = new Roble(15.0,true,0, 3.8,1000,true);
    Eucalipto eucalipto1 = new Eucalipto(8.2,false,0,4.0,2000);
    Eucalipto eucalipto2 = new Eucalipto(13,false,0,4.0,3000);
    
    arboles.add(roble);
    arboles.add(pino);
    arboles.add(eucalipto1);
    arboles.add(eucalipto2);
    
    
    double produccion = 0.0;
    double hectareas = 0.0;
        for (Arbol ar : arboles) {
            produccion += ar.getProduccion_kg();
            hectareas += ar.getExtension_ocupada();
        }
        System.out.println("La producción total ha sido de: " + produccion + " con una superficie de: " + hectareas);
        
    ArrayList<Arbol> arboles_caracteristicas = new ArrayList<>();
    
        for (Arbol ar : arboles) {
            if(ar.getExtension_ocupada() > 9 && ar.isHay_plaga() == false && ar.getTasa_crecimiento() >= 4.0){
                arboles_caracteristicas.add(ar);
            }
            System.out.println(ar.getExtension_ocupada() + " "+ ar.isHay_plaga());
        }
        
        
    }           
}
