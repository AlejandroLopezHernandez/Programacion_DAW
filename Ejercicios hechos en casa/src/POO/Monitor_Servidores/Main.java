package POO.Monitor_Servidores;

public class Main {
    public static void main(String[] args) {
        Monitor Monitor_de_Servidores = new Monitor();
        Servidor HHTP = new Servidor("http", "servicio de internet", 80, "192.169.1.7", "255.255.0.0", "activo");
        Servidor VPN = new Servidor("vpn", "servicio de vpn", 443, "192.160.5.8", "255.255.255.0", "desactivado");
        Servidor Zabbiz = new Servidor("zabbiz", "servicio zabbig", 25, "160.169.5.16", "255.0.0.0", "activo");

        Monitor_de_Servidores.agregar_Servidor(0, HHTP);
        Monitor_de_Servidores.agregar_Servidor(1, VPN);
        Monitor_de_Servidores.agregar_Servidor(2, Zabbiz);

        Monitor_de_Servidores.arrancar_Servidores();
        Monitor_de_Servidores.imprimir_Estado_Servidores();

        VPN.apagar();
        HHTP.apagar();

        Monitor_de_Servidores.imprimir_Estado_Servidores();
    }
}
