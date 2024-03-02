package POO.Abstraccion_Transporte;

public class Coche extends Medio_Transporte { 
    private int capacidadPasajeros; 

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    // Constructor
    public Coche(String tipo, double consumoCombustible, double precioBase, int capacidadPasajeros) {
        super(tipo, consumoCombustible, precioBase); 
        this.capacidadPasajeros = capacidadPasajeros; 
    } 
   
    @Override
    public double calcularCostoViaje(double distancia) {  
        return consumoCombustible * distancia + precioBase;
    }
    } 
     /*public double calcularCostoViaje(double distancia) { 
        return consumoCombustible * distancia + precioBase;}*/ 