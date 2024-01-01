import java.util.Scanner;
import java.util.StringTokenizer;
public class EjercicioString10 {
public static void main (String []args) {
	String texto_a_analizar;
	
	System.out.println("Introduce el texto de un post en una red social:");
	Scanner reader = new Scanner (System.in);
	texto_a_analizar = reader.nextLine();
	if (texto_a_analizar.length()>151) {
		System.out.println("El texto a analizar es demasiado largo. Es mejor acortar el post");
		
	}
	else if (texto_a_analizar.length()<150) {
		System.out.println("El texto en mayúsculas es: " + texto_a_analizar.toUpperCase());
	}
	if (texto_a_analizar.length()<150) {
		System.out.println("El texto en minúsculas es: " + texto_a_analizar.toLowerCase());
	}
	StringTokenizer tokenizer = new StringTokenizer(texto_a_analizar);
	int palabras = tokenizer.countTokens();
	if (palabras >30) {
		System.out.println("Son demasiadas palabras");
	}
	else if (palabras <30) {
		System.out.println("La cantidad de palabras es: " + palabras);
	}
System.out.println("Busca una palabra clave:");
	String palabra_clave;
	palabra_clave = reader.nextLine();
	
	if (texto_a_analizar.contains(palabra_clave)) {
		System.out.print("La palabra clave es: "+ palabra_clave);
	}
	else {
		System.out.println("La palabra clave no ha podido encontrarse");
	}
}
}
