/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Eucalipto extends Arbol {
    private double tasa_absorcion = 0.8;

    public double getTasa_absorcion() {
        return tasa_absorcion;
    }
    
    public Eucalipto(double extension_ocupada, boolean hay_plaga, double altura, double tasa_crecimiento, double produccion_kg) {
        super(extension_ocupada, hay_plaga, altura, tasa_crecimiento, produccion_kg);
    }

    

   
    
    
}
