package POO.ColoniaDeGatos;

import java.util.ArrayList;
//Clase Colonia
public class Colonia {

    ArrayList<Gato> gatos = new ArrayList<>();
    private String lugar;
    private int n_gato;
    //Método constructor
    public Colonia(String lugar, int n_gato) {
        this.lugar = lugar;
        this.n_gato = n_gato;
        gatos = new ArrayList<>();
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getN_gato() {
        return this.n_gato;
    }

    public void setN_gato(int n_gato) {
        this.n_gato = n_gato;
    }

    public void setGatos(ArrayList<Gato> gatos) {
        this.gatos = gatos;
    }
    public void añadir_gato(Gato g){
        gatos.add(g);
    }
    public void quitar_gato(Gato g){
        gatos.remove(g);
    }
    public ArrayList<Gato> getGatos(){
        return this.gatos;
    }
}
