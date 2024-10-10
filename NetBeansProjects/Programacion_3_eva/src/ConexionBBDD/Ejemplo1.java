/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBBDD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejemplo1 {
    public static void main(String[] args) {
    //Declaramos estas variables básicas
    
    Connection conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null; 
    
    //Usamos el bloque try/catch para el ejercicio
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gobierno","root","");
            //Para evitar un ataque de inyección SQL
            String query = "SELECT codMiembro, nombre, apellido1 FROM miembro WHERE apellido1 >?";
            
            sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, "Muñoz");
            
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                int id = resultado.getInt("codMiembro");
                String nombre = resultado.getString("nombre");
                String apellido1 = resultado.getString("apellido1");
                
                System.out.println("||id: " + id + " ||nombre: " + nombre + " ||apellido1: " + apellido1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al realizar conexión con la BBDD, código del error: " + ex);
        }
    
    }
    
}
