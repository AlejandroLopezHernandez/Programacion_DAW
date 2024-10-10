/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva_ordinaria_1P;

/**
 *
 * @author alejandrolopezhernandez
 */
public class SistemaPuntuacion {
    
    private double [] [] sistema_puntuaciones;
    private int max_jugador;
    private int max_nivel;
    
    public SistemaPuntuacion (int max_jugador, int max_nivel){
        
        sistema_puntuaciones = new double [max_jugador] [max_nivel];
        this.max_jugador = max_jugador;
        this.max_nivel = max_nivel;
    }
    
    public void setPuntuacion (int jugador, int nivel, double puntuacion){
        sistema_puntuaciones[jugador] [nivel] = puntuacion;
    }
    public double getPuntuacion(int jugador, int nivel){
        return sistema_puntuaciones [jugador] [nivel]; 
    }
    public double obtenerPuntuacionMaxima(int jugador){
        double puntuacion_maxima = sistema_puntuaciones [jugador][0];
        
        for (int i = 0; i < max_nivel; i++) {
            if (sistema_puntuaciones[jugador][i] > puntuacion_maxima){
                puntuacion_maxima = sistema_puntuaciones[jugador][i];
            }
            return puntuacion_maxima;
        }
        return -1;
    }
    
    public double obtenerPuntuacionMedia (int jugador){
        double suma = sistema_puntuaciones [jugador] [0];
        
        for (int i = 0; i < max_nivel; i++) {
            suma += sistema_puntuaciones [jugador] [i];
            
        }
        return suma / max_nivel;
    }
    
    public double obtenerNivelMenorPuntuacion(int jugador){
        double minimo = sistema_puntuaciones [jugador] [0];
        
        for (int i = 0; i < max_nivel; i++) {
            if (sistema_puntuaciones [jugador] [i] < minimo){
                minimo = sistema_puntuaciones [jugador] [i];
            }
            return minimo;
        }
        return -1;
    }
    
    public double compararJugadores (int jugador1, int jugador2){
        
        double puntuacion1 = sistema_puntuaciones[jugador1] [0];
        double puntuacion2 = sistema_puntuaciones [jugador2] [0];
        
        for (int i = 0; i < max_nivel; i++) {
            if (sistema_puntuaciones [jugador1] [i] > puntuacion1){
                puntuacion1 = sistema_puntuaciones [jugador1] [i];
            } 
        }
        for (int i = 0; i < max_nivel; i++) {
            if (sistema_puntuaciones [jugador2] [i] > puntuacion2){
                puntuacion2 = sistema_puntuaciones [jugador2] [i];
            }
        }
        if (puntuacion1 > puntuacion2){
            return puntuacion1;
        } else {
            return puntuacion2;
        }
    }
    
    public int getNumeroJugadores(){
        return max_jugador;
    }
    public int getNumeroNiveles(){
        return max_nivel;
    }
    
}
