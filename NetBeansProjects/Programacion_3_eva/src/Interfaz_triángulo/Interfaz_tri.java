/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_triángulo;

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
public class Interfaz_tri extends JFrame implements ActionListener {

    private JTextField base_text, altura_text, resultado_text;
    private JLabel base_label, altura_label;
    private JButton calcular_boton;
    
    public Interfaz_tri (){
        this.iniciar_ventana();
    }
    
    public void iniciar_ventana (){
        this.setTitle("Calcula el área de un triángulo");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,2));
        
        base_label = new JLabel("Base");
        base_text = new JTextField();
        altura_label = new JLabel("Altura");
        altura_text = new JTextField();
        calcular_boton = new JButton("Calcular área");
        resultado_text = new JTextField();
        
        add(base_label);
        add(base_text);
        
        add(altura_label);
        add(altura_text);
        add(new JLabel());
        add(calcular_boton);
        add(new JLabel("Resultado"));
        add(resultado_text);
        
        calcular_boton.addActionListener(this);
        
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcular_boton){
            try{
                double base = Double.parseDouble(base_text.getText());
                double altura = Double.parseDouble(altura_text.getText());
                String resultado = Double.toString(base * altura / 2);
              
                resultado_text.setText(resultado);
                
            } catch (NumberFormatException ex){
                resultado_text.setText("Error al introducir los datos, por favor, introduce un número correcto");
            }
        }
    
}
}
