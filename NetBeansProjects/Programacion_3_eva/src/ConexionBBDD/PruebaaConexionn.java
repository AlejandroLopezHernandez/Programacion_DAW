/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBBDD;

import java.sql.*;
import java.util.*;
/**
 *
 * @author alejandrolopezhernandez
 */
public class PruebaaConexionn {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        
        try{
            System.out.println("Conectándose a la base de datos...");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            
            String query = "SELECT id, nombre, apellido1 FROM Alumno WHERE nombre >?";
            
            sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, " ");
            
            resultado = sentencia.executeQuery();
            
            while (resultado.next()){
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido1 = resultado.getString("apellido1");
                
                System.out.println("id: " + id  + " ||nombre: " +  nombre + " ||apellido: " + apellido1);
            }
            
        } catch (SQLException ex){
            System.out.println("Error al establecer conexion con la base de datos, código: " + ex);
        }
    }
}
