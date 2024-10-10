/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alejandrolopezhernandez
 */
public class InterfazGraficaPuntuacion extends JFrame implements ActionListener{
    
    private SistemaPuntuacionBBDD conexion_bbdd;
    private JLabel lbl_id, lbl_nivel1 , lbl_nivel2, lbl_nivel3 , lbl_obtener_puntuacion , lbl_resultado;
    private JTextField txt_id, txt_nivel1, txt_nivel2 , txt_nivel3, txt_estado , txt_resultado, txt_insercion;
    private JButton insertar , buscar, limpiar;
    
    InterfazGraficaPuntuacion(){
        
        conexion_bbdd = new SistemaPuntuacionBBDD();
        //conexion_bbdd.setPuntuacion(0, 0, 0, 0);
        //conexion_bbdd.getPuntuacion(0);
        this.iniciarComponenteGrafico();
        
        
    }
    public void iniciarComponenteGrafico(){
        
        this.setTitle("Sistema Puntuacion");
        this.setSize(600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8,2));
        
        lbl_id = new JLabel("ID");
        lbl_nivel1 = new JLabel("Nivel 1");
        lbl_nivel2 = new JLabel("Nivel 2");
        lbl_nivel3 = new JLabel("Nivel 3");
        lbl_obtener_puntuacion = new JLabel("Obtener puntuación");
        lbl_resultado = new JLabel("Resultado");
        
        txt_id = new JTextField();
        txt_nivel1 = new JTextField();
        txt_nivel2 = new JTextField();
        txt_nivel3 = new JTextField();
        txt_estado  = new JTextField();
        txt_resultado = new JTextField();
        txt_insercion = new JTextField();
        
        insertar = new JButton("Insertar");
        buscar = new JButton("Buscar");
        limpiar = new JButton("Limpiar");
        
        add(lbl_id);
        add(txt_id);
        add(lbl_nivel1);
        add(txt_nivel1);
        add(lbl_nivel2);
        add(txt_nivel2);
        add(lbl_nivel3);
        add(txt_nivel3);
        add(insertar);
        add(txt_estado);
        add(lbl_obtener_puntuacion);
        add(txt_insercion);
        add(lbl_resultado);
        add(txt_resultado);
        add(buscar);
        add(limpiar);
        
        
        
        insertar.addActionListener(this);
        buscar.addActionListener(this);
        limpiar.addActionListener(this);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==insertar){
            int id = Integer.parseInt(txt_id.getText());
            int nivel1 = Integer.parseInt(txt_nivel1.getText());
            int nivel2 = Integer.parseInt(txt_nivel2.getText());
            int nivel3 = Integer.parseInt(txt_nivel3.getText());
            
            conexion_bbdd.setPuntuacion(id, nivel1, nivel2, nivel3);
            
            txt_estado.setText("Inserción realizada con éxito");
            
        } else if(e.getSource()==buscar){
            
            int busqueda = Integer.parseInt(txt_insercion.getText());
            
            txt_resultado.setText(conexion_bbdd.getPuntuacion(busqueda));
            
            
            //txt_resultado.setText(conexion_bbdd.getPuntuacion(insercion));
                    
        } else if(e.getSource()==limpiar){
            txt_id.setText("");
            txt_nivel1.setText("");
            txt_nivel2.setText("");
            txt_nivel3.setText("");
            txt_estado.setText("");
            txt_resultado.setText("");
            txt_insercion.setText("");
        }
    }
}
