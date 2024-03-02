package POO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Lopez
 */
public class Sistema_Puntuacion {
    
        private int [][] matriz_puntuaciones;
        private int maxJugadores = 0;
        private int maxPruebas = 0;

    //Método constructor
    public Sistema_Puntuacion(int maxJugadores,int maxPruebas) {
        //La matriz se tiene que declarar en el método constructor
        this.matriz_puntuaciones = new int [maxJugadores][maxPruebas];
        this.maxPruebas= maxPruebas;
        this.maxJugadores = maxJugadores;
    }
    //Procedimiento para insertar datos en una matriz
    public void Insertar_Puntuacion(int jugador, int prueba, int puntuaciones){
       matriz_puntuaciones[jugador][prueba] = puntuaciones;
    }
    //Función para ver la puntuacion de un jugador determinado,fila(jugador) y después columna(prueba)
    public int ver_Puntuacion(int jugador, int prueba){
        return matriz_puntuaciones[jugador][prueba];
    }
    //Para imprimir la matriz entera, hay que hacer dos bucles for
    
    public void mostrar_Tabla_Puntuaciones(){
        for (int i = 0; i < this.maxJugadores; i++) {
            System.out.print(" Jugador " + i);
            System.out.print(" : ");
            for (int j = 0; j < this.maxPruebas; j++) {
                System.out.print(matriz_puntuaciones[i][j]); //Así imprimos las filas y las columnas
            }
            System.out.println();
        }
    }
    //Función para obtejer la puntuación total de un determinado jugador, sólo de un jugador
    //y todas sus puntuaciones
    public int obtener_Puntuacion_Total (int jugador){
        //Primera manera de hacerlo
        //Declaramos un Array que sea la fila entera de la matriz, y luego la procesamos con un bucle for
        int [] array_puntuaciones = matriz_puntuaciones[jugador];
        int acumulador = 0;
        for (int i = 0; i < array_puntuaciones.length; i++) {
            acumulador = acumulador + array_puntuaciones[i];
        }
        return acumulador;
        
        //Segunda manera de hacerlo, recorriendo la matriz dentro del bucle for 
        /*int acumulador = 0;
        for (int i = 0; i < matriz_puntuaciones[jugador].length; i++) {
            acumulador = acumulador + matriz_puntuaciones[jugador][i];
        return acumulador;*/
        
    }
    
    //Las matrices se declaran en el método Main como si fuera un objeto
    public static void main(String[] args) {
        
        Sistema_Puntuacion puntuaciones = new Sistema_Puntuacion (3,3);
        
    }
}

