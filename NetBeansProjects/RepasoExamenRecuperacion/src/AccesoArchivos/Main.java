/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivos;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
    ModuloAccesoInfoContaminacion leer_archivo = new ModuloAccesoInfoContaminacion("contaminacion.csv");
    leer_archivo.extraerInfoContaminacion();
    leer_archivo.agenteMasContaminanteCO();
    
    
    //InterfazGrafica gui = new InterfazGrafica(); 
    }
   
}
