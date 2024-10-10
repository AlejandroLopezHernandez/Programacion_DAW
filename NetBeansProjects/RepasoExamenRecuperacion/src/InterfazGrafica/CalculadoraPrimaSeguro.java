/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alejandrolopezhernandez
 */
public class CalculadoraPrimaSeguro extends JFrame implements ActionListener {
    
    private JLabel lbl_edad, lbl_anyos, lbl_potencia, lbl_resultado, lbl_color;
    private JButton calcular, limpiar;
    private JTextField txt_edad, txt_anyos, txt_potencia, txt_resultado, txt_color;
    
    public CalculadoraPrimaSeguro(){
            this.inicializarComponentesGraficos();
            
    }
    public void inicializarComponentesGraficos(){
        
        this.setTitle("Calculadora de Prima de Seguro");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6,2));
        
        lbl_edad= new JLabel("Edad: ");
        lbl_anyos = new JLabel("Años de carnet: ");
        lbl_potencia = new JLabel("Potencia: ");
        lbl_resultado = new JLabel("Resultado: ");    
        txt_edad = new JTextField();
        txt_anyos  = new JTextField();
        txt_potencia = new JTextField();
        txt_resultado = new JTextField();
        lbl_color = new JLabel("Color: ");
        txt_color = new JTextField();
        calcular = new JButton("Calcular");
        limpiar = new JButton("Limpiar");
        
        add(lbl_edad);
        add(txt_edad);
        add(lbl_anyos);
        add(txt_anyos);
        add(lbl_potencia);
        add(txt_potencia);
        add(lbl_color);
        add(txt_color);
        add(calcular);
        add(limpiar);
        add(lbl_resultado);
        add(txt_resultado);
        
        calcular.addActionListener(this);
        limpiar.addActionListener(this);
        this.setVisible(true);
        
        
    }

   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calcular){
         double base = 0.0;
         double potencia = Double.parseDouble(txt_potencia.getText());
         int edad = Integer.parseInt(txt_edad.getText());
         int anyos = Integer.parseInt(txt_anyos.getText());
         String color = txt_color.getText();
         base = potencia * 0.2;
         if (edad > 25){
             base *= 1.5;
         } else if (anyos > 10){
             base *= 0.8;
         } else if (color.equalsIgnoreCase("rojo") && potencia > 150){
             base *= 1.15;
         } else if(edad < 18 || edad >= 70){
             JOptionPane.showInputDialog("Edad incorecta");
         } else if (anyos <= 0 || anyos >= 45){
             JOptionPane.showInputDialog("Años del carnet incorectos");
         } else if (potencia < 60 || potencia >=250){
             JOptionPane.showInputDialog("Potencia del vehículo incorecta");
         }
         
         txt_resultado.setText(Double.toString(base));
        } else if(e.getSource()==limpiar){
            txt_edad.setText("");
            txt_potencia.setText("");
            txt_anyos.setText("");
            txt_color.setText("");
            txt_resultado.setText("");
        }
    }
    
    public static void main(String[] args) {
        CalculadoraPrimaSeguro calculadora = new CalculadoraPrimaSeguro();
    }
}
