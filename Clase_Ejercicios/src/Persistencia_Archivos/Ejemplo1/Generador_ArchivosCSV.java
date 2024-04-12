package Persistencia_Archivos.Ejemplo1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * GenerarArchivoCSV
 *
 * @author 1DAW
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generador_ArchivosCSV {

    public static void main(String[] args) {
        String nombreArchivo = "notas_aleatorias.csv";
        int numAlumnos = 10000; // Cantidad de alumnos en el archivo
        int notaMinima = 0; // Nota mínima posible
        int notaMaxima = 5; // Nota máxima posible

        Random random = new Random();

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Escribir encabezado
            writer.append("Nombre,Nota1,Nota2,Nota3\n");

            // Generar datos para cada alumno y escribir en el archivo
            for (int i = 1; i <= numAlumnos; i++) {
                String nombre = "Alumno" + i;
                int nota1 = random.nextInt(notaMaxima ) ;
                int nota2 = random.nextInt(notaMaxima ) ;
                int nota3 = random.nextInt(notaMaxima ) ;

                // Escribir datos del alumno en una línea del archivo
                writer.append(nombre + "," + nota1 + "," + nota2 + "," + nota3 + "\n");
            }

            System.out.println("Archivo CSV generado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}