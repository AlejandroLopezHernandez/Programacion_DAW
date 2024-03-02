package POO.Abstraccion_Transporte;

public class Tren extends Medio_Transporte { 
    private int vagones; 

    public int getVagones() {
        return this.vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
    //Constructor
     public Tren(String tipo, double consumoCombustible, double precioBase, int vagones) {
         super(tipo, consumoCombustible, precioBase);
          this.vagones = vagones; 
        } 
    }