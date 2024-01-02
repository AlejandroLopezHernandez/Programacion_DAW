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
public class EjercicioBucles4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double []ventas = {600.0, 450.0, 550.0, 900.0, 400.0, 800.0, 650.0};
        double valor_maximo= ventas [0];
        double valor_minimo= ventas [0];
        double acumulador = 0.0;
        double media = 0.0;
        int dia_maximo =0+1;
        int dia_minimo =0+1;
        for (int i=0; i< ventas.length; i++){ 
        if (ventas[i]>valor_maximo){
            valor_maximo= ventas[i];
            valor_maximo++;
            dia_maximo=i;
        } if (ventas[i]<valor_minimo){
            valor_minimo=ventas[i];
            //Formúla para calcular la posición dentro de un array
            valor_minimo++;
            dia_minimo=i;
        }
        //Formúla para acumular un número
        acumulador = acumulador + ventas[i];
        media = acumulador/ventas[i];
        }
        System.out.println("INFORME DE VENTAS SEMANALES");
        System.out.println("Se ha obtenido una suma de ventas de " + acumulador);
        System.out.println("Se ha obtenido un promedio de ventas de "+ media);
        System.out.println("El dia con mayor volumen de ventas es "+ dia_maximo + " con un numero de ventas de " +valor_maximo);
        System.out.println("El dia con menor volumen de ventas es "+ dia_minimo + " con un numero de ventas de "+ valor_minimo);
}
}
