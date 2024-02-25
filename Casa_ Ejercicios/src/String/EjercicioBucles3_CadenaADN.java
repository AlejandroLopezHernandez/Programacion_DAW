package String; 
import java.util.Scanner;
/*
*@author DAW1: Alejandro Lopez - IES El cañaveral
*Fecha: 04 Dec 2023
*/
public class EjercicioBucles3_CadenaADN {
public static void main (String[]args) {
	String [] cadenas_ADN = {"ATGCTAGCATGAC","TAGCGCGATCGTA","ACGTAGTACGTGTAG"};
	
	for (int i =0; i< cadenas_ADN.length;i++) {
	System.out.println("Las cadenas almacenadas son " + cadenas_ADN[i]);
	}
	System.out.println("Introduce un patrón de ADN a buscar");
	Scanner reader = new Scanner(System.in);
	String entrada_teclado = reader.nextLine();
	for (int i =0; i< cadenas_ADN.length; i++) {
		if (cadenas_ADN[i].contains(entrada_teclado)) {
			
		}
	}
}
}

