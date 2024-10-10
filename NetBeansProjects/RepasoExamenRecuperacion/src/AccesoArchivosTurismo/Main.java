/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivosTurismo;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Main {
    public static void main(String[] args) {
        
        ModuloAccesoInfoCovid acceso_archivo = new ModuloAccesoInfoCovid("positividad_covid_baleares.csv");
        acceso_archivo.obtenerInfoCovid();
        
        System.out.println(acceso_archivo.obtener_mayor_positividad());
        System.out.println(acceso_archivo.obtener_municipio_mas_contagio());
    }
}
