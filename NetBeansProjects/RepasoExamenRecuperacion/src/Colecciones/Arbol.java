/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Arbol {

    public Arbol(String especie, double extension_ocupada, boolean ha_sufrido_plaga, double tasa_crecimiento) {
        this.especie = especie;
        this.extension_ocupada = extension_ocupada;
        this.ha_sufrido_plaga = ha_sufrido_plaga;
        this.tasa_crecimiento = tasa_crecimiento;
    }

    @Override
    public String toString() {
        return "Arbol{" + "especie=" + especie + ", extension_ocupada=" + extension_ocupada + ", ha_sufrido_plaga=" + ha_sufrido_plaga + ", tasa_crecimiento=" + tasa_crecimiento + '}';
    }
    
    private String especie;
    private double extension_ocupada;
    private boolean ha_sufrido_plaga;
    private double tasa_crecimiento;
    
    
    public boolean ha_sufrido_plaga() {
        return ha_sufrido_plaga;
    }
   
    
    public String getEspecie() {
        return especie;
    }

    public double getExtension_ocupada() {
        return extension_ocupada;
    }

    public double getTasa_crecimiento() {
        return tasa_crecimiento;
    }

    
   
    
    
}
