package POO.Transporte;
/**
 *
 * @author Alejandro Lopez
 */
public class Medio_Transporte {
    private String tipo;
    private double consumoCombustible; // en litros por kilómetro
    private double precioBase;

    public String getTipo() {
        return this.tipo;
    }
    //Constructor
    public Medio_Transporte (String tipo, double consumoCombustible, double precioBase) {
    this.tipo = tipo;
    this.consumoCombustible = consumoCombustible;
    this.precioBase = precioBase;
    }
    
    public void mostrarDetalles() {
    System.out.println("Tipo: " + tipo);
    System.out.println("Consumo de Combustible: " + consumoCombustible + " litros/km");
    System.out.println("Precio Base: euros" + precioBase);
    }
    public double calcularCostoViaje(double distancia) {
    return consumoCombustible * distancia + precioBase;
    }
    //SETTER Y GETTER
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getConsumoCombustible() {
        return this.consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    }
    
