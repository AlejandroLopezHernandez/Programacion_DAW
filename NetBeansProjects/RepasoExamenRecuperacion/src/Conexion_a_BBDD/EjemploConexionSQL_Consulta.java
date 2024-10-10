/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

import java.sql.*;


/**
 *
 * @author alejandrolopezhernandez
 */
public class EjemploConexionSQL_Consulta {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            
            String consulta = "SELECT * FROM Alumno";
            
            sentencia = conexion.prepareStatement(consulta);
            
            resultado = sentencia.executeQuery();
            
            while (resultado.next()){
               int id = resultado.getInt("id");
               String nombre = resultado.getString("nombre");
               String apellido1 = resultado.getString("apellido1");
               
                System.out.println("id: " + id + " ||nombre: " + nombre + " ||apellido1: " + apellido1);
            }
            
            
        } catch (SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos, código: " + ex);
        }
    }
}
