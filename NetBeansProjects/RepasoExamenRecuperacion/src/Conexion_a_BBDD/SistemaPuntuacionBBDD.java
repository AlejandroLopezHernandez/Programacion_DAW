/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author alejandrolopezhernandez
 */
public class SistemaPuntuacionBBDD {
    
    Connection conexion;
    PreparedStatement sentencia;
    ResultSet resultado;
    private ArrayList<Punto> puntos;
    
    public SistemaPuntuacionBBDD(){
        this.conexion = conexion;
        String url= "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "";
        
        try{
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Estableciendo conexión con la base de datos");
            
            
        } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        }
    }
    
    public void setPuntuacion(int jugador, int nivel1, int nivel2, int nivel3){
        try {
            
            String insercion = "INSERT INTO SistemaPuntuacion(Jugador,Nivel1,Nivel2,Nivel3) VALUES(?,?,?,?)";
            
            sentencia = conexion.prepareStatement(insercion);
            
            sentencia.setInt(1, jugador);
            sentencia.setInt(2, nivel1);
            sentencia.setInt(3, nivel2);
            sentencia.setInt(4, nivel3);
            
            int filas = sentencia.executeUpdate();
            
            if (filas>=1){
                System.out.println("Inserción realizada con éxito");
            } else {
                System.out.println("Inserción fallida");
            }
               
            
        } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        }  
        
    }
    public String getPuntuacion(int jugador){
        String resultadofinal = "";
        
        try{
            
            String consulta = "SELECT * FROM SistemaPuntuacion WHERE Jugador = ?";
            
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setInt(1,jugador);
            
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                
                int id = resultado.getInt("Jugador");
                int nivel1 = resultado.getInt("Nivel1");
                int nivel2 = resultado.getInt("Nivel2");
                int nivel3 = resultado.getInt("Nivel3");
                
                //System.out.println("Jugador: " + id + " ||nivel: " + nivel1 + " ||nivel2: " + nivel2 + " ||nivel3: " + nivel3);
                
                
                resultadofinal = "id: " + id + " ||nivel1: " + nivel1 +
                                " ||nivel2: " + nivel2 + " ||nivel3: " + nivel3;
                
            }
            
                } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        } 
        return resultadofinal;
    }
      
     public void getPuntuacionMaxima(int jugador){
        try{
            
            String consulta = "SELECT * FROM SistemaPuntuacion WHERE Jugador = ?";
            
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setInt(1,jugador);
            
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                
                int id = resultado.getInt("Jugador");
                int nivel1 = resultado.getInt("Nivel1");
                int nivel2 = resultado.getInt("Nivel2");
                int nivel3 = resultado.getInt("Nivel3");
                
                if(nivel1 > nivel2|| nivel1 > nivel3){
                    System.out.println("Jugador: " + id + " ||puntuacion: " + nivel1);
                } else if (nivel2 > nivel1 || nivel2 > nivel3){
                    System.out.println("Jugador: " + id + " ||puntuacion: " + nivel2);
                } else if (nivel3 > nivel2 || nivel3 > nivel1){
                    System.out.println("Jugador: " + id + " ||puntuacion: " + nivel3);
                }
                
            }
            
                } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        } 
    }
      public void getPuntuacionMedia(int jugador){
        try{
            
            String consulta = "SELECT * FROM SistemaPuntuacion WHERE Jugador = ?";
            
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setInt(1,jugador);
            
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                
                int id = resultado.getInt("Jugador");
                int nivel1 = resultado.getInt("Nivel1");
                int nivel2 = resultado.getInt("Nivel2");
                int nivel3 = resultado.getInt("Nivel3");
                
                int media = 0;
                
                media = (nivel1 + nivel2 + nivel3)/ 3;
                
                System.out.println("Jugador: " + id + " ||media: " + media);
            }
            
                } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        } 
    }
    public void getMenorNivelPuntuacion(int jugador){
        try{
            
            String consulta = "SELECT * FROM SistemaPuntuacion WHERE Jugador = ?";
            
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setInt(1,jugador);
            
            resultado = sentencia.executeQuery();
            
            
            while(resultado.next()){
                
                int id = resultado.getInt("Jugador");
                int nivel1 = resultado.getInt("Nivel1");
                int nivel2 = resultado.getInt("Nivel2");
                int nivel3 = resultado.getInt("Nivel3");
                
                if(nivel1 < nivel2|| nivel1 < nivel3){
                    System.out.println("Nivel 1");
                } else if (nivel2 < nivel1 || nivel2 < nivel3){
                    System.out.println("Nivel 2");
                } else if (nivel3 < nivel2 || nivel3 < nivel1){
                    System.out.println("Nivel 3");
                }
                
            }
            
                } catch(SQLException ex){
            System.out.println("Error al establecer conexión con la base de datos + " + ex);
        } 
    } 
    
    
}
