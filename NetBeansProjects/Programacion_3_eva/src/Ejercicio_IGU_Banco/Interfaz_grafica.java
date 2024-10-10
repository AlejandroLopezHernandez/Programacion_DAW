/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_IGU_Banco;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Interfaz_grafica extends JFrame implements ActionListener {
    //Vaariables de la interfaz gráfica
    private JLabel capital_label, interes_label , anyos_label, resultado_label;
    private JTextField capital_text , interes_text, anyos_text;
    private JButton calcular_boton;
    
    public Interfaz_grafica (){
        this.iniciar_componente_grafico();
    }

    public void iniciar_componente_grafico (){
        
    this.setTitle("Calculadora de depósito banncario");
    this.setSize(800, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(6,2));
    
    capital_label = new JLabel("Capital inicial");
    interes_label = new JLabel("Tasa de interés %");
    anyos_label = new JLabel ("Número de años");
    resultado_label = new JLabel();
    capital_text = new JTextField();
    interes_text = new JTextField();
    anyos_text = new JTextField();
    
    
    calcular_boton = new JButton ("Calcular retorno");
    
    add(capital_label);
    add(interes_label);
    add(anyos_label);
    add(capital_text);
    add(interes_text);
    add(anyos_text);
    add(resultado_label);
    add(calcular_boton);
    
    calcular_boton.addActionListener(this);
    this.setVisible(true);
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== calcular_boton){
            try{
                double capital = Double.parseDouble(capital_text.getText());
                double interes = Double.parseDouble(interes_text.getText());
                int anyos = Integer.parseInt(interes_text.getText());
                
                
                double resultado = (double) capital * Math.pow(1 + (interes/100), anyos);
                resultado_label.setText("El depósito tiene un retorno de " + resultado);
                
            } catch(NumberFormatException ex){
                resultado_label.setText("Error al introducir los números, por favor, introduce un número válido" + ex);
            }
        }
    }
    
}
