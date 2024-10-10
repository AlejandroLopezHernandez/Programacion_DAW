/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion_BBDD;

import java.sql.*;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejemplo_Conexion_MySQL {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultado = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            
            String query = "SELECT id, nombre, apellido1 FROM Alumno WHERE apellido1 >?";
            
            preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, "");
            
            resultado = preparedStatement.executeQuery();
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido1 = resultado.getString("apellido1");
                
                System.out.println("id" + id + "Nombre" + nombre + "apellido1" + apellido1);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo_Conexion_MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
    }
}
