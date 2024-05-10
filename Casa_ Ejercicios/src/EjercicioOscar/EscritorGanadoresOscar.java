package EjercicioOscar;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorGanadoresOscar {
    private String archivo;
    FileWriter escritor;

    EscritorGanadoresOscar(String archivo){ //Constructor
        this.archivo = archivo; //Igualamos el archivo
        try { //Para el escritor usamos un try/catch
            escritor = new FileWriter(archivo);
        } catch (IOException e) {
            System.out.println("Error al escribir archivo " + e);
        }
    }
    public void cerrarEscritor(){ //El método de escribir SIEMPRE hay que cerrarlo!
        try{
            escritor.close();
        } catch(IOException e){
            
        }
    }
    public void escribirGanador(String categoria, String ganador){
        try {
            escritor.write("# Mejor categoría para:" + categoria);
            escritor.write("#Mejor película para: " +  ganador);
    } catch (IOException e){
        System.out.println("Error al escribir el archivo " + e);
    }
}
public void escribirMejorActriz(String ganadora){
    try{
        escritor.write("#Mejor actriz para: " + ganadora);
    } catch (IOException e){
        System.out.println("Error al escribir el archivo " + e);
    }
}
public void escribirMejorActor (String ganador){
    try{
        escritor.write( "#Mejor actor para: "+ ganador);
    } catch(IOException e){
        System.out.println("Error al escribir archivo " + e);
    }
}
public void escribirMejorPelicula(String pelicula){
    try{
        escritor.write("#Mejor película para: " +pelicula);
    } catch(IOException e){
        System.out.println("Error al escribir archivo" + e);
    }
} 
}