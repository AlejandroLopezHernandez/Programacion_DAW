package POO.Concesionario_coches;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario_coches = new Concesionario("Coches Alejandro", 3);

        Coche BMW = new Coche("BMW", "320d", 200, 100000);
        Coche SEAT = new Coche("SEAT", "Ibiza", 160, 40000);
        Coche Alfa = new Coche("Alfa Romeo", "Giulietta", 180, 70000);

        concesionario_coches.añadir_coche(Alfa);
        concesionario_coches.añadir_coche(BMW);
        concesionario_coches.añadir_coche(SEAT);

        //concesionario_coches.imprimir_info_coches();

        concesionario_coches.quitar_coche(Alfa);

        concesionario_coches.imprimir_info_coches();
    }
}
