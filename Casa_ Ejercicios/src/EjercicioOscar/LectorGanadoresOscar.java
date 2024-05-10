package EjercicioOscar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LectorGanadoresOscar {
    private String archivo;
    File file; //Representa al archivo
    Scanner lector; //Lo usamos para leer

    //Método constructor
    public LectorGanadoresOscar (String archivo){
        this.archivo = archivo;
        file = new File(archivo);

        try{
            lector = new Scanner(file);
        } catch( FileNotFoundException ex){
            System.out.println("Error, archivo no encontrado" + ex);
        }
    }
    public void mostrar_ganadores (){
        try{
            String linea;
            System.out.println("Los ganadores del Oscar 2024 son: ");
            while(lector.hasNext()){
                linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e){
            System.out.println("Error al leer el archivo " + e);
        }
    }
}
