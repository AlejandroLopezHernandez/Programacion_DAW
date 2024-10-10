/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

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
public class Calculadora2 extends JFrame implements ActionListener  {
    private JLabel lbl_base, lbl_altura;
    private JTextField txt_base, txt_altura, txt_resultado;
    private JButton btn_area, btn_perimetro, btn_limpiar;
    
    public Calculadora2(){
        this.mostrar_ventana();
    }
    
    public void mostrar_ventana(){
        
        this.setTitle("Calcular área y perímetro de un rectángulo");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,2));
        
       lbl_base = new JLabel("Base: ");
       txt_base = new JTextField();
       lbl_altura = new JLabel("Altura: ");
       txt_altura = new JTextField();
       btn_area = new JButton("Calcular área");
       btn_perimetro = new JButton("Calcular perimetro");
       btn_limpiar= new JButton("Limpiar");
       txt_resultado = new JTextField();
       
       add(lbl_base);
       add(txt_base);
       add(lbl_altura);
       add(txt_altura);
       //add(new JLabel());
       add(btn_area);
       add(btn_perimetro);
       add(btn_limpiar);
       add(txt_resultado);
       
       btn_area.addActionListener(this);
       btn_perimetro.addActionListener(this);
       btn_limpiar.addActionListener(this);
       this.setVisible(true);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn_area){
            try{
                double base = Double.parseDouble(txt_base.getText());
                double altura = Double.parseDouble(txt_altura.getText());
                String resultado = Double.toString(base*altura);
                
                txt_resultado.setText(resultado);
                
            } catch(NumberFormatException ex){
                txt_resultado.setText("Error al introducir los números, por favor introduce un número correcto" + ex);
            }
            
        } else if (e.getSource()== btn_perimetro){
        try{
            double lado_mayor = Double.parseDouble(txt_base.getText());
            double lado_menor = Double.parseDouble(txt_altura.getText());
            String perimetro = Double.toString((lado_mayor * 2) + (lado_menor * 2));
            
            txt_resultado.setText(perimetro);
            
        } catch(NumberFormatException ex){
            txt_resultado.setText("Error al introducir los números, por favor introduce un número correcto" + ex);
        }
    }
        else if (e.getSource() == btn_limpiar){
            txt_base.setText(" ");
            txt_altura.setText(" ");
            txt_resultado.setText(" ");
        }
    }
    
    
    public static void main(String[] args) {
        Calculadora2 rectangulo = new Calculadora2();
    }
    
}
