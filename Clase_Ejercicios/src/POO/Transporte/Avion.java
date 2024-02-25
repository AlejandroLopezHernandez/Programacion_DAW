package POO.Transporte;

/**
 *
 * @author Alejandro Lopez
 */
public class Avion extends Medio_Transporte {
    private int altitudMaxima;
//Constructor
public Avion(String tipo, double consumoCombustible, double precioBase, int altitudMaxima){
super(tipo, consumoCombustible, precioBase);
this.altitudMaxima = altitudMaxima;
}
public int getAltitudMaxima() {
    return altitudMaxima;
}
public double calcular_coste_avion (double distancia){
    double coste_base_avion = super.calcularCostoViaje(distancia);
    double coste_total_avion = coste_base_avion + (0.1 / altitudMaxima);
    return coste_total_avion;
}
}





