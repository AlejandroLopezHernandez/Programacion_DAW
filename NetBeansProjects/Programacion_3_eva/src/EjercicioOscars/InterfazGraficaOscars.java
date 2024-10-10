/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioOscars;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author alejandrolopezhernandez
 */

/*Muy IMPORTANTE, una interfaz gráfica siempre hereda Jframe 
e implemente la interfaz de ActionListener*/

public class InterfazGraficaOscars extends JFrame implements ActionListener {
    //Declaramos todas las variables de una interfaz fráfica
    private JTextField tfMejorActor, tfMejorActriz, tfMejorPelicula, tfDatosGrabados;
    private JLabel lblMejorActor, lblMejorActriz, lblMejorPelicula, lblDatosGrabados;
    private JButton btnGuardar ,btnMostrar;
    //También un archivo y el escritor y ganador que hayamos creado antes
    private String archivo;
    private EscritorGanadoresOscar escritor;
    private LectorGanadoresOscar lector;
    private Connection conexion; //Para la conexion con la base de datos
    
    //Hacemos el constructor de nuestra interfaz gráfica
    public InterfazGraficaOscars (String archivo){
        this.archivo = archivo;
        this.lector = new LectorGanadoresOscar(archivo);
        this.escritor = new EscritorGanadoresOscar(archivo);
        //Declaramos este último método para poder iniciar los componentes gráficos de nuestra ventana
        this.iniciarComponentesGraficos();
        //Ahora vamos a establecer la conexion con la baase de datos
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Oscars2024","root","");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "Error 1 al conectarse con la base de datos, código: " + ex);
        }
        
    }
    //Este método es muy importante, es el que configura toda la ventana
    public void iniciarComponentesGraficos(){
        //Esto es para configurar la ventana
        setTitle("Ganadores Oscar 2024");
        setSize(800,200);
        //Adicionalmente añadimos un DefaultClose y un Layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7,2)); //El número de columnnas y filas
        
        //Los componentes de entrada de datos
        lblMejorActor = new JLabel("Mejor Actor");
        tfMejorActor = new JTextField();
        lblMejorActriz = new JLabel("Mejor Actriz");
        tfMejorActriz = new JTextField();
        lblMejorPelicula = new JLabel("Mejor película");
        tfMejorPelicula = new JTextField();
        tfDatosGrabados = new JTextField(); //Podemos poner otro tamaño
        btnGuardar = new JButton("Guardar");
        btnMostrar = new JButton("Mostrar");
              
        //Una vez declarados y creados todos los componentes de la ventana, toca añadirlos
        add(lblMejorActor);
        add(tfMejorActor);
        add(lblMejorActriz);
        add(tfMejorActriz);
        add(lblMejorPelicula);
        add(tfMejorPelicula);
        add(new JLabel());
        add(btnGuardar);
        add(new JLabel()); //Estos dos sonn simples espacios en blanco, no aportan nada
        add(tfDatosGrabados);
        add(new JLabel());
        add(btnMostrar);
        
        //Muy importante, ahora añadimos el Action Listener a nuestro programa
        btnGuardar.addActionListener(this);
        btnMostrar.addActionListener(this);
        //Por último, hacemos visible la ventana
        this.setVisible(true);
        //¡Ya tenemos nuestra ventana creada, aunque los botones no hacen nada
        
    }
    
    public void actionPerformed(ActionEvent accion){
        if (accion.getSource()== btnGuardar){
            try{
                String insercion = "INSERT INTO Oscar (id, nombre, categoria, pelicula) VALUES(?,?,?)";
                PreparedStatement sentencia = conexion.prepareStatement(insercion);
                sentencia.setString(1, tfMejorActor.getText());
                sentencia.setString(2, tfMejorActriz.getText());
                sentencia.setString(3, tfMejorPelicula.getText());
                
                int filasInsertadas = sentencia.executeUpdate();
                
                if (filasInsertadas > 0){
                    JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos");
                }
                sentencia.close();
                
            tfMejorActor.setText("");
            tfMejorActriz.setText("");
            tfMejorPelicula.setText("");
                
            } catch (SQLException e){
                JOptionPane.showMessageDialog(this,"Error 2 al conectarse a la base de datos, código: " + e);
            }
        }
    }
    
    //Ahora hacemos el método para ajustar los botones
    /*public void actionPerformed(ActionEvent accion){
        //Así el botón de acción pillará la acción de guardar
        if (accion.getSource() == btnGuardar){
            String archivo = "oscars24.txt";
        try{
            FileWriter escritor = new FileWriter(this.archivo);
            escritor.write("#Mejor actor para: " + tfMejorActor.getText());
            escritor.write("#Mejor actriz para: " + tfMejorActriz.getText());
            escritor.write("#Mejor pelicula para: " + tfMejorPelicula.getText());
            escritor.close();
            //Adicionalmente añadimos un panel para decirle al usuario que los datos están guardados
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente " + archivo);
            //Con este método hacemos que los campos de texto se borren después de haberlos introducido
            
            tfMejorActor.setText("");
            tfMejorActriz.setText("");
            tfMejorPelicula.setText("");
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error al escribir el archivo " + e);
        }
        }
        else if (accion.getSource() == btnMostrar){
            String datos = lector.obtenerDatos();
            tfDatosGrabados.setText(datos);
        }
    }*/
    
    //Método main para usar la interfaz gráfica
    public static void main(String[] args) {
        InterfazGraficaOscars ventana = new InterfazGraficaOscars("oscars24.txt");
    }
}
    
