/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioFuncionesInversiones {
    public static void main (String []args){
        String [] Tipo_de_Inversion = {"banca", "inmobiliaria", "cripto", "tecnología"};
        double [] Rendimiento_Inversiones = {0.25, 0.3, 0.8, 0.4};
        double [] Volatibilidad_Inversiones = {0.1, 0.2, 0.7, 0.3};
        double [] Resultado_de_Riesgo = new double [Rendimiento_Inversiones.length];
        Resultado_de_Riesgo = Calcular_Riesgo_Inversiones(Rendimiento_Inversiones, Volatibilidad_Inversiones);
        for(int i =0;i < Resultado_de_Riesgo.length; i++){
        System.out.println("El resultado del riesgo de la inversion es " + Resultado_de_Riesgo[i]);
        }
        int posicion_menor_riesgo = 0;
        System.out.println("Inversion de menor riesgo: ");
        posicion_menor_riesgo = Encontrar_Inversion_Menor_Riesgo(Resultado_de_Riesgo);
        System.out.println("La inversion de menor riesgo seria " + posicion_menor_riesgo);
        
    }
    public static double [] Calcular_Riesgo_Inversiones (double [] Rendimientos, double [] Volatibilidades){
        double [] Riesgo_de_Inversion = new double [Rendimientos.length];
        for (int i = 0; i < Rendimientos.length; i++){
            Riesgo_de_Inversion[i] = Rendimientos[i]* Volatibilidades[i];
        }
        return Riesgo_de_Inversion;
    }
    public static int Encontrar_Inversion_Menor_Riesgo (double [] Riesgo_de_Inversiones){
        double  menor_riesgo = Riesgo_de_Inversiones[0];
        int indicador_menor_riesgo = 0;
        for (int i = 0; i < Riesgo_de_Inversiones.length; i++) {
            if(indicador_menor_riesgo < menor_riesgo){
            menor_riesgo = Riesgo_de_Inversiones[i];
            indicador_menor_riesgo = i;
            }
        } return indicador_menor_riesgo;
   }
}

