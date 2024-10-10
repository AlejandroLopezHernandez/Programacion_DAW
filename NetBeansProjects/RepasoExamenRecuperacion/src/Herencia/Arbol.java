/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Arbol {

    public Arbol(double extension_ocupada, boolean hay_plaga, double altura, double tasa_crecimiento,double produccion_kg) {
        this.extension_ocupada = extension_ocupada;
        this.hay_plaga = hay_plaga;
        this.altura = altura;
        this.produccion_kg = produccion_kg;
        this.tasa_crecimiento = tasa_crecimiento;
    }

    public double getTasa_crecimiento() {
        return tasa_crecimiento;
    }

    public double getExtension_ocupada() {
        return extension_ocupada;
    }

    public boolean isHay_plaga() {
        return hay_plaga;
    }

    public double getAltura() {
        return altura;
    }

    public double getProduccion_kg() {
        return produccion_kg;
    }
    
    protected double extension_ocupada;
    protected boolean hay_plaga;
    protected double altura;
    protected double produccion_kg;
    protected double tasa_crecimiento;
    protected double tasa_absorcion;

    public double getTasa_absorcion(double co2) {
        double tasa_absorcion = 0.0;
        tasa_absorcion = co2 * this.tasa_absorcion;
        return tasa_absorcion;
    }
    
}
