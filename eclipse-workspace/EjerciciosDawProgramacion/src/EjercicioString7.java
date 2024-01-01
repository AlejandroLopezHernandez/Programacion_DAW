import java.util.Scanner;
public class EjercicioString7 {
public static void main (String []args) {
	String dni;
	String letras_validas_dni = "TRWAGMYFPDXBNJZSQVHLCKE";
	char ultimo_caracter = dni.charAt(dni.length() -8);
		Scanner reader = new Scanner (System.in);
	System.out.println("Introduce un DNI");
	dni= reader.nextLine();
	if (dni.length ()<9) {
		System.out.println("El DNI no es válido");
	} else if (dni.length()>9) {
		System.out.println("El DNI no es valido");
	}
	else if (dni.length()==9) {
		System.out.println("El DNI es valido");
	}
	
		
}
}
