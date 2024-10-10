/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TurismoBalears;

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
public class InterfazGraficaTurismo extends JFrame implements ActionListener {
    private JLabel lbl_comunidad1, lbl_procentaje1 ,lbl_comunidad2, lbl_porcentaje2;
    private JTextField txt_comunidad1,txt_porcentaje1 , txt_comunidad2 , txt_porcentaje2;
    private JButton btn_1 , btn_2;
    private ModuloInfoTurismo acceso_archivo;
    
    public InterfazGraficaTurismo(String archivo){
        acceso_archivo = new ModuloInfoTurismo(archivo);
        acceso_archivo.getInfoTurismo();
        this.iniciarComponenteGrafico();
    }
    
    public void iniciarComponenteGrafico(){
        
        this.setTitle("Acceso Archivo Turismo");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,2));
        
        lbl_comunidad1 = new JLabel("Mayor comunidad de origen: ");
        lbl_procentaje1 = new JLabel("Porcentaje de la mayor comunidad: ");
        lbl_comunidad2 = new JLabel("Segunda mayor comunidad de origen: ");
        lbl_porcentaje2 = new JLabel("Porcentaje de la segunda comunidad: ");
        
        txt_comunidad1 = new JTextField();
        txt_porcentaje1 = new JTextField();
        txt_comunidad2 = new JTextField();
        txt_porcentaje2 = new JTextField();
        
        btn_1 = new JButton("Calcular primero");
        btn_2 =  new JButton("Calcular segundo");
        
        add(lbl_comunidad1);
        add(txt_comunidad1);
        add(lbl_procentaje1);
        add(txt_porcentaje1);
        add(lbl_comunidad2);
        add(txt_comunidad2);
        add(lbl_porcentaje2);
        add(txt_porcentaje2);
        add(btn_1);
        add(btn_2);
        
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        
        this.setVisible(true);
        
    }
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_1){
            
            String comunidad1 = acceso_archivo.getComunidadMayorOrigen();
            String porcentaje1 = Double.toString(acceso_archivo.getPorcentajeMayor());
            
            txt_comunidad1.setText(comunidad1);
            txt_porcentaje1.setText(porcentaje1);
                   
            
        } else if(e.getSource()==btn_2){
            String comunidad2 = acceso_archivo.getSegundaComunidad();
            String porcentaje2 = Double.toString(acceso_archivo.getSegundoPorcentaje());
            
            txt_comunidad2.setText(comunidad2);
            txt_porcentaje2.setText(porcentaje2);
        }
    }
    
}
