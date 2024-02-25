package Red_comunicacion;

import java.util.Arrays;

/**
 *
 * @author Alejandro Lopez
 */
public class Red_comunicacion {
 private int [][] matriz_adyacente = new int [6][6];
 private int tamaño;
 public Red_comunicacion(int tamaño){
     matriz_adyacente = new int [tamaño] [tamaño];
 }
   
   public void mandar_mensaje (int alumno1, int alumno2){
        matriz_adyacente [alumno1][alumno2] +=1;
    }
   public int persona_mas_conectada (int alumno){
       int pos_alumno_contacto =0;
       int valor_max = 0;
       int [] array_contactos = new int [matriz_adyacente.length];
       int alumno_mas_contactado = 0;
       array_contactos = matriz_adyacente[alumno];
       valor_max = Arrays.stream(array_contactos).max().getAsInt();
       for (int i = 0; i < array_contactos.length; i++) {
          if (array_contactos[i] > alumno_mas_contactado){
              alumno_mas_contactado = array_contactos[i];
          }
       }
       
       for (int i = 0; i < matriz_adyacente.length; i++) {
           if (array_contactos[i]== valor_max){
               pos_alumno_contacto = i;
           }
       }
       return pos_alumno_contacto;
   }
   public void imprimir_matriz (){
       for (int i = 0; i < matriz_adyacente.length; i++) {
       for (int j = 0; j < matriz_adyacente.length; j++) {
           System.out.print(matriz_adyacente[i][j]);
       }
           System.out.println("");
   }
}
}
