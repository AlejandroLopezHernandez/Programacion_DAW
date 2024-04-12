package Persistencia_Archivos.Ejemplo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /**
  * ProgramaLeerArchivoNotas
  * @author 1DAW 
  */
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;
 
 public class ProgramaLeerArchivoNotas {
     
     public static void main(String[] args) {
         
         String nombreArchivo = "./src/Ejemplo1_persistencia/notas.csv"; //nombre archivo
         List<Alumno> alumnos = new ArrayList<>();
         File archivo = new File (nombreArchivo);
         
        
         try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
             String linea;
             while ((linea = br.readLine()) != null) {
                 String[] campos = linea.split(","); // se forma una array con los campos
                 String nombre = campos[0];
                 List<Integer> notas = new ArrayList<>();
                 for (int i = 1; i < campos.length; i++) {
                     notas.add(Integer.parseInt(campos[i]));
                 }
                 alumnos.add(new Alumno(nombre, notas));
             }
         } catch (IOException e) {
             System.out.println("Error al leer el archivo: " + e.getMessage());
         }
 
         // Mostrar las notas de cada alumno
         for (Alumno alumno : alumnos) {
             System.out.println("Nombre: " + alumno.getNombre());
             System.out.println("Notas: " + alumno.getNotas());
             System.out.println("Promedio: " + alumno.calcularPromedio());
             System.out.println();
         }
    
             
     }
 }
 
 class Alumno {
     private String nombre;
     private List<Integer> notas;
 
     public Alumno(String nombre, List<Integer> notas) {
         this.nombre = nombre;
         this.notas = notas;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public List<Integer> getNotas() {
         return notas;
     }
 
     public double calcularPromedio() {
         int suma = 0;
         for (int nota : notas) {
             suma += nota;
         }
         return (double) suma / notas.size();
     }
 }
 