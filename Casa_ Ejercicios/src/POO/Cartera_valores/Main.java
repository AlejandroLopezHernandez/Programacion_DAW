package POO.Cartera_valores;

public class Main {
    public static void main(String [] args){
        Cartera carteria = new Cartera (3, 5);
        Accion a1 = new Accion("Iberdrola", 50, 75);
        Accion a2 = new Accion("Repsol", 60, 85);
        Accion a3 = new Accion("BBVA", 70, 95);

        carteria.comprar_accion(a1);
        carteria.comprar_accion(a2);
        carteria.comprar_accion(a3);
        
        System.out.print(carteria.balance_cartera());
    }
}
