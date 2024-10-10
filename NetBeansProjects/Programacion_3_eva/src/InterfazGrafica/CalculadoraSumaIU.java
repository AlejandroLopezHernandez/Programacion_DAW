/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

/**
 *
 * @author alejandrolopezhernandez
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * CalculadoraSuma
 *
 * @author 1DAW
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSumaIU extends JFrame implements ActionListener {

    private JTextField numero1Text, numero2Text, resutadoText;
    private JButton sumaButton;
    private JPanel panel;

    public CalculadoraSumaIU() {
        
        //NOTA: AQUI EL CONSTRUCTOR TIENE MUCHO QUE CONSTRUIR
        // Inicializar todos y cada uno de los componentes
        initComponents();

        // Hacer la interfaz visible
        setVisible(true);
    }

    public void initComponents() {
        // Inicialización de componentes gráficos
        setTitle("Calculadora de Suma");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // tamaño de la ventana
        setSize(300, 150);

        // Crear componentes de la interfaz gráfica de nuestra calculadora
        JLabel numero1Label = new JLabel("Número 1:");
        JLabel numero2Label = new JLabel("Número 2:");
        JLabel resultadoLabel = new JLabel("Resultado:");
        numero1Text = new JTextField(10);
        numero2Text = new JTextField(10);
        resutadoText = new JTextField(10);
        resutadoText.setEditable(false);
        sumaButton = new JButton("Sumar");
        sumaButton.addActionListener(this);

        // Crear panel principal
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(numero1Label);
        panel.add(numero1Text);
        panel.add(numero2Label);
        panel.add(numero2Text);
        panel.add(resultadoLabel);
        panel.add(resutadoText);
        panel.add(sumaButton);

        // Agregar panel al frame
        add(panel);

    }

    /*
        
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumaButton) {
            try {
                // Obtener los números introducidos por el usuario
                double num1 = Double.parseDouble(numero1Text.getText());
                double num2 = Double.parseDouble(numero2Text.getText());

                // Realizar la suma
                double resultado = num1 + num2;

                // Mostrar el resultado en el campo de texto resultado
                resutadoText.setText(Double.toString(resultado));
            } catch (NumberFormatException ex) {
                // Manejar errores si los usuarios ingresan datos inválidos
                JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraSumaIU();
        });
    }
}