/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartera_valores;

/**
 *
 * @author Alejandro Lopez
 */
public class Accion {
    
    private String nombre;
    private double valor_de_compra;
    private double valor_actual;
  
    public Accion(String nombre, double valor_de_compra, double valor_actual) {
        
        this.nombre = nombre;
        this.valor_de_compra = valor_de_compra;
        this.valor_actual = valor_actual;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor_de_compra() {
        return valor_de_compra;
    }

    public void setValor_de_compra(double valor_de_compra) {
        this.valor_de_compra = valor_de_compra;
    }

    public double getValor_actual() {
        return valor_actual;
    }

    public void setValor_actual(double valor_actual) {
        this.valor_actual = valor_actual;
    }
    
}

