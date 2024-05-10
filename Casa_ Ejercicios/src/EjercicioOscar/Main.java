package EjercicioOscar;

public class Main {
    public static void main(String[] args) {
        String archivo = "oscar.txt";
        EscritorGanadoresOscar escribir = new EscritorGanadoresOscar(archivo);
        
        escribir.escribirMejorActor("Cilian Murphy");
        escribir.cerrarEscritor();

        LectorGanadoresOscar lector = new LectorGanadoresOscar("oscar.txt");
        lector.mostrar_ganadores();
    }
}
