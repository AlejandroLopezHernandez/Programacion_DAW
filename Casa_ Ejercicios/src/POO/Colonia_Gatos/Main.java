package POO.Colonia_Gatos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Colonia colonia_de_gatos = new Colonia(3);

        Gato gato1 = new Gato("Garfield", "Atigrado", "Masculino", 3);
        Gato gato2 = new Gato("Wanda", "Común", "Femenino", 2);
        Gato gato3 = new Gato("Michi", "Siamés", "Masculino", 2);

        colonia_de_gatos.añadir_gato(gato3);
        colonia_de_gatos.añadir_gato(gato2);
        colonia_de_gatos.añadir_gato(gato1);

        colonia_de_gatos.obtener_info_colonia();
        System.out.println("El número de gatos que son de sexo Masculino es " + 
        colonia_de_gatos.obtener_gatos_macho());
        System.out.println("El número de gatos que son hembra es de " +
        colonia_de_gatos.obtener_gatos_hembra());
       
       System.out.println(colonia_de_gatos.obtener_gato("Garfield"));
        
    }
    
}
