/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva_ordinaria_1P;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main_Sistema_Puntuacion {
    
    public static void main(String[] args) {
        
        SistemaPuntuacion puntuaciones = new SistemaPuntuacion (3,3);
        
        puntuaciones.setPuntuacion(0, 0, 30);
        puntuaciones.setPuntuacion(0, 1, 40);
        puntuaciones.setPuntuacion(0, 2, 80);
        
        puntuaciones.setPuntuacion(1, 0, 60);
        puntuaciones.setPuntuacion(1, 1, 30);
        puntuaciones.setPuntuacion(1, 2, 85);
        
        puntuaciones.setPuntuacion(2, 0, 30);
        puntuaciones.setPuntuacion(2, 1, 50);
        puntuaciones.setPuntuacion(2, 2, 100);
        
        System.out.println("La media de puntuacion del jugador 0 es de " + puntuaciones.obtenerPuntuacionMedia(0));
        System.out.println("La media de puntuacion del jugador 0 es de " + puntuaciones.obtenerPuntuacionMedia(1));
        System.out.println("La media de puntuacion del jugador 0 es de " + puntuaciones.obtenerPuntuacionMedia(2));
        
        System.out.println("Entre el jugador 0 y el jugador 1 el que tiene más puntuación es: " + puntuaciones.compararJugadores(0, 1));
        
        System.out.println("El nivel que tiene menor puntuación es: " + puntuaciones.obtenerNivelMenorPuntuacion(0));
                
        
    }
}
