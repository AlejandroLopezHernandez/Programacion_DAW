package POO.Monitor_Servidores;

public class Servidor {

    private String nombre;
    private String servicio;
    private int puerto;
    private String direccionIP;
    private String mascara_subred;
    private String estado;

    //Método constructor
public Servidor (String nombre, String servicio, int puerto, String direccionIP, String mascara_subred, String estado){

    this.nombre= nombre;
    this.servicio= servicio;
    this.puerto = puerto;
    this.direccionIP= direccionIP;
    this.mascara_subred = mascara_subred;
    this.estado = estado="apagado";
}
//Setter y Getter
public void setnombre(String nombre){
this.nombre = nombre;
}
public String getnombre (){
    return this.nombre;
}
public void setservicio (String servicio){
    this.servicio = servicio;
}
public String getservicio (){
    return this.servicio;
}
public void setpuerto(int puerto){
    this.puerto = puerto;
}
public int getpuerto(){
    return this.puerto;
}
public void setdireccionIP (String direccionIP){
    this.direccionIP = direccionIP;
}
public String getdireccionIP(){
    return this.direccionIP;
}
public void setmascara_subred (String mascara_subred){
    this.mascara_subred = mascara_subred;
}
public String getmascara_subred(){
    return this.mascara_subred;
}
public void setestado (String estado){
    this.estado = estado;
}
public String getestado(){
    return this.estado;
}
public void encender (){
this.estado ="endendido";
}
public void apagar (){
this.estado = "apagado";
}
public void setError (){
this.estado = "Atención: ERROR";
}
public String obtener_estado(){
    return this.estado;
}
}