/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Sistema_Puntuacion {
    private int [][] matriz_puntuaciones;
    private int num_jugadores;
    private int num_pruebas;
    
    public Sistema_Puntuacion (int num_jugadores, int num_pruebas){
        this.matriz_puntuaciones = new int [num_jugadores][num_pruebas];
        this.num_jugadores = num_jugadores;
        this.num_pruebas = num_pruebas;
    }
    
    public void insertar_puntuacion(int jugador, int prueba, int puntuacion){
        matriz_puntuaciones [jugador] [prueba] = puntuacion;
    }
    public int ver_puntuacion(int jugador, int prueba){
        return matriz_puntuaciones [jugador] [prueba];
    }
    
    public int obtener_puntuacion_mas_alta (int jugador){
        int maximo = matriz_puntuaciones[jugador] [0];
        
        for (int i = 0; i < matriz_puntuaciones.length; i++) {
            if(matriz_puntuaciones [jugador] [i] > maximo){
               maximo = matriz_puntuaciones [jugador] [i];
            }
        }
        return maximo;  
    }
    
     public int obtener_puntuacion_total (int jugador){
        int contador = 0;
        
        for (int i = 0; i < matriz_puntuaciones.length; i++) {
               contador += matriz_puntuaciones [jugador] [i];
            
        }
        return contador;
     }
    public void mostrarTablaPuntuaciones(){
        for (int i = 0; i < matriz_puntuaciones.length; i++) {
            System.out.println("Jugador: " + i + ": " );
            for (int j = 0; j < matriz_puntuaciones[i].length; j++) {
                System.out.print(matriz_puntuaciones[i][j] + " ");
            }  
            System.out.println();
        } 
        
    }
    
    
    public static void main(String[] args) {
        
        Sistema_Puntuacion matriz = new Sistema_Puntuacion(3,3);
        
        matriz.insertar_puntuacion(0, 0, 5);
        matriz.insertar_puntuacion(0, 1, 5);
        matriz.insertar_puntuacion(0, 2, 5);
        
        matriz.insertar_puntuacion(1, 0, 1);
        matriz.insertar_puntuacion(1, 1, 1);
        matriz.insertar_puntuacion(1, 2, 1);
        
        matriz.insertar_puntuacion(2, 0, 3);
        matriz.insertar_puntuacion(2, 1, 2);
        matriz.insertar_puntuacion(2, 2, 1);
        
        System.out.println( matriz.obtener_puntuacion_mas_alta(2));
        
        System.out.println(matriz.obtener_puntuacion_total(0));
        //matriz.obtener_puntuacion_total(1)
        
        matriz.mostrarTablaPuntuaciones();
        
        
        
    }
    
}
