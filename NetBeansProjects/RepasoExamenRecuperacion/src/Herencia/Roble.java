/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Roble extends Arbol {
    private boolean dehesa;

    public Roble(double extension_ocupada, boolean hay_plaga, double altura, double produccion_kg,double tasa_crecimiento, boolean dehesa) {
        super(extension_ocupada, hay_plaga, altura, tasa_crecimiento, produccion_kg);
        this.dehesa = dehesa;
    }

  
    
}
