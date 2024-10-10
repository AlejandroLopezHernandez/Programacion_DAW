/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDAO;

/**
 *
 * @author alejandrolopezhernandez
 */
   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Main
 * @author Gustavo
 */
public class Main {

public static void main(String[] args) {
    
    
    // Crear el objeto DAO
    SQLDAO interfaz = new SQLDAO("URL");
    // Crear un Alumno con el objeto DAO
    interfaz.crear alumno1(1, "Juan Barrau", 4.0);
    // Guardar el Alumno con el objeto DAO en la BBDD
    interfaz.almacenar(alumno1);
    // Usar el DAO para seleccionar los alumnos que han aprobado
    
    // Usar el DAO para obtener el Alumno con ID=1
    
    
}

}
 

