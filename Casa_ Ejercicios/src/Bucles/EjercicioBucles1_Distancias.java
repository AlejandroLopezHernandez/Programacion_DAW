package Bucles; 

/*
*@author DAW1: Alejandro Lopez - IES El cañaveral
*Fecha: 04 Dec 2023
*/
public class EjercicioBucles1_Distancias {
public static void main(String[]args) {
	double [] distancias = {50, 60, 20,15, 10,5,80, 65, 20, 34, 23, 34, 43};
	double eficiencia = 5;
	double coste_gasolina_litro = 1.5;
	double coste_desplazamiento = 0;
	int posicion =0;
	double coste_total = 0;
	for (int i =0; i< distancias.length;i++){
		coste_desplazamiento = ((distancias[i]/100)*eficiencia*coste_gasolina_litro);
		posicion=i;
		coste_total += coste_desplazamiento;
		System.out.println("El coste del desplazamiento "+ (posicion+1) +" es de "+ coste_desplazamiento + " €");
		System.out.println("El coste total de todos los desplazamientos en coche es de " + coste_total);
	}
}
}
