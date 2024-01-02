package Semana2Octubre;
import java.util.Scanner;
        
 /*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alejandro Lopez
 */
public class EjercicioString6 {
    public static void main (String[]args){
        String password_almacenada = "1DAW";
        String password_usuario;
        Scanner reader= new Scanner(System.in);
        System.out.println("Introduzca la contraseña");
        password_usuario=reader.nextLine();
        if (password_almacenada.equals(password_usuario)){
            System.out.println("acceso concedido");
        }else {
            System.out.println("acceso denegado");
        }
        
    }
}
