/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author alejandrolopezhernandez
 */
public class EcosistemaForestal {
    private ArrayList<Arbol> arboles;
    
    @Override
    public String toString() {
        return "EcosistemaForestal{" + "arboles=" + arboles + '}';
    }
    
    
    public EcosistemaForestal (){
        arboles = new ArrayList<>();
    }
    
    public void agregar_arbol (Arbol a){
        arboles.add(a);
    }
    public void eliminar_arbol (Arbol a){
        arboles.remove(a);
    }
    
    public double getAreaTotal(){
        double area_ocupada = 0.0;
        
        for (Arbol a : arboles) {
            area_ocupada += a.getExtension_ocupada();
        }
        return area_ocupada;
    }
    
    public boolean hay_plaga_ecosistema (){
        boolean hay_plaga = false;
        for (Arbol a : arboles) {
            if (a.ha_sufrido_plaga() == true){
                hay_plaga = true;
            } 
            } 
        return hay_plaga;
        }
        public int getNumeroEspeciesAfectadaPlagas(){
            int contador = 0;
            for (Arbol a : arboles) {
                if(a.ha_sufrido_plaga()==true){
                    contador ++;
                }
            }
            return contador;
        }
        
        public String getEspecieDominante(){
        String especie_dominante = null;
        double extension_mayor = 0.0;
            for (Arbol a : arboles) {
                if (a.getExtension_ocupada() > extension_mayor){
                    extension_mayor = a.getExtension_ocupada();
                    especie_dominante = a.getEspecie();
                }
            }
        return especie_dominante;
        }
        public double getCrecimientoFuturo(String especie, int anyos){
            double nueva_extension = 0.0;
            
            for (Arbol a : arboles) {
                double extension = a.getExtension_ocupada();
                double tasa_crecimiento = a.getTasa_crecimiento();
                nueva_extension = extension * Math.pow((1 + tasa_crecimiento / 100), anyos);
            }
            return nueva_extension;
        }
    }

