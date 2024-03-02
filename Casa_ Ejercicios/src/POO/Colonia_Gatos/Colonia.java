package POO.Colonia_Gatos;

import java.util.ArrayList;

public class Colonia {
    private int n_gatos;
    ArrayList<Gato> gatos = new ArrayList<>();

    public Colonia (int n_gatos){
        this.n_gatos = n_gatos;

        gatos = new ArrayList<>();
    }
    public void añadir_gato (Gato g){
        gatos.add(g);
    }
    public void quitar_gato (Gato g){
        gatos.remove(g);

    }
    public void obtener_info_colonia (){
        for (Gato g : gatos){
            System.out.println(" La información de la colonia de gatos es la siguiente: el gato se llama " + 
            g.getNombre()+ " es de la raza " + g.getRaza() + " es de sexo " + g.getSexo() + " y tiene una edad de " + 
            g.getEdad()+ " años");
        }
    }
    public int obtener_gatos_macho(){
        int contador = 0;
        for (Gato g : gatos) {
            if(g.getSexo().equals("Masculino")){
                contador ++;
            }
        }
        return contador;
}
public int obtener_gatos_hembra(){
    int contador2 = 0;
    for (Gato g : gatos) {
        if(g.getSexo().equals("Femenino")){
            contador2 ++;
        }
    }
    return contador2;
}
public Gato obtener_gato(String gato_nombre){
    Gato gato_encontrado = null;
    for (Gato g : gatos) {
        if (g.getNombre().equals(gato_nombre)){
            gato_encontrado = g;
        }
    }
    return gato_encontrado;
}
}