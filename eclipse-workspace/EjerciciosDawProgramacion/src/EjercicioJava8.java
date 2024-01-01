import java.util.Scanner;
public class EjercicioJava8 {
public static void main (String []args) {
	String direccion_ip;
	String host;
	int indice_ultima_aparicion;
	int cadena_principal;
	Scanner reader= new Scanner (System.in);
	System.out.println("Introduce una direccion IP");
	direccion_ip = reader.nextLine();
	cadena_principal = direccion_ip.lastIndexOf(".");
	host = direccion_ip.substring(cadena_principal + 1);
	indice_ultima_aparicion = Integer.parseInt(host);
	
	if (indice_ultima_aparicion <=255 && indice_ultima_aparicion >=0) {
		System.out.println("La direccioón del host es " + indice_ultima_aparicion);
	}
	else if (indice_ultima_aparicion >=255 && indice_ultima_aparicion >=0){
		System.out.println("La direccion del host "+ indice_ultima_aparicion + " no es valida");
	}
}
}
