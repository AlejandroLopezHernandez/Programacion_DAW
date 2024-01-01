package Bucles;

public class Ejerciciosbucles1 {
public static void main (String[]args) {
	int suma=0;
	for (int i=2;i <=100;i++) {
		if ((i%2)==0)
		suma +=i;
	}
		System.out.println(suma);
	int suma2=0;
	int x=1;
	while (x<=100) {
		if (x%2==0)
			suma2+=1;
		x+=2;
	}
	System.out.println(suma2);
}
}
