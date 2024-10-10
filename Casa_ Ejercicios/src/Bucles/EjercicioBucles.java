package Bucles;

public class EjercicioBucles {
    public static void main(String[] args) {
        int [] numeros = { 10,20, 30, 40, 50, 60, 70, 80};
        int mayor = 0;
    
        for(int i = 0; i < numeros.length; i++){
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }
        } 
        System.out.println(mayor);
    }
    
}
