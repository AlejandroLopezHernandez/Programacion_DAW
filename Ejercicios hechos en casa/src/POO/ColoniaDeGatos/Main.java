package POO.ColoniaDeGatos;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Colonia colonia_gatos = new Colonia("Fuenlabrada", 3);
        Gato gato1 = new Gato("Gardfild", "Persa", "Masculino", 2);
        Gato gato2 = new Gato("Wanda", "Siamés", "Femenino", 3);
        Gato gato3 = new Gato("Hazelnut", "Bosques de Noruega", "Femenino", 3);
        
        colonia_gatos.añadir_gato(gato1);
        colonia_gatos.añadir_gato(gato2);
        colonia_gatos.añadir_gato(gato3);
        
        ArrayList<Gato> gatos = colonia_gatos.getGatos();
        System.out.println("Los gatos que hay en la colonia son: ");
        for (Gato g : gatos){
            System.out.println(g);
        }
        
    }
}
