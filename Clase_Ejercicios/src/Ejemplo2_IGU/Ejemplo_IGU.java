package Ejemplo2_IGU;

import java.awt.*;
import java.swing.*;


//IGU: Interfaz gráfica de usuario
/**
 *
 * @author Alejandro Lopez
 */

//Introducir un número por pantalla y saber si el número es par o impar
public class Ejemplo_IGU extends JFrame implements ActionListener{

    private JLabel numerolbl;
    private JTextField numerotxt;
    private JTextField resultadotxt;
    private JButton boton;
    
    public Ejemplo_IGU(){
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
        dimension.setSize(300, 300);
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
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejemplo_IGU();
        });
}
}



