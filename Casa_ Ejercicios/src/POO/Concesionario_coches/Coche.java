package POO.Concesionario_coches;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidad_maxima;
    private int kilometraje;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad_maxima() {
        return this.velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public int getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Coche(String marca, String modelo, int velocidad_maxima, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_maxima = velocidad_maxima;
        this.kilometraje = kilometraje;
    }
}
