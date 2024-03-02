package POO.Monitor_Servidor;

public class Servidor {

    private String nombre;
    private String servicio;
    private int puerto;
    private String direccionIP;
    private String mascara_subred;
    private String estado;

    public Servidor (String nombre, String servicio, int puerto, String direccionIP, String mascara_subred, String estado){

        this.nombre = nombre;
        this.servicio= servicio;
        this.puerto=puerto;
        this.direccionIP = direccionIP;
        this.mascara_subred = mascara_subred;
        this.estado=estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicio() {
        return this.servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPuerto() {
        return this.puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getDireccionIP() {
        return this.direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getMascara_subred() {
        return this.mascara_subred;
    }

    public void setMascara_subred(String mascara_subred) {
        this.mascara_subred = mascara_subred;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void encender (){
        this.estado = "encendido";
    }
    public void apagar (){
        this.estado = "apagado";
    }
    public void setError (){
        this.estado = "Atención: error en el servidor";
    }
    public String obtener_estado (){
        return this.estado;
    }
}

