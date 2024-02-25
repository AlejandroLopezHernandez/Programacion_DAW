package Bucles;

public class Encontrar_max_num {
    public static void main(String[] args) {
        int [] numeros = {2, 500, 50, 8, 9, 100};
        int max_num = 0;
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (max_num < numeros[i]){
                max_num = numeros[i];
                posicion = i;
            }
        }

        System.out.println("El número de mayor valor es "+ max_num + " en la posición " + (posicion + 1 )+ " del array");
    }
}
