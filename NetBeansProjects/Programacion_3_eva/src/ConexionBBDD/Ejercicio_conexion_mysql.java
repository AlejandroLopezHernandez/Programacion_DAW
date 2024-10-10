/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBBDD;

import java.sql.*;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Ejercicio_conexion_mysql {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        
        System.out.println("Conectándose a la base de datos...");
        try{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gobierno","root","");
        
        String consulta = "SELECT * FROM ministerio";
        
        sentencia = conexion.prepareStatement(consulta);
        
        resultado = sentencia.executeQuery();
        
        while (resultado.next()){
            int id = resultado.getInt("codMinisterio");
            String nombre = resultado.getString("nombre");
            String presupuesto = resultado.getString("presupuesto");
            String gastos = resultado.getString("gastos");
            
            System.out.println("Código de ministerio: " + id + " |nombre: " + nombre + " |presupuesto: " + presupuesto + " |gastos: " + gastos);
        }
        
        } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos, código de error: " + ex);
        }
    }
}
