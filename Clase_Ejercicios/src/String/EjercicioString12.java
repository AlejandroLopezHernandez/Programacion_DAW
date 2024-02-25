import java.util.Scanner;
public class EjercicioString12 {
public static void main (String []args) {
    //String url_entrada = "http://dominio:80/path?parametro=valor";
	//String url_valida = "https://www.ies.elcanaveral:443/AppReservaPlaza?p=ordinaria";
	boolean url_parametros;
	String url;
	
	Scanner reader = new Scanner (System.in);
	
	System.out.println("Introduce una URL para saber si es correcta:");
	url = reader.nextLine();
	url_parametros = url.startsWith("https");
	
	if (url_parametros) {
		System.out.println("La conexion es segura");	
	} else {
		System.out.println("La conexion no es segura");
	}
	
	url_parametros = url.contains("?");
	
	if (url_parametros) {
		System.out.println("La solicitud lleva parametros");
	} else {
		System.out.println("La solicitud no lleva parametros");
	}
	
	if (url.length() < 250) {
		System.out.println("La direccion web tiene una longitud correcta");
	} else {
		System.out.println("ERROR, longitud maxima de solicitud superada ");
	}

	if (url.contains(":443")) {
		System.out.println("Puerto destino conocido");
	} else {
		System.out.println("ERROR: Puerto destino desconocido");
	}
	
	}
}