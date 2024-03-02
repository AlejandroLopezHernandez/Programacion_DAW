package POO.Abstraccion_Transporte;

public class Main {
    public static void main(String[] args) {
       // Crear instancias de las clases
        Coche coche = new Coche("Automóvil", 0.1, 30.0, 7); 
        Tren tren = new Tren("Tren de Alta Velocidad", 0.05, 50.0, 8);
         Avion avion = new Avion("Boeing 747", 0.2, 500.0, 12000); 
         // Mostrar detalles de cada medio de transporte 
         coche.mostrarDetalles();
        System.out.println("Capacidad de Pasajeros: " + coche.getCapacidadPasajeros() + "\n"); 
        tren.mostrarDetalles();
        System.out.println("Cantidad de Vagones: " + tren.getVagones() + "\n"); 
        avion.mostrarDetalles(); System.out.println("Altitud Máxima: " + avion.getAltitudMaxima() + " metros\n");
        // Calcular el costo de un viaje de 200 km para cada medio de transporte 
        double distanciaViaje = 200.0; 
                System.out.println("Costo del viaje en coche: " + coche.calcularCostoViaje(distanciaViaje) + " euros");
                System.out.println("Costo del viaje en tren: " + tren.calcularCostoViaje(distanciaViaje) + " euros"); 
                System.out.println("Costo del viaje en avión: " + avion.calcularCostoViaje(distanciaViaje) + " euros");
        }
}
