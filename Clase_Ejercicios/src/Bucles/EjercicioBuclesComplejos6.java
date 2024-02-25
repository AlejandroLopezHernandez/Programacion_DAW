package LoopsArray;
import java.util.Scanner;
public class EjercicioBuclesComplejos6 {
    public static void main (String[]args){
        String dominios [] = {"www.google.es", "www.apple.com", "www.amazon.com", "www.azure.microsoft.com", "www.twitch.tv"};
        String ip [] = {"192.145.145.23","193.145.345.53", "195.165.245.12","196.128.307.20","193.178.305.10"};
        String entrada_teclado = "";
        System.out.println("Introduce un nombre de dominio");
        Scanner reader = new Scanner(System.in);
        entrada_teclado = reader.nextLine();
        String direccion_ip = "";
        for (int i =0; i<dominios.length;i++){
            if (entrada_teclado.equals(dominios[i])){
               direccion_ip = ip[i];
            }
        }
        if(direccion_ip != ""){
             System.out.println("La dirección IP es " + direccion_ip);
        }else{
            System.out.println("La dirección IP no existe");
        }
    }
}
