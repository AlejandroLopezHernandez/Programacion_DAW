/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema_Solar;
import java.util.*;
/**
 *
 * @author Alejandro Lopez
 */
public class Satelite {
    private String nombre;
    private double masa;
   
        
public Satelite (String nombre, double masa){
        this.nombre=nombre;
        this.masa=masa;
       
}
public void setSatelite(String nombre){
    this.nombre=nombre;
}
public String getSatelite(){
    return this.nombre;
}
public void setMasa_Satelite(double masa){
    this.masa=masa;
}
public double getMasa_Satelite(){
    return this.masa;
}
}
