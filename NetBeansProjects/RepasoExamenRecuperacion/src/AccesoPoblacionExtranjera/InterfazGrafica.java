/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoPoblacionExtranjera;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alejandrolopezhernandez
 */
public class InterfazGrafica extends JFrame implements ActionListener {
    
    private JLabel lbl_numero_total, lbl_pais_mayor, lbl_cantidad_pais_mayor, lbl_pais_menor , lbl_cantidad_pais_menor;
    private JTextField txt_numero_total, txt_pais_mayor, txt_cantidad_pais_mayor , txt_pais_menor, txt_cantidad_pais_menor;
    private JButton calcular_total, calcular_mayor, calcular_menor;
    private ModuloInfoPoblacionEntranjera modulo_acceso_archivo;
    
    public InterfazGrafica(String archivo){
        
        modulo_acceso_archivo = new ModuloInfoPoblacionEntranjera(archivo);
        modulo_acceso_archivo.obtenerInfoExtranjeria();
        
        this.iniciarComponenteGrafico();
    }
    
    public void iniciarComponenteGrafico(){
        this.setTitle("Población Extranjera en Cataluña en 2021");
        this.setSize(600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(7,2));
        
       lbl_numero_total = new JLabel("Número total de inmigrantes: ");
       lbl_pais_mayor = new JLabel("País de origen de más inmigrantes");
       lbl_cantidad_pais_mayor = new JLabel("Cantidad de inmigrantes de dicho país");
       lbl_pais_menor = new JLabel("País de origen de menos inmigrantes");
       lbl_cantidad_pais_menor = new JLabel("Cantidad de inmigrantes de dicho país");
       
       txt_numero_total = new JTextField();
       txt_pais_mayor = new JTextField();
       txt_cantidad_pais_mayor  = new JTextField();
       txt_pais_menor = new JTextField();
       txt_cantidad_pais_menor = new JTextField();
       
       calcular_total = new JButton("Calcular total");
       calcular_mayor = new JButton("Calcular mayor");
       calcular_menor = new JButton("Calcular menor");
       
       add(lbl_numero_total);
       add(txt_numero_total);
       add(lbl_pais_mayor);
       add(txt_pais_mayor);
       add(lbl_cantidad_pais_mayor);
       add(txt_cantidad_pais_mayor);
       add(lbl_pais_menor);
       add(txt_pais_menor);
       add(lbl_cantidad_pais_menor);
       add(txt_cantidad_pais_menor);
       add(calcular_total);
       add(new JLabel());
       add(calcular_mayor);
       add(calcular_menor);
      
       calcular_total.addActionListener(this);
       calcular_mayor.addActionListener(this);
       calcular_menor.addActionListener(this);
       
       this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == calcular_total){
            String numero_total = Integer.toString(this.modulo_acceso_archivo.getTotalExtranjeros());
           
            txt_numero_total.setText(numero_total);
     
            
        } else if (e.getSource() == calcular_mayor){
            String pais_mayor = this.modulo_acceso_archivo.getMayorPaisOrigen();
            String cantidad_mayor = Integer.toString(this.modulo_acceso_archivo.getNumeroExtranjerosPais());
            
            txt_pais_mayor.setText(pais_mayor);
            txt_cantidad_pais_mayor.setText(cantidad_mayor);
            
        } else if(e.getSource() == calcular_menor){
            String pais_menor = this.modulo_acceso_archivo.getPaisMenosOrigen();
            String cantidad_menor = Integer.toString(this.modulo_acceso_archivo.getNumeroMenorExtranjeros());
            
            txt_pais_menor.setText(pais_menor);
            txt_cantidad_pais_menor.setText(cantidad_menor);
            
            
        }
    }
    
    
    
}
