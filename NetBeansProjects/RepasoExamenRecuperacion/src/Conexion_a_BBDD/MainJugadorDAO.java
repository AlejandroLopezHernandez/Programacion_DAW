/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

/**
 *
 * @author alejandrolopezhernandez
 */
public class MainJugadorDAO {
    public static void main(String[] args) {
        JugadorDAO dao = new JugadorDAO();
        
        //dao.crearJugador(1, 1200, 80, 90);
        //dao.crearJugador(2, 1500, 85, 88);
        //dao.crearJugador(3, 1000, 70, 95);
        //dao.crearJugador(4, 1, 2, 5);
        
        //dao.getJugadores();
        //dao.getJugadoresNivelExperiencia(1100);
        dao.getNivelJugadores();
    }
}
