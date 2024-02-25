package POO.Transporte;
/**
 * @author Alejandro Lopez
 */
 public class Coche extends Medio_Transporte {
    private int capacidadPasajeros;
    // Constructor
    public Coche(String tipo, double consumoCombustible, double precioBase, int
    capacidadPasajeros) {
    super(tipo, consumoCombustible, precioBase);
    this.capacidadPasajeros = capacidadPasajeros;
    }
    public int getCapacidadPasajeros() {
            return capacidadPasajeros;
        }
        public double calcular_coste_coche (double distancia){
        double coste_base_coche = super.calcularCostoViaje(distancia);
        double coste_total_coche = coste_base_coche + (0.1 * capacidadPasajeros);
        return coste_total_coche;
        }
    }
    
    