/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurismoBalears;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainTurismo {
    public static void main(String[] args) {
        /*ModuloInfoTurismo turismo = new ModuloInfoTurismo("turismo_baleares.csv");
        turismo.getInfoTurismo();
        
        System.out.println("La comunidad de mayor origen de turismo de Baleares es de: " + turismo.getComunidadMayorOrigen()
                           + " con un porcentaje de:" + turismo.getPorcentajeMayor());
        System.out.println("Y además la segunda comunidad con mayor turismo es: " + turismo.getSegundaComunidad()
                           + " con un porcentaje de: " + turismo.getSegundoPorcentaje());*/
        InterfazGraficaTurismo interfaz = new InterfazGraficaTurismo("turismo_baleares.csv");
    }
}
