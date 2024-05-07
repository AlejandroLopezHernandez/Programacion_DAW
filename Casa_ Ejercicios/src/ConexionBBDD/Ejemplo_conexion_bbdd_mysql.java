package ConexionBBDD;

import java.sql.*;

public class Ejemplo_conexion_bbdd_mysql {
    public static void main(String[] args) {
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/localhost","root","");

            //Para evitar un ataque de inyección de código SQL
            String query ="SELECT id, nombre, apellido1 FROM alumno WHERE apellido >?";

            preparedStatement= conexion.prepareStatement(query);
            preparedStatement.setString(1, "Muñoz");

            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido1 = resultSet.getString("apellido1");

                System.out.println("id: " + id + "Nombre: " + nombre + "apellido1: " + apellido1);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
