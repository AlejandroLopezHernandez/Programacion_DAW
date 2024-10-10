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
public class EjemploConexionMySQL {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        
        try{
            System.out.println("Conectándose a la base de datos...");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Viveros","root","");
            
            String query = "SELECT * FROM pedido";
            
            sentencia = conexion.prepareStatement(query);
            
            resultado = sentencia.executeQuery();
            
            while (resultado.next()){
                
                 int codPedido = resultado.getInt("codPedido");
                String fechaPedido = resultado.getString("fechaPedido");
                String fechaPrevista = resultado.getString("fechaPrevista");
                String fechaEntrega = resultado.getString("fechaEntrega");
                String estado = resultado.getString("estado");
                String comentarios = resultado.getString("comentarios");
                int codCliente = resultado.getInt("codCliente");
                
                System.out.println("Código Pedido: " + codPedido + " ||fecha prevista: " + fechaPrevista + " ||fecha de entrega: " + fechaEntrega +
                                   " ||estado: " + estado + " ||comentarios: " + comentarios + " ||código de cliente: " + codCliente);
            }
         
        } catch (SQLException ex){
            System.out.println("Error al conectarse a la base de datos, código del error: " + ex);
        }
    }
}
