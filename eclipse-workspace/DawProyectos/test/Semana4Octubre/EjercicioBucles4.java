/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4Octubre;

/**
 *
 * @author Alejandro Lopez
 */

public interface EjercicioBucles4 {
    public static void main(String[]args){
    double coste_de_gasolina = 1.6;
    double eficiencia=5.0;
    double coste_parcial=0;
    double coste_total=0;
    double [] distancia_recorrida = {20,10,15,50,40,5,12,30,35,25,8,23,45,60,52};
    for (int i=0; i<distancia_recorrida.length; i++){
        coste_parcial =(distancia_recorrida[i]/100)*eficiencia*coste_de_gasolina;
   coste_total += coste_parcial;
 
   }
    System.out.println("El coste total es "+ coste_total);  
}
}