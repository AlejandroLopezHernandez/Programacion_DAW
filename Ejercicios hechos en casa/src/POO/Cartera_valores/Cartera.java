package POO.Cartera_valores;

import java.util.ArrayList;

public class Cartera {
    ArrayList<Accion> acciones = new ArrayList<>();
    double cantidad_total = 0;
    double numero_accion =0;

    public ArrayList<Accion> getAcciones() {
        return this.acciones;
    }

    public void setAcciones(ArrayList<Accion> acciones) {
        this.acciones = acciones;
    }

    public double getCantidad_total() {
        return this.cantidad_total;
    }

    public void setCantidad_total(double cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public double getNumero_accion() {
        return this.numero_accion;
    }

    public void setNumero_accion(double numero_accion) {
        this.numero_accion = numero_accion;
    }

    public Cartera(double cantidad_total, double numero_accion) {
        this.cantidad_total = cantidad_total;
        this.numero_accion = numero_accion;
        acciones = new ArrayList<>();
    }

    public void comprar_accion (Accion a){
        acciones.add(a);
    }
    public double balance_cartera (){
        double resultado = 0;
        for (Accion a : acciones){
            resultado += a.getValor_actual() - a.getValor_compra();
        }
        return resultado;
    }
    public String estado_cartera (){
        String estado = null;
        double resultado_estado = 0;
        for (Accion a : acciones){
            resultado_estado += a.getValor_actual() - a.getValor_compra();
            if (resultado_estado > 0){
                estado = "positivo";
            } else {
                estado = "negativo";
            }
        }
        return estado;
    }

public void vender_accion(String accion_vendida){
    for (Accion a : acciones){
        if (accion_vendida.equals(a.getNombre_accion())){
            acciones.remove(accion_vendida);
        }
    }
}
}
