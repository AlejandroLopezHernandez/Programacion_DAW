/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

import java.util.*;
import java.sql.*;
/**
 *
 * @author alejandrolopezhernandez
 */
public class JugadorDAO {
    
    private Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet resultado = null;
    
    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String user = "root";
    private String password = "";
    
    private ArrayList<Jugador> jugadores;
    
    public JugadorDAO(){
        
        try {   
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = null;
            resultado = null;
            
        } catch(SQLException ex){
            System.out.println("Error al acceder a la base de datos, código de error: " + ex);
        }       
    }
    
    public ArrayList<Jugador> getJugadores(){
        jugadores = new ArrayList<>();
                
    try{
        
        String query = "SELECT * FROM Jugador";
        
        sentencia = conexion.prepareStatement(query);
        resultado = sentencia.executeQuery();
        
        while(resultado.next()){
            
            int id = resultado.getInt("id_jugador");
            int experiencia = resultado.getInt("experiencia");
            int destreza = resultado.getInt("destreza");
            int inteligencia = resultado.getInt("inteligencia");
            
            Jugador jugador1 = new Jugador(id,experiencia,destreza,inteligencia);
            
            jugadores.add(jugador1);
            
            //System.out.println("Jugador: " + id + " ||experiencia: " + experiencia + " ||destreza: " + destreza + " ||inteligencia: " + inteligencia);
            System.out.println("ID de Jugador: " + jugador1.getId_jugador() + " ||experiencia: " + jugador1.getExperiencia() + 
                               " ||destreza: "  + jugador1.getDestreza() + " ||inteligencia: " +jugador1.getInteligencia());
            
        }
        
        
    } catch(SQLException ex){
     System.out.println("Error al acceder a la base de datos, código de error: " + ex);
}
    
    return jugadores;
}
    
    public ArrayList<Jugador> getJugadoresNivelExperiencia(int nivel_minimo){
        
        jugadores = new ArrayList<>();
        
        try{
           String query = "SELECT * FROM Jugador WHERE experiencia >= ?";
           
           sentencia = conexion.prepareStatement(query);
           
           sentencia.setInt(1, nivel_minimo);
           
           resultado = sentencia.executeQuery();
           
           while(resultado.next()){
               
               int id = resultado.getInt("id_jugador");
               int experiencia = resultado.getInt("experiencia");
               int destreza = resultado.getInt("destreza");
               int inteligencia = resultado.getInt("inteligencia");
               
            Jugador jugador1 = new Jugador(id,experiencia,destreza,inteligencia);
            
            jugadores.add(jugador1);
            
            //System.out.println("Jugador: " + id + " ||experiencia: " + experiencia + " ||destreza: " + destreza + " ||inteligencia: " + inteligencia);
            System.out.println("ID de Jugador: " + jugador1.getId_jugador() + " ||experiencia: " + jugador1.getExperiencia() + 
                               " ||destreza: "  + jugador1.getDestreza() + " ||inteligencia: " +jugador1.getInteligencia());
           }
        
            
        } catch(SQLException ex){
     System.out.println("Error al acceder a la base de datos, código de error: " + ex);
    }
    return jugadores;
}
    
    public void crearJugador(int id, int experiencia, int destreza, int inteligencia){
        try{
            String insert = "INSERT INTO Jugador(id_jugador,experiencia,destreza,inteligencia) VALUES(?,?,?,?)";
            
            sentencia = conexion.prepareStatement(insert);
            
            sentencia.setInt(1, id);
            sentencia.setInt(2, experiencia);
            sentencia.setInt(3, destreza);
            sentencia.setInt(4, inteligencia);
            
            int filas = sentencia.executeUpdate();
            
            if (filas >= 1){
                System.out.println("Inserción realizada con éxito");
            } else {
                System.out.println("Inserción fallida");
            }
            
        } catch(SQLException ex){
     System.out.println("Error al acceder a la base de datos, código de error: " + ex);
        
    }
}
    public void getNivelJugadores(){
        double nivel = 0.0;
        jugadores = new ArrayList<>();
        try{
        String query = "SELECT * FROM Jugador";
        
        sentencia = conexion.prepareStatement(query);
        resultado = sentencia.executeQuery();
        
        while(resultado.next()){
            
            int id = resultado.getInt("id_jugador");
            int experiencia = resultado.getInt("experiencia");
            int destreza = resultado.getInt("destreza");
            int inteligencia = resultado.getInt("inteligencia");
            
            Jugador jugador1 = new Jugador(id,experiencia,destreza,inteligencia);
            
            jugadores.add(jugador1);
            
            nivel = (jugador1.getExperiencia() * 0.3) + (jugador1.getDestreza() * 0.3 )+ (jugador1.getInteligencia() * 0.4);
            //System.out.println("Jugador: " + id + " ||experiencia: " + experiencia + " ||destreza: " + destreza + " ||inteligencia: " + inteligencia);
            System.out.println("ID de Jugador: " + jugador1.getId_jugador() + " ||nivel: " + nivel );
            
        }
        } catch(SQLException ex){
     System.out.println("Error al acceder a la base de datos, código de error: " + ex);
        
    }
    

    }
}
