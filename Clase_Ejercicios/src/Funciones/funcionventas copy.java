package Funciones;

public class EjercicioFunciones3 {
    //Declaramos la clase principal, es decir, el programa principal
    public static void main (String[]args){
        //Declaramos las variables del problema
        double [] ventas = {1500, 2000, 500 , 120, 1700, 900, 700};
        int dia_max_ventas = 0;
        int dia_min_ventas = 0;
        double suma_ventas = 0;
        //Asignamos las variables a las funciones creadas, es decir, al nombre de las mismas
        dia_max_ventas = obtener_ventas_max(ventas);
        dia_min_ventas = obtener_ventas_min(ventas);
        suma_ventas = obtener_suma_ventas(ventas);
        //Imprimos el informe por pantalla, le sumamos 1 a los días, ya que el ordenador cuenta a partir de 0
                System.out.println("-------------INFORME DE VENTAS-------------");
                System.out.println("El día con más ventas es " + (dia_max_ventas+1));
                System.out.println ("El día con menos ventas es " + (dia_min_ventas+1));
                System.out.println("La suma total de ventas es de " + suma_ventas);
    }//Declaramos la primera funcion, va a ser un INTEGER, la tenemos que asignar al Array en cuestión, el de las ventas
    public static int obtener_ventas_max ( double [] ventas){
        //Declaramos las variables de la función, hay que crear un INTEGER y un DOUBLE que almacene las ventas máximas
        int dia_mas_ventas = 0;
        double max_venta = ventas[0];
        for (int i = 0; i < ventas.length; i ++){ //Hacemos un bucle for para recorrer el Array, previamente hemos indicado a la función que íbamos a usar el Array de ventas
            if (ventas[i] > max_venta){ //Comparamos con un if el Array de las ventas con el DOUBLE que habíamos creado, usamos el mayor
            max_venta = ventas[i]; //Asignamos el Array que habíamos creado al Array de ventas
            dia_mas_ventas = i; //Asignamos la posición con un i
        }
        }
        return dia_mas_ventas; //Usamos la función return para devolver el resultado de nuestra función
    }//Vamos ahora con la segunda función, para calcular el mínimo 
    public static int obtener_ventas_min (double [] ventas){ //Asignamos un INTEGER y nos referimos al Array de las ventas
        int dia_minos_ventas = 0; //Asignamos las variables del problema
        double min_venta = ventas[0]; //Asignamos esta variable con el Array
        for (int i = 0; i < ventas.length; i ++){ //Iniciamos un bucle for 
            if (ventas[i]< min_venta){ //Comparamos con un if el Array de las ventas con el DOUBLE que habíamos creado, ahora usamos el menor
                min_venta = ventas[i]; //Asignamos nuestro DOUBLE con el Array de las ventas
                dia_minos_ventas =i; //Asignamos la posición del Array usando i
            }
        }
        return dia_minos_ventas; //Usamos la función return para devolver el resultado al programa principal
    }
    public static double obtener_suma_ventas (double [] ventas){ //Declaramos la última función para para calcular la suma
    double suma_total_ventas = 0; //Declaramos la variable con un DOUBLE
    for (int i = 0; i< ventas.length; i ++){ //Iniciamos el bucle for 
        suma_total_ventas += ventas[i]; //Usamos esta fórmula para calcular la suma, es equivalente a usar (suma_total_ventas = suma_ total_ ventas +ventas [i])
    }
    return suma_total_ventas; //Devolvemos el resultado usamdo un return al programa principal
    }   
}


