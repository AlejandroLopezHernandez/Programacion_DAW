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
public class Planeta {
    private String nombre_planeta;
    private double masa_planeta;
    private ArrayList <Satelite>lista_Satelites;
    
        
public Planeta (String nombre, double masa){
        
this.nombre_planeta=nombre_planeta;
this.masa_planeta=masa_planeta;
this.lista_Satelites = new ArrayList<>();

    }
public void addSatelites(Satelite sat){
    lista_Satelites.add(sat);
 
}
public void Mostrar_Satelites(){
    for(Satelite s:lista_Satelites){
        System.out.println(s.getSatelite());
    }
}
}
