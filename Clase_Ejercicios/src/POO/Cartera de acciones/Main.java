/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartera_valores;

/**
 *
 * @author Alejandro Lopez
 */
public class Main {
    public static void main(String[] args) {
        
        Cartera Cartera = new Cartera (500, 3);
        Accion accion1 = new Accion("Santander", 10, 50 );
        Accion accion2 = new Accion ("Repsol", 70, 800);
        Accion accion3 = new Accion ("Iberdrola", 80, 100);
        Cartera.comprar_accion(accion3);
        Cartera.comprar_accion(accion2);
        Cartera.comprar_accion(accion1);
        
        //Cartera.vender_accion("Iberdrola");
        //Cartera.vender_accion("Repsol");
        System.out.println("El valor de la cartera es de " + Cartera.balance_cartera() +" €");
        System.out.println("El estado de la cartera es "+Cartera.estado_cartera());
        
        
    }
}

