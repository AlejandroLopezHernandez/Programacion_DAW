/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartera_valores;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Lopez
 */
public class Cartera {

    private double cantidad_total;
    private double num_acciones;
   private ArrayList <Accion> acciones;

   public Cartera (double cantidad_total, double num_acciones){
    this.cantidad_total = cantidad_total;
    this.num_acciones = num_acciones;
    acciones = new ArrayList<>();
}
    public double getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(double cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public double getNum_acciones() {
        return num_acciones;
    }

    public void setNum_acciones(double num_acciones) {
        this.num_acciones = num_acciones;
    }
   
    //Métodpara saber si el balance es postivo o negativo
    public String estado_cartera (){
      //Public es siempre te devuelve algo, el nombre que le llamas 
      //y lo que necesitas de fueras
      double resultado = 0;
      String positivo = "positivo";
      String negativo = "negativo";
      
      for (Accion a: acciones){
          resultado +=a.getValor_actual()-a.getValor_de_compra();
          if (resultado >=0){
              return positivo;
          } 
      }  
      return negativo;
    }
    
    public double balance_cartera (){
        double resultado = 0;
      
        for (Accion a : acciones){
            resultado += a.getValor_actual()- a.getValor_de_compra();
        }
        return resultado;
    }
    
    public void comprar_accion (Accion a){
        acciones.add(a);
    } 
    
    public void vender_accion (String accion_vendida){
        Accion accion_encontrada = null;
        for(Accion a: acciones){
            if(a.getNombre().equals(accion_vendida)){
                accion_encontrada = a;
            }       
    }
        acciones.remove(accion_encontrada);
}
    public Accion Accion_mas_rentable (){
        double rentabilidad =0;
        Accion accion_mas_rentable = null;
        double rentabilidad_maxima = 0;
        for (Accion a :acciones){
            rentabilidad = a.getValor_actual() - a.getValor_de_compra();
            if(rentabilidad > rentabilidad_maxima){
                rentabilidad_maxima = rentabilidad;
                accion_mas_rentable = a;
            }
        }
        return accion_mas_rentable;
    }
}
