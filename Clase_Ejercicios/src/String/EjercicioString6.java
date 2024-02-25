import java.util.Scanner;

public class EjercicioString6 {
    public static void main(String[] args) {
        // Definir la contraseña almacenada
        String password_almacenada = "contrasena123";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la contraseña
        System.out.print("Introduce la contraseña: ");
        String contraseñaIntroducida = scanner.nextLine();

        // Comprobar si la contraseña introducida coincide con la almacenada
        if (contraseñaIntroducida.equals(password_almacenada)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
