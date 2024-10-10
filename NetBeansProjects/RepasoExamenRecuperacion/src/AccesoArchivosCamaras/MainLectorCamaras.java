/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivosCamaras;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainLectorCamaras {
    public static void main(String[] args) {
        LectorInfoCamaras lector = new LectorInfoCamaras("CCTV_via_publica.csv");
        
        lector.extraerInfoVigilancia();
        
        System.out.println(lector.getInfoTotalLozalizaciones());
        System.out.println(lector.getinfoTotalCamaras());
        System.out.println(lector.getUbicacionMasVigilada());
    }
}
