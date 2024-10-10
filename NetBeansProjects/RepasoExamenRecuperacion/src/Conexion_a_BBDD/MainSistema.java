/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainSistema {
    public static void main(String[] args) {
        SistemaPuntuacionBBDD bases_de_datos = new SistemaPuntuacionBBDD();
        
        //bases_de_datos.setPuntuacion(2, 4, 5, 6);
        
        /*bases_de_datos.getPuntuacion(0);
        bases_de_datos.getPuntuacionMaxima(0);
        bases_de_datos.getPuntuacionMedia(2);
        
        bases_de_datos.getMenorNivelPuntuacion(0);
        bases_de_datos.getMenorNivelPuntuacion(1);
        bases_de_datos.getMenorNivelPuntuacion(2);*/
        
        InterfazGraficaPuntuacion interfaz = new InterfazGraficaPuntuacion();
        
    }
}
