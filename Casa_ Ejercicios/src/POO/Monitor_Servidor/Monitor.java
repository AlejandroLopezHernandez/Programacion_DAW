package POO.Monitor_Servidor;

import java.util.ArrayList;
public class Monitor {
    
    ArrayList<Servidor> servidores = new ArrayList<>();
    
public Monitor (int cantidad_servidores){
    servidores = new ArrayList<>();
}

public void agregar_servidor (int indice, Servidor s){
    servidores.add(s);
/*if (indice >= 0 && indice < servidores.size()){
    servidores.add(s);
} else {
    System.out.println("Índice fuera de rango.");
}*/
}

public void arrancar_servidor (){
    for (Servidor s: servidores){
        if (s != null){
            s.encender();
        }
    }
}

public void apagar_servdiro (){
    for (Servidor s : servidores){
        if (s != null){
            s.apagar();
        } 
    }

}

public void imprimir_estado_Servidor(){
    for (Servidor s : servidores){
        if (s != null){
            System.out.println("La información de los servidores es la siguiente : " + s.getNombre() + " :"+
            s.getEstado());
        }
    }
}

public boolean hay_servidores_encendidos (int puerto){
    boolean servidor_encendido = false;

    for (Servidor s : servidores) {
        if(puerto == s.getPuerto() && s.obtener_estado().equals("encendido")){
            servidor_encendido = true;
        }
    }
    return servidor_encendido;
}
}
