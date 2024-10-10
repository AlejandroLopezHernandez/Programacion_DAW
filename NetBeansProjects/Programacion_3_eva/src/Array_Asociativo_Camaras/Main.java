/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Asociativo_Camaras;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
        array_camaras camaras = new array_camaras("CCTV_via_publica.csv");
        camaras.extraerInformacionVigilancia();
        camaras.getTotalLocalizaciones();
        camaras.getTotalCamaras();
        camaras.getTotalLocalizaciones();
        camaras.getUbicacionesMasVigilada();
      
        
    }
}
