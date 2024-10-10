/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAccesoFicheros;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Array_asociativo {
    public static void main(String[] args) {
        Map <String,Integer> alumnos = new HashMap <>();
        
        alumnos.put("Juan Barrau", 1);
        alumnos.put("Johana Chalcao", 2);
        alumnos.put("Santiago", 3);
        alumnos.put("Adrian Yusta", 4);
        alumnos.put("Pascual", 5);
        alumnos.put("Abdel", 6);
        alumnos.put("Manuel Cabrero", 7);
        
        System.out.println("El número de alumnos que han dejado el grado es: " + alumnos.size());
        
        System.out.println("Para buscar un alumnos en concreto: "+alumnos.get("Abdel"));
        
        for (Map.Entry<String, Integer>entry:alumnos.entrySet()){
            System.out.print(" Clave: " + entry.getKey());
            System.out.println(" ||Valor: " + entry.getValue());
        }
    }
}
