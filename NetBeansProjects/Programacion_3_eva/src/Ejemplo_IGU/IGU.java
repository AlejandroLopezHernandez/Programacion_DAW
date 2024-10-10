/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_IGU;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alejandrolopezhernandez
 */
//Introducir un número por pantalla y saber si el número es par o impar
public class IGU extends JFrame implements ActionListener{
    
    private JLabel numerolbl;
    private JTextField numerotxt;
    private JTextField resultadotxt;
    private JButton boton;
public IGU(){
        this.inicializarComponentesGraficos();
    }
    
    public void inicializarComponentesGraficos(){
        
        numerolbl = new JLabel("Número");
        numerotxt = new JTextField(15);
        resultadotxt = new JTextField(15);
        boton = new JButton("Calcular");
        
        JPanel panel = new JPanel();
        panel.add(numerolbl);
        panel.add(numerotxt);
        panel.add(resultadotxt);
        panel.add(boton);
        
        this.add(panel);
        boton.addActionListener(this);
        this.setVisible(true);
        Dimension dimension  = new Dimension();
        dimension.setSize(250, 250);
        this.setSize(dimension);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        int numero_introducido = Integer.parseInt(numerotxt.getText());
        if (numero_introducido %2 == 0){
            resultadotxt.setText("El número es par");
        } else {
            resultadotxt.setText("El número es impar");
        }
    }
    
    
}


