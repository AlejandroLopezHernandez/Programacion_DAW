package String; 
import java.util.Scanner;
/*
*@author DAW1: Alejandro Lopez - IES El cañaveral
*Fecha: 04 Dec 2023
*/
public class Ejercicio2_DNI {
public static void main (String[]args) {
	System.out.println("Introduce un DNI por pantalla");
	Scanner reader = new Scanner(System.in);
	String letras_validas_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	String DNI_Introducido = "";
	DNI_Introducido = reader.nextLine();
	
	
	char ultimo_caracter = DNI_Introducido.charAt(DNI_Introducido.length ()-1);
	String ultima_letra_cadena = String.valueOf(ultimo_caracter);
	boolean es_valido = letras_validas_DNI.contains(ultima_letra_cadena);
	if (DNI_Introducido.length() !=9 && !es_valido) {
		System.out.println("El número de DNI no es válido");
	}else if (DNI_Introducido.contains(letras_validas_DNI)){
		System.out.println("El número de DNI es válido");	
	}else {
		System.out.println("El DNI es válido");
	}
	reader.close();
}
}

