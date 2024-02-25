package refuerzo;


import java.util.Scanner;

/**
 * TestProgramaE4 
 * Representa una clase que calcula el perímetro de un círculo
 * Este ejercicio es similar al de sumar solo que ahora utilizaremos un dato constante PI
 * Actividad de refuerzo
 * - Añade al programa el cáculo del area de círculo  con la fórmula area= PI*radio*radio e imprimela por consola
 * @author 
 
 */
public class TestProgramaE4 {
    
     public static void main(String[] args) {
        // Antes de nada declaramos las variables que necesitamos
        // Rceuerda que necesitamos especificar su tipo, en este caso las declararemos reales de precisión doble (o double)
        
        double radio=0.0; //esta variable es para guardar el radio y además la inicializamos
        double perimetro=0.0;//esta variable es para guardar el perímetro
        final double PI=3.14;//PI es una constante y ponemos final
        
        //1.- declaramos el scanner porque necesitamos ller por teclado
        Scanner reader = new Scanner(System.in);
        
        //2.- Imprimir el mensaje que el usuario verá en la pantalla
        System.out.println(" Introduce valor de radio:");
        
        //3.- leemos por teclado el valor del radio
        radio = reader.nextDouble(); //usamos reader.nextDouble(); por que es un número decimal
       
        // 4.-calculamos el perímetro
        perimetro = 2*PI* radio;
        
        // 5.- Imprimimos el resultado por la consola 
        System.out.println("El valor del perimetro es "
                            +perimetro);
         
    }
    
}
