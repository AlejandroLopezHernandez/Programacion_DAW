/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAccesoFicheros;

import java.io.FileWriter;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
     Escritura writer = new Escritura("chiste.txt");
     writer.escribir("Va un español, un francés e un inglés...");
     writer.cerrar();
     
    Lectura lector = new Lectura("CCTV_via_publica.csv");
    lector.leer();
     
    }
}
