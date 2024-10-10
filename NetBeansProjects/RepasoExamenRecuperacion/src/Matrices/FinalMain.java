/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class FinalMain {
    public static void main(String[] args) {
        MatrizAdyacente matriz = new MatrizAdyacente(3,3);
        
        matriz.insertar(0, 0, 1);
        matriz.insertar(0, 1, 2);
        matriz.insertar(0, 2, 4);
        
        matriz.insertar(1, 0, 4);
        matriz.insertar(1, 1, 8);
        matriz.insertar(1, 2, 2);
        
        matriz.insertar(2, 0, 5);
        matriz.insertar(2, 1, 8);
        matriz.insertar(2, 2, 19);
        
        System.out.println(matriz.devolver(1, 2));
        matriz.imprimirMatriz();
    }
}
