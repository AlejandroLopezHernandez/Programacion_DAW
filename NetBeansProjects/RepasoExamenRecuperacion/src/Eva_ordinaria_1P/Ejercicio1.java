/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva_ordinaria_1P;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        String [] CausasContaminantes = {"Combustión en la producción y transformación de energía", "Plantas de combustión no industrial",
                                        "Plantas de combustión industrial", "Procesos industriales sin combustión", 
                                        "Extracción y distribución de combustibles fósiles y energía geotérmica", "Transporte por carretera"};
        double [] nivelesSOX = {1.49, 3573.28, 2070.57, 18.78, 0.00, 0.66};
        double [] nivelesNOX = {378.60, 5646.18, 4623.48, 40.68 ,0.00,15.04};
        
        String causa_mas_contaminante_sox = null;
        double nivel_mas_alto_sox = 0.0;
        for (int i = 0; i < nivelesSOX.length; i++) {
            if (nivelesSOX[i]> nivel_mas_alto_sox){
                nivel_mas_alto_sox = nivelesSOX[i];
                causa_mas_contaminante_sox = CausasContaminantes[i];
            }
        }
        
        System.out.println("La causa que genera más Óxido de Azufre(SOX) es: " + causa_mas_contaminante_sox);
        
        double nivel_nox_extraccion = 0.0;
        for (int i = 0; i < nivelesNOX.length; i++) {
            if(CausasContaminantes[i].contains("Extracción y distribución de combustibles fósiles y energía geotérmica")){
                nivel_nox_extraccion = nivelesNOX[i];
            }
        }
        System.out.println("El nivel de Óxido de Nitrógeno(NOX) que produce la Extracción y distribución de combustibles fósiles y energía geotérmica es de: "
                            + nivel_nox_extraccion);
        
        String causa_mas_verde = "";
        double menor_tasa_contaminacion = Double.MAX_VALUE;
        
        for (int i = 0; i < CausasContaminantes.length; i++) {
            double impacto_combinado = nivelesSOX[i] + nivelesNOX[i];
            if (impacto_combinado < menor_tasa_contaminacion){
                menor_tasa_contaminacion = impacto_combinado;
                causa_mas_verde = CausasContaminantes[i];
            }
            
        }
        System.out.println("La causa que produce menos contaminación de ambos agentes es de: " + causa_mas_verde);
        
        System.out.println("La causa entre las dos causas siguientes(Plantas de combustión no industrial y Transporte por carretera), la que contamina más es: "  
                           + compararSOXNOX("Plantas de combustión no industrial","Transporte por carretera",CausasContaminantes,nivelesNOX,nivelesSOX));
    }
    
    public static String compararSOXNOX (String causa1, String causa2, String [] causas_contaminacion, double [] niveles_nox, double [] niveles_sox){
        int indice1 = -1, indice2 = -1;
        
        for (int i = 0; i < causas_contaminacion.length; i++) {
            if (causas_contaminacion[i].equals(causa1)){
                indice1 = i;
            }
        }
        
        for (int i = 0; i < causas_contaminacion.length; i++) {
            if (causas_contaminacion[i].equals(causa2)){
                    indice2 = i;
            }          
}
        double total1 = niveles_sox[indice1] + niveles_nox[indice1];
        double total2 = niveles_sox[indice2] + niveles_nox[indice2];
        
         if (total1 > total2){
            return causa1;
        } else {
            return causa2;
        }  
    }
    
}