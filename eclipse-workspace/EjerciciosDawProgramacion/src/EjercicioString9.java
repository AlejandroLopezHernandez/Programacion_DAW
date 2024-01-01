import java.util.Scanner;
public class EjercicioString9 {
public static void main (String []args){
	String cadena_adn;
	String patron_adn;
	char  primer_caracter;
	char segundo_caracter;
	boolean patron_existe;
	Scanner reader = new Scanner (System.in);
	System.out.println("Cadena ADN de entrada");
	cadena_adn = reader.nextLine();
	boolean condicion_primer_caracter =  cadena_adn.charAt(0)== 'T'|| cadena_adn.charAt(0) == 'G'|| cadena_adn.charAt(0) == 'C'|| cadena_adn.charAt(0) == 'A';
	boolean condicion_segundo_caracter = cadena_adn.charAt(1)== 'T'|| cadena_adn.charAt(1) == 'G'|| cadena_adn.charAt(1) == 'C'|| cadena_adn.charAt(1) == 'A';
	
if (condicion_primer_caracter  && condicion_segundo_caracter) {
	System.out.println("El patron esta en la cadena de ADN");
}
else if (!condicion_primer_caracter && !condicion_segundo_caracter){
	System.out.println("El patron no esta en la cadena de ADN");
}

System.out.println("Introduzca el patron de ADN a buscar");
patron_adn = reader.nextLine();
patron_existe = cadena_adn.contains(patron_adn);
if (condicion_primer_caracter && condicion_segundo_caracter == patron_existe) {
	System.out.println("El patron de busqueda esta en la cadena");
}
else if (!condicion_primer_caracter || !condicion_segundo_caracter == patron_existe) {
	System.out.println("El patron de busqueda no esta en la cadena");
}

}
	}

