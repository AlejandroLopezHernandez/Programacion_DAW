

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package Persistencia_Archivos.Ejemplo1;

 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;
 
 /**
  * ProgramaLeerArchivoScanner
  * @author 1DAW 
  */
 public class ProgramaLeerArchivoScanner {
 
     public static void main(String[] args) {
         //String nombreArchivo = "./src/Ejemplo1_persistencia/notas.csv"; //nombre archivo
         String nombreArchivo = "notas_alatorias.csv"; 
         List<Alumno> alumnos = new ArrayList<>();
           
       
         try  {
             //1.- Abrir el archivo
             File archivo = new File (nombreArchivo);      
             String linea;
             //2.- Crear el Scanner
              Scanner scanner=new Scanner(archivo);
             //3.- Leer la cabecera
              linea= scanner.nextLine();// Llemos la cabecera
              //4.- Mientras haya líneas
             while ((scanner.hasNext())) {
                 // leer la línea
                  linea= scanner.nextLine(); // se forma una array con los campos
                 // Extrer los campos
                 String []campos= linea.split(",");
                 // El nombre está en el primer campo
                 String nombre = campos[0];
                 List<Integer> notas = new ArrayList<>();
                 
                 for (int i = 1; i < campos.length; i++) {
                     notas.add(Integer.parseInt(campos[i]));
                 }
                 alumnos.add(new Alumno(nombre, notas));
             }
         } catch (Exception e) {
             System.out.println("Error al leer el archivo: " + e.getMessage());
         }
 
         // Mostrar las notas de cada alumno
         for (Alumno alumno : alumnos) {
             System.out.println("Nombre: " + alumno.getNombre());
             System.out.println("Notas: " + alumno.getNotas());
             System.out.println("Promedio: " + alumno.calcularPromedio());
             System.out.println();
         }
    
         leerNumeroLineas();
             
     }
     
     public static void leerNumeroLineas(){
     
     //String nombreArchivo = "./src/Ejemplo1_persistencia/notas.csv"; //nombre archivo
         String nombreArchivo = "notas_aleatorias.csv"; 
         List<Alumno> alumnos = new ArrayList<>();
         int nlineas=0;
       
         try  {
             File archivo = new File (nombreArchivo);      
             String linea;
              Scanner scanner=new Scanner(archivo);
              linea= scanner.nextLine();// Llemos la cabecera
              
             while ((scanner.hasNext())) {
                 scanner.nextLine();
                 nlineas++;
             }
             
             System.out.println("Número de lineas nlineas"+nlineas);
         } catch (Exception e) {
             System.out.println("Error al leer el archivo: " + e.getMessage());
         }
 
         
     }
 
 }
 