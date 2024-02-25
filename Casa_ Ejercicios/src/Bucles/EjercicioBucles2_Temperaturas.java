package RepasoBucles; 

/*
*@author DAW1: Alejandro Lopez - IES El cañaveral
*Fecha: 04 Dec 2023
*/
public class EjercicioBucles2_Temperaturas {
public static void main (String[]args) {
	double [] temperaturas = {10, 15, 20, 5 , 7 ,22, 12};
	double umbral = 15.00;
	double dias_mas_temp = 0;
	for (int i =0; i < temperaturas.length;i++) {
		if (temperaturas[i] >= umbral) {
			dias_mas_temp ++;
		}
	}
	System.out.println("El número de días que la temperatura superó el umbral de 15 grados es de " + dias_mas_temp);
}
}

