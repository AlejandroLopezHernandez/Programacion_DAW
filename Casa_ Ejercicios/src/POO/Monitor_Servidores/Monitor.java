package POO.Monitor_Servidores;

import java.util.ArrayList;
public class Monitor {
    
ArrayList<Servidor> servidores = new ArrayList<>();

public Monitor (){
    servidores = new ArrayList<>();
}

public void agregar_Servidor(int indice, Servidor s){
    if (indice >= 0 && indice < servidores.size()){
        servidores.add(s);
    } else {
        System.out.println("Índice fuera de rango");
    }
}
public void arrancar_Servidores(){
    for (Servidor s : servidores){
        if (s != null){
            s.encender();
        }
    }
}
public void apagar_Servidores(){
    for (Servidor s : servidores){
        if (s != null){
            s.apagar();
        }
    }
}
public void imprimir_Estado_Servidores(){
    for (Servidor s : servidores){
    if (servidores != null){
        System.out.println("Servidor " + s.getnombre() + s.obtener_estado() );
    }
    }
}
}