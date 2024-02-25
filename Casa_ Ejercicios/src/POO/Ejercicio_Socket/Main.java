package POO.Ejercicio_Socket;
/**
 *
 * @author Alejandro Lopez
 */
public class Main {
    public static void main(String[] args) {
       Socket escaner = new Socket (1, 64000, "localhost");
       escaner.escanear();
    }
}


