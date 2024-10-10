/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoArchivosAlquiler;

/**
 *
 * @author alejandrolopezhernandez
 */
public class ClaseMain {
    public static void main(String[] args) {
           ModuloLectura lectura = new ModuloLectura("empresas_alquiler_coches.csv");
        
        
        lectura.extraerInfo();
        System.out.println("El total de empresas de alquiler de coches en toda Mallorca es de: " +lectura.getTotalEmpresas());
        System.out.println("El total de empresas de alquiler de coches en Palma es de: " + lectura.getTotalEmpresasenPalma());
        System.out.println("El total de empresas de alquiler de coches en Calvià es de: " + lectura.getTotalEmpresasCalvia());
        System.out.println("El municipio que tiene menos empresas de alquiler de coches es: " + lectura.getPueblomenosEmpresas());
        System.out.println("El municipio que tiene más empresas de alquiler de coches es: " + lectura.getCiudadmasEmpresas());
        
    }
     
}
