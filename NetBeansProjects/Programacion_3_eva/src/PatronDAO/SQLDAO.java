/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDAO;

/**
 *
 * @author alejandrolopezhernandez
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SQLDAO
 *
 * @author Gustavo
 */
public class SQLDAO implements IAlumnoDAO {

    private Connection conexion;
    private PreparedStatement sentenciaSQL;
    private ResultSet tablaResultadoSentenciaSQL;

    public SQLDAO(String url) {

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(SQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Alumno crear(int id, String nombre, double nota) {
        return new Alumno(id, nombre, nota);
    }

    @Override
    public void almacenar(Alumno alumno) {

        String sentenciaTexto = " INSERT INTO Alumno(id,nombre,nota) values (?,?,?)";

        try {

            sentenciaSQL = conexion.prepareStatement(sentenciaTexto);
            sentenciaSQL.setInt(1, alumno.getId());
            sentenciaSQL.setString(2, alumno.getNombre());
            sentenciaSQL.setDouble(3, alumno.getNota());

            sentenciaSQL.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR:" + ex);
        }
    }

    @Override
    public List<Alumno> seleccionar(double nota) {

        String sentenciaTexto = "SELECT * FROM Alumno WHERE nota=?";
        List<Alumno> lista = new ArrayList<Alumno>();

        try {

            sentenciaSQL = conexion.prepareStatement(sentenciaTexto);
            sentenciaSQL.setDouble(1, nota);

            this.tablaResultadoSentenciaSQL = sentenciaSQL.executeQuery();

            while (this.tablaResultadoSentenciaSQL.next()) {

                int id_alumno = tablaResultadoSentenciaSQL.getInt("id");

                String nombre_alumno = tablaResultadoSentenciaSQL.getString("nombre");

                double nota_alumno = tablaResultadoSentenciaSQL.getDouble("nota");
                Alumno a = new Alumno(id_alumno, nombre_alumno, nota_alumno);

                lista.add(a);

            }

        } catch (SQLException ex) {
            System.out.println("ERROR:" + ex);
        }
        return lista;
    }

    @Override
    public Alumno seleccionar(int id) {

        String sentenciaTexto = "SELECT * FROM ALUMNO WHERE id=?";
        Alumno alumno=null;

        try {

            sentenciaSQL = conexion.prepareStatement(sentenciaTexto);
            sentenciaSQL.setInt(1, id);

            this.tablaResultadoSentenciaSQL = sentenciaSQL.executeQuery();

            while (this.tablaResultadoSentenciaSQL.next()) {

                int id_alumno = tablaResultadoSentenciaSQL.getInt("id");

                String nombre_alumno = tablaResultadoSentenciaSQL.getString("nombre");

                double nota_alumno = tablaResultadoSentenciaSQL.getDouble("nota");
                alumno = new Alumno(id_alumno, nombre_alumno, nota_alumno);

            }

        } catch (SQLException ex) {
            System.out.println("ERROR:" + ex);
        }
        return alumno;

    }

}
