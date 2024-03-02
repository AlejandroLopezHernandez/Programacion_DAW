package POO.Abstracción_Geometría;

/**
 *
 * @author Alejandro Lopez
 */

public class Main {
    public static void main(String[] args) {
        
        //Voy a trabajar con las subclases
        
        Cuadrado c = new Cuadrado(10,1,1);
        Cuadrado c1 = new Cuadrado(5,2,2);
        Rombo r = new Rombo(2,4, 0, 0);
        Rombo r2 = new Rombo(6,8, 3, 3);
        
        Figura [] coleccion_figuras = new Figura [3];
        coleccion_figuras[0]=c;
        coleccion_figuras[1]=c1;
        coleccion_figuras[2]=r;
        
        for(Figura f:coleccion_figuras){
            System.out.println(f.calcularArea());
        }
        System.out.println(" Área del cuadrada: " + c.calcularArea());
        System.out.println(" Área del rombo: " + r.calcularArea());
        Figura f= c;
        System.out.println(f.calcularArea());
        f=r;
        System.out.println(f.calcularArea());

    }
}

