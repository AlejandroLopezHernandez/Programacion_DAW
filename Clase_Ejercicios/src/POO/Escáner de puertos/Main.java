/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obtener_puertos;

/**
 *
 * @author Alejandro Lopez
 */
public class Main {
    public static void main(String[] args) {
       Escaneo_puerto escaner = new Escaneo_puerto (1, 64000, "localhost");
       escaner.escanear();
    }
}

