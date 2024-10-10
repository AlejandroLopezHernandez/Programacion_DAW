/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoPoblacionExtranjera;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainExtranjeria {
    public static void main(String[] args) {
        ModuloInfoPoblacionEntranjera extranjeria = new ModuloInfoPoblacionEntranjera("poblacion_extranjera_catalunya.csv");
        extranjeria.obtenerInfoExtranjeria();
        
        /*System.out.println("El número total de países registrado es de: " + extranjeria.getTotalPaises());
        System.out.println("El número total de extranjeros que hay en Cataluyna es de :" + extranjeria.getTotalExtranjeros());
        System.out.println("El mayor país de origen de inmigrantes en Catalunya es: " + extranjeria.getMayorPaisOrigen() + 
                            " con un total de: " + extranjeria.getNumeroExtranjerosPais());
        System.out.println("El país de origen que tiene menos inmigrantes en Catalunya es: " + extranjeria.getPaisMenosOrigen()
                            + " con un número de: " + extranjeria.getNumeroMenorExtranjeros());*/
        
        InterfazGrafica interfaz = new InterfazGrafica("poblacion_extranjera_catalunya.csv");
        
    }
}
