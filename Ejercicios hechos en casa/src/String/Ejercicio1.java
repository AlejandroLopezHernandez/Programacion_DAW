package String; 
import java.util.Scanner;
/*
*@author DAW1: Alejandro Lopez - IES El cañaveral
*Fecha: 04 Dec 2023
*/
public class Ejercicio1 {
public static void main(String[]args) {
	String password_almacenada ="1DAW#";
	Scanner reader = new Scanner(System.in);
	System.out.println("Introduce la contraseña");
	String resultado = reader.nextLine();
	if (resultado.equals(password_almacenada)) {
		System.out.println("La contraseña es correcta");
	}
	else {
		System.out.println("Contraseña incorrecta");
	}
}
}

