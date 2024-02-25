package Funciones;

public class EjercicioFunciones9 {
    public static void main(String[] args) {
        String [] tipos_de_inversion = {"banca","inmobiliaria","tecnología","cripto","bolsa"};
        double [] rendimiento_inversiones = {0.06,0.08,0.1,0.70,0.09};
        double [] volatilidad_inversiones = {0.02,0.15, 0.06, 0.8, 0.3};

        double [] riesgo_inversiones = calcular_riesgo_inversion(rendimiento_inversiones, volatilidad_inversiones);
        int inversion_recomendada = encontrar_inversion_menor_riesgo(riesgo_inversiones);
        System.out.println("La inversión de menor riesgo es " + tipos_de_inversion[inversion_recomendada]);
    }
    public static double [] calcular_riesgo_inversion (double [] rendimientos, double [] volatilidades){

        double[] riesgo_inversion = new double[rendimientos.length];
        for (int i = 0; i < rendimientos.length; i++) {
            riesgo_inversion[i] = rendimientos[i] * volatilidades[i];
        }
        return riesgo_inversion;
    }
    public static int encontrar_inversion_menor_riesgo (double [] riesgos){
        int indice_menor_riesgo=0;
        double inversion_menor_riesgo = riesgos[0];
        for (int i = 0; i < riesgos.length; i++) {
        if (riesgos[i] < inversion_menor_riesgo){
            inversion_menor_riesgo = riesgos[i];
            indice_menor_riesgo =i;
        }    
        }
        return indice_menor_riesgo;
    }
}
