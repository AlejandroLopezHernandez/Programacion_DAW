package EjercicioRectángulo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Rectangulo[] rectangulos = new Rectangulo[3];
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < rectangulos.length; i++){
            System.out.println("Do you want to enter the width and the hegiht?(y/n)");
            char choice = reader.nextLine().charAt(0);
            if (choice == 'y'){
            rectangulos[i] = new Rectangulo(reader.nextDouble(), reader.nextDouble());
            } else if (choice == 'n'){
                rectangulos[i] = new Rectangulo();
            } else {
                System.out.println("Respuesta no válida");
                rectangulos[i] = new Rectangulo();
            }
        }
        System.out.println("The rectangles are: ");
        for(int i =0; i < rectangulos.length; i++){
            System.out.println("Rectangle " + (i +1) + rectangulos[i].getWidth() + " width " + rectangulos[i].getHeight() + " height");
        }
        reader.close();
    }

    
}
