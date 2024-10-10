/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraEvaluacion;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
       String[] nombresAlumnos = {"Juan", "María", "Carlos", "Beatriz", "Pedro"}; 
       double[] notasProgramacion = {5.5, 7.0, 5.5, 9.0, 3.5}; 
       double[] notasEntornos = {4.0, 4.5, 8.0, 5.0, 7.5}; 
       double[] notasSistemasInformaticos = {5.0, 8.0, 7.5, 6.5, 9.0};
       
        System.out.println("------------------------------------------------------------------");
        System.out.println("El alumno que tiene la nota más alta en programación es: " + obtener_alumno_nota_mas_alta_programacion(notasProgramacion,nombresAlumnos));
        System.out.println("El alumno que tiene la nota más alta en sistemas es: " + obtener_alumno_nota_mas_alta_sistemas(notasSistemasInformaticos,nombresAlumnos));
        System.out.println("El alumno que tiene la nota más alta en entornos es: " + obtener_alumno_nota_mas_alta_entornos(notasEntornos,nombresAlumnos));
        System.out.println("------------------------------------------------------------------");
        System.out.println("El alumno que ha obtenido la nota más baja en programacion es " + obtener_alumno_nota_mas_baja_programacion(notasProgramacion,nombresAlumnos));
        System.out.println("El alumno que tiene la nota más baaja en sistemas es: " + obtener_alumno_nota_mas_baja_sistemas(notasSistemasInformaticos,nombresAlumnos));
        System.out.println("El alumno que tiene la nota más baja en entornos es: " + obtener_alumno_nota_mas_baja_entornos(notasEntornos,nombresAlumnos));
        System.out.println("------------------------------------------------------------------");
        
        
        int mas_media = 0;
        double suma_programacion = 0;
        double media = 0.0;
                
        for (int i = 0; i < notasProgramacion.length; i++) {
                suma_programacion = suma_programacion + notasProgramacion[i];
                
                media = suma_programacion/notasProgramacion.length;
                
                if(notasProgramacion[i] > media){
                   mas_media ++; 
            }
        }
        
        System.out.println("La nota media en programación es de :" + media);
        System.out.println("Los alumnos que superan la nota media en programación son : " + mas_media);
          System.out.println("Los alumnos que han aprobado todo en el conjunto de asignaturas es de: " + contar_aprobados(notasProgramacion,notasEntornos,notasSistemasInformaticos));
        System.out.println("Los alumnos que han suspendido todo en el conjunto de asignaturas es de: " + contar_suspensos(notasProgramacion,notasEntornos,notasSistemasInformaticos));
    }
    
    public static String obtener_alumno_nota_mas_alta_programacion(double[] notas_programacion, String [] alumnos){
        String alumno = "";
        double max_nota = 0.0;
        for (int i = 0; i < notas_programacion.length; i++) {
            if(notas_programacion[i] >max_nota ){
                max_nota = notas_programacion[i];
                alumno = alumnos[i];
            }
            
        }
        return alumno;
    }
     public static String obtener_alumno_nota_mas_alta_sistemas(double[] notas,String [] alumnos){
        String alumno = "";
        double max_nota = 0.0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >max_nota ){
                max_nota = notas[i];
                alumno = alumnos[i];
            }
        
    }
        return alumno;
    }
     
      public static String obtener_alumno_nota_mas_alta_entornos(double[] notas,String [] alumnos){
        String alumno = "";
        double max_nota = 0.0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >max_nota ){
                max_nota = notas[i];
                alumno = alumnos[i];
            }
    }
    return alumno;
}
       public static String obtener_alumno_nota_mas_baja_programacion(double[] notas, String [] alumnos){
        String alumno = "";
        double min_nota = Double.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < min_nota ){
                min_nota = notas[i];
                alumno = alumnos[i];
            }
            
        }
        return alumno;
    }
     public static String obtener_alumno_nota_mas_baja_sistemas(double[] notas,String [] alumnos){
        String alumno = "";
        double min_nota = Double.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < min_nota ){
                min_nota = notas[i];
                alumno = alumnos[i];
            }
        
    }
        return alumno;
    }
     
      public static String obtener_alumno_nota_mas_baja_entornos(double[] notas,String [] alumnos){
        String alumno = "";
        double min_nota = Double.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < min_nota ){
                min_nota = notas[i];
                alumno = alumnos[i];
            }
    }
    return alumno;
}
     public static int contar_aprobados(double notas1[], double notas2[], double notas3[]){
         int contador = 0;
         double aprobado = 5.0;
                 
         for (int i = 0; i < notas3.length; i++) {
             if((notas1[i] + notas2[i] + notas3[i])/3 > aprobado){
                contador ++; 
             }
             
         }
        
         return contador;
     }
      public static int contar_suspensos(double notas1[], double notas2[], double notas3[]){
         int contador = 0;
         double suspenso = 5.0;
         
          for (int i = 0; i < notas3.length; i++) {
              if ((notas1[i] + notas2[i] + notas3[i])/3 < suspenso){
                  contador ++;   
          }
     
         }
         return contador;
     }
}
