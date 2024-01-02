/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5Octubre;

/**
 *
 * @author Alejandro Lopez
 */
public class EjerciciosBucles3 {

    public static void main(String[] args) {
        double[] temperaturas = {15.5, 20.6, 26.8, 30.6, 23.5, 19.2, 27.2};
        double umbral = 25.0;
        int numero_de_dias = 0;
        for (int i = 0; i < temperaturas.length; i++) 
            if (temperaturas[i] > umbral) {
                numero_de_dias++;
            }
            System.out.println("El numero de dias con temperaturas superiores a 25 grados es "+ numero_de_dias);
        
    }
}
