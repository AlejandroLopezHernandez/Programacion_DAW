package POO.Monitor_Servidor;

public class Main {
    public static void main(String[] args) {
        Monitor Monitor_de_Servidores = new Monitor(3);

        Servidor HTTP = new Servidor("HTTP", "Internet", 80, "169.172.5.7", "255.255.0.0", "encendido");
        Servidor VPN = new Servidor("VPN", "secreto", 43, "169.185.69.5", "255.0.0.0", "apagado");
        Servidor DHCP = new Servidor("DHCP", "Internet", 41, "192.158.9.4", "255.255.0.0", "endencido");

        Monitor_de_Servidores.agregar_servidor(0, DHCP);
        Monitor_de_Servidores.agregar_servidor(1, VPN);
        Monitor_de_Servidores.agregar_servidor(2, HTTP);

        Monitor_de_Servidores.arrancar_servidor();
        Monitor_de_Servidores.imprimir_estado_Servidor();
        VPN.apagar();
        //HTTP.apagar();
        Monitor_de_Servidores.imprimir_estado_Servidor();
        
        if(Monitor_de_Servidores.hay_servidores_encendidos(80)){
            System.out.println("Hay servidores encendidos en dicho puerto");
        } else {
            System.out.println("No hay servidores encendidos con dicho puerto");
        }
    }
}
