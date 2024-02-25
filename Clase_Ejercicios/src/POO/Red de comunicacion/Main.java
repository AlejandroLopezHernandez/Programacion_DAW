package Red_comunicacion;

/**
 *
 * @author Alejandro Lopez
 */
public class Main {
    public static void main(String[] args) {
        Red_comunicacion rc = new Red_comunicacion (5);
        rc.mandar_mensaje(0, 1);
        rc.mandar_mensaje(1, 2);
        rc.mandar_mensaje(0, 3);
        rc.mandar_mensaje(0, 4);
        rc.mandar_mensaje(2, 3);
        rc.imprimir_matriz();
    }
}

