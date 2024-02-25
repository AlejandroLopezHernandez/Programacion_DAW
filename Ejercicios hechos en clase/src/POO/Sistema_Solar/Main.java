/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema_Solar;
import java.util.*;
/**
 *
 * @author Alejandro Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Planeta Jupiter = new Planeta("Jupiter", 389040);
        Satelite Europa = new Satelite("Europa", 343434);
        Satelite Calisto = new Satelite("Calisto", 3499);
        Satelite Io = new Satelite("Io", 343434);
        Satelite Aminedes = new Satelite("Aminedes", 343804);
        
        Jupiter.addSatelites(Io);
        Jupiter.addSatelites(Europa);
        Jupiter.addSatelites(Calisto);
        Jupiter.addSatelites(Aminedes);
        
        Jupiter.Mostrar_Satelites();
    }
}

