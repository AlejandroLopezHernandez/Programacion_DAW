package POO.Concesionario_coches;

import java.util.ArrayList;
public class Concesionario {
    
    private String nombre;
    private int n_coches;
    ArrayList<Coche> coches = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_coches() {
        return this.n_coches;
    }

    public void setN_coches(int n_coches) {
        this.n_coches = n_coches;
    }

    public Concesionario(String nombre, int n_coches) {
        this.nombre = nombre;
        this.n_coches = n_coches;
        coches = new ArrayList<>();
    }
    public void añadir_coche (Coche c){
        coches.add(c);
    }
    public void quitar_coche (Coche c){
        coches.remove(c);
    }
    public void imprimir_info_coches(){
        for(Coche c : coches){
            System.out.println("Los coches que hay en el concesionario son de la marca:  " +
             c.getMarca() + " del modelo "+ c.getModelo() + " con un kilometraje de  " +c.getKilometraje() 
             + " KM y con una velocidad máxima de  "+ c.getVelocidad_maxima() + " KM/h.");
        }
    }
}
