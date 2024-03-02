package POO.Abstraccion_Transporte;


public class Avion extends Medio_Transporte {
    private int altitudMaxima; 
    //Constructor 

    public int getAltitudMaxima() {
        return this.altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
    public Avion(String tipo, double consumoCombustible, double precioBase, int altitudMaxima) {
         super(tipo, consumoCombustible, precioBase); 
         this.altitudMaxima = altitudMaxima; 
        } 
    } 
