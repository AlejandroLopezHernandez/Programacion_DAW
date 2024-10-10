/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main_Matrices {
    public static void main(String[] args) {
        Sistema_Puntuacion matriz_adyacente = new Sistema_Puntuacion (3,3);
        
        matriz_adyacente.insertar_puntuacion(0, 0, 5);
        matriz_adyacente.insertar_puntuacion(0, 1, 10);
        matriz_adyacente.insertar_puntuacion(0, 2, 8);
        
        matriz_adyacente.insertar_puntuacion(1, 0, 6);
        matriz_adyacente.insertar_puntuacion(1, 1, 20);
        matriz_adyacente.insertar_puntuacion(1, 2, 19);
        
        matriz_adyacente.insertar_puntuacion(2, 0, 14);
        matriz_adyacente.insertar_puntuacion(2, 1, 11);
        matriz_adyacente.insertar_puntuacion(2, 2, 9);
        
       matriz_adyacente.ver_puntuacion(1, 2);
       
       matriz_adyacente.obtener_puntuacion_total(2);
       
       matriz_adyacente.mostrar_tabla_puntuaciones();
        
    }
}
