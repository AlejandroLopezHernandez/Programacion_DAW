/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioOscars;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alejandrolopezhernandez
 */
public class ConexionMySQL {
    //Obligatorio usar un método main
    public static void main(String[] args) {
      //Declaramos las tres variables que necesitamos para la conexion de bbdd a mysql:
    //connection, preparedStatement y Result Set
    Connection conexion = null;
    PreparedStatement sentencia = null;
    PreparedStatement insertar = null;
    ResultSet resultado = null;
    
    //Usamos el bloque try/catch para establecer la conexion con la bbdd
        try{
            System.out.println("Conectandose a la base de datos...");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oscars2024","root","");
    //Para evitar un ataque de inyección SQL, ponemos esta sentenciaa
    String query ="SELECT id, nombre, categoria, pelicula FROM Oscar WHERE nombre>?";

    //Preparamos una conexión SQL con parámetros
    sentencia = conexion.prepareStatement(query);
    sentencia.setString(1,""); //Aquí se nos mostrará que el resultado va a ser mayor, menor o igual a estos parámetros
    
    
    //Ejecutamos la consulta y obtenemos resultados
    resultado = sentencia.executeQuery();
    
    //Usamos un bucle while para procesar estos resultados
    
    while(resultado.next()){
        //Obtenemos los valores de las columnas de cada fila
        int id = resultado.getInt("id");
        String nombre = resultado.getString("nombre");
        String categoria = resultado.getString("categoria");
        String pelicula = resultado.getString("pelicula");

        //Imprimos los resultados dentro del bucle while 
        System.out.println("id: " + id + " ||nombre: " + nombre + " ||categoria: " + categoria + " ||pelicula: " + pelicula);        
    }
    //Ahora vamos a realizar una inserción, primero la declaramos
    String insercion = "INSERT INTO Oscar(id,nombre,categoria, pelicula) VALUES (?,?,?,?)";
    //La variable tiene que estar declarada arriba
    //Decimos que nuestra variable insertar es la conexion y preparedStatement
    insertar = conexion.prepareStatement(insercion);
    //Ajustamos los parámetros
    insertar.setInt(1, 3);
    insertar.setString(2,"Hayao Miyazaki");
    insertar.setString(3, "Mejor película animada");
    insertar.setString(4,"El niño y la garza");
    
    //Declaramos un int y los ejecutamos
    //int filasInsertadas = insertar.executeUpdate();
        //System.out.println("Filas insertadas en la BBDD: " + filasInsertadas);
    //Capturamos una excepción en caso de que haya un error
        } catch (SQLException ex) {
            System.out.println("Error al establecer la conexión con la base de datos " + ex);
        }  
    }
}
