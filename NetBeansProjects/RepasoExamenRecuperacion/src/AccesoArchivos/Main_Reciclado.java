/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivos;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main_Reciclado {
    public static void main(String[] args) {
        ModeloAccesoInfoReciclado modulo_reciclado = new ModeloAccesoInfoReciclado("reciclado.csv");
        
        modulo_reciclado.extraer_info_reciclado();
    }
}
