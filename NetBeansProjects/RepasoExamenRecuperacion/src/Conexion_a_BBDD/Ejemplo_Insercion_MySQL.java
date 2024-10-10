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
public class Ejemplo_Insercion_MySQL {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement insercion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println("Conectándose a la base de datos...");
            
            String insert = "INSERT INTO Alumno(id,nombre,apellido1) VALUES (?,?,?)";
            
            insercion = conexion.prepareStatement(insert);
            
            insercion.setInt(1, 8);
            insercion.setString(2, "Sara");
            insercion.setString(3, "Prieto");
            
            int filas = insercion.executeUpdate();
            
            if (filas >= 1){
                System.out.println("Inserción realizada");
            } else {
                System.out.println("Error al insertar datos");
            }
            
            
        } catch (SQLException ex){
            System.out.println("Error al conectarse a la base de datos, código de error: " + ex);
        }
    }
}
