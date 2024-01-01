import java.util.Scanner;
public class EjercicioString11 {
public static void  main (String []args) {
	System.out.println("Introduce una palabra de 4 caracteres");
	Scanner reader1 = new Scanner (System.in);
	String hoja = reader1.nextLine();
	StringBuilder  palabra_encriptada = new StringBuilder ();
	char caracterOriginal1 = hoja.charAt(0);
	char caracterEncriptado1 = (char) (caracterOriginal1+2);
	char caracterOriginal2 = hoja.charAt(1);
	char caracterEncriptado2 = (char) (caracterOriginal2+2);
	char caracterOriginal3 = hoja.charAt(2);
	char caracterEncriptado3 = (char) (caracterOriginal3+2);
	char caracterOriginal4 = hoja.charAt(3);
	char caracterEncriptado4 = (char) (caracterOriginal4+2);
	palabra_encriptada.append(caracterEncriptado1);
	palabra_encriptada.append(caracterEncriptado2);
	palabra_encriptada.append(caracterEncriptado3);
	palabra_encriptada.append(caracterEncriptado4);
	hoja= reader1.nextLine();
System.out.println("La palabra encriptada es: "+palabra_encriptada);
//Ahora vamos a desencriptar una palabra
System.out.println("Introduce una palabra encriptada");
Scanner reader2 = new Scanner(System.in);
StringBuilder  palabra_desencriptada = new StringBuilder ();

char caracterEncriptado5 = palabra_encriptada.charAt(0);
char caracterDesencriptado1 = (char) (caracterEncriptado5-2);
char caracterEncriptado6 = palabra_encriptada.charAt(1);
char caracterDesencriptado2 = (char) (caracterEncriptado6-2);
char caracterEncriptado7 = palabra_encriptada.charAt(2);
char caracterDesencriptado3 = (char) (caracterEncriptado7-2);
char caracterEncriptado8 = palabra_encriptada.charAt(3);
char caracterDesencriptado4 = (char) (caracterEncriptado8-2);

palabra_desencriptada.append(caracterDesencriptado1);
palabra_desencriptada.append(caracterDesencriptado2);
palabra_desencriptada.append(caracterDesencriptado3);
palabra_desencriptada.append(caracterDesencriptado4);
hoja = reader2.nextLine();
System.out.println("La palabra desencriptada es: "+ palabra_desencriptada);
reader2.close();
}

}