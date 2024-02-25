package POO.Cartera_valores;

public class Accion {

    private String nombre_accion;
    private double valor_compra;
    private double valor_actual;

    public Accion(String nombre_accion, double valor_compra, double valor_actual) {
        this.nombre_accion = nombre_accion;
        this.valor_compra = valor_compra;
        this.valor_actual = valor_actual;
    }

    public String getNombre_accion() {
        return this.nombre_accion;
    }

    public void setNombre_accion(String nombre_accion) {
        this.nombre_accion = nombre_accion;
    }

    public double getValor_compra() {
        return this.valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_actual() {
        return this.valor_actual;
    }

    public void setValor_actual(double valor_actual) {
        this.valor_actual = valor_actual;
    }
    
}
