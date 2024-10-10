/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MatrizAdyacente {
    private int matriz [] [];
    int filas;
    int columnas;
    
    public MatrizAdyacente(int filas, int columnas){
        matriz = new int [filas] [columnas];
        this.filas = filas;
        this.columnas = columnas;
        
    }
    
    public void insertar(int filas, int columnas, int numero){
        matriz [filas] [columnas] = numero;
    }
    
    public int devolver(int filas, int columnas){
        return matriz [filas] [columnas];
    }
    
    public int devoler_maximo(int filas){
        int max = 0;
        for (int i = 0; i < matriz.length; i++) {
            if(max > matriz[filas][i]){
                max = matriz[filas][i];
            }      
        }
        return max;
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);  
            }
            System.out.println("");
        }
        //System.out.println("");
    }
}
