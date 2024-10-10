/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author alejandrolopezhernandez
 */
public class SistemaAcademico {
    
    private double [] [] notas;
    private int alumnos;
    private int asignaturas;
    
    public int getNumero_alumnos() {
        return alumnos;
    }

    public int getNumero_asignaturas() {
        return asignaturas;
    }
    
    public SistemaAcademico(int alumnos, int asignaturas){
        
        notas = new double[alumnos] [asignaturas];
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
        
    }
    
    public void ponerNota(int alumno, int asignatura, double nota){
        notas [alumno] [asignatura] = nota;
    }
    
    public double obtener_nota(int alumno, int asignatura){
        return notas [alumno] [asignatura];
    }
    
    public int obtenerNumeroSuspensos(int alumno){
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[alumno][i]< 5){
                contador ++;
            } 
        } 
        return contador;
    }
    public double obtenerNotaMedia(int alumno){
        double suma = 0.0;
        double media = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[alumno] [i];
            media = suma/notas.length;
        }
        return media;
    }
    
    public double obtenerNotaMaxima(int alumno){
        double nota_max = 0.0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[alumno][i]> nota_max) {
                nota_max = notas[alumno][i];
            }    
        }
        return nota_max;
    }
    
    public void imprimirTablaNotas(){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                
                System.out.print(" || Alumno: " + notas[i][j]);
                
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    
    public int obtenerAsignaturaMejorNota(int alumno){
         int asignatura= 0;
        double mejor_nota = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[alumno][i] > mejor_nota){
                mejor_nota = notas [alumno][i];
                asignatura = i;
            }
            
        }
        
        return asignatura;
    }
}
