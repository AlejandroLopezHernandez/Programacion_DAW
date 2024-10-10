/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioOscars;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
        EscritorGanadoresOscar escribir = new EscritorGanadoresOscar("oscar2024.txt");
        escribir.escribirGanador("Cilian Murphy", "Oppenheimer");
        escribir.cerrarEscritor();
        LectorGanadoresOscar leer = new LectorGanadoresOscar("oscar2024.txt");
        leer.obtenerDatos();
        leer.mostrarGanadores();
    }
}
