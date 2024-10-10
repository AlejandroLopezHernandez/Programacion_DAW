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
import javax.swing.JTextField;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Calculadora3 extends JFrame implements ActionListener{
    private JLabel label_Diagonal_mayor, label_diagonal_menor, label_lado;
    private JTextField txt_Diagonal_mayor, txt_diagonal_menor, txt_lado, txt_resultado;
    private JButton btn_area, btn_perimetro, btn_limpiar;
    
    public Calculadora3(){
        this.iniciar_ventana();
    }
    
    public void iniciar_ventana(){
        
        this.setTitle("Calcular el área de un rombo");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6,2));
        
        label_Diagonal_mayor = new JLabel("  Diagonal mayor:");
        txt_Diagonal_mayor = new JTextField();
        label_diagonal_menor = new JLabel(" Diagonal menor:");
        txt_diagonal_menor = new JTextField();
        label_lado = new JLabel(" Lado:");
        txt_lado = new JTextField();
        txt_resultado = new JTextField();
        txt_resultado.setEditable(false);
        btn_area = new JButton ("Calcular área");
        btn_perimetro = new JButton("Calcular perímetro");
        btn_limpiar = new JButton("Limpiar campos");
        
        add(label_Diagonal_mayor);
        add(txt_Diagonal_mayor);
        add(label_diagonal_menor);
        add(txt_diagonal_menor);
        //add(new JLabel());
        add(label_lado);
        add(txt_lado);
        add(new JLabel("Resultado:"));
        add(txt_resultado);
        add(btn_area);
        add(btn_perimetro);
        add(btn_limpiar);
        add(new JLabel());
        
       btn_area.addActionListener(this);
       btn_perimetro.addActionListener(this);
       btn_limpiar.addActionListener(this);
        
        this.setVisible(true);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_area){
            try{
            
            double diagonal_mayor = Double.parseDouble(txt_Diagonal_mayor.getText());
            double diagonal_menor = Double.parseDouble(txt_diagonal_menor.getText());
            String resultado_area = Double.toString(diagonal_mayor * diagonal_menor/2);
            
            txt_resultado.setText(resultado_area);
            
            } catch (Exception ex){
                txt_resultado.setText("Error, introduce un número correcto");
            }
            
        } else if (e.getSource() == btn_perimetro){
            try{
                Double lado = Double.parseDouble(txt_lado.getText());
                String resultado_perimetro = Double.toString(lado*4);
                txt_resultado.setText(resultado_perimetro);
                
            }catch (Exception ex){
                txt_resultado.setText("Error, introduce un número correcto");
            }
        } else if (e.getSource() == btn_limpiar){
            txt_resultado.setText("");
            txt_Diagonal_mayor.setText("");
            txt_diagonal_menor.setText("");
            txt_lado.setText("");
                  
        }
    }
    
            
            
    public static void main(String[] args) {
        
        Calculadora3 calculadora_rombo = new Calculadora3();
        //calculadora_rombo.iniciar_ventana();
    }
}
