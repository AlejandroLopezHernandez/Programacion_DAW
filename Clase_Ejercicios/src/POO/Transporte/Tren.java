package POO.Transporte;
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
        public double calcular_coste_tren (double distancia){
            double coste_base_tren = super.calcularCostoViaje(distancia);
            double coste_total_tren = coste_base_tren + (0.1 * vagones);
            return coste_total_tren;
        }
    }