
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpoo2;

/**
 *
 * @author Alejandro Lopez
 */
public class Main {
    public static void main(String[] args) {
        //Creamos dos especies
        Especie conejos = new Especie("conejos", 200, 1.8);
        Especie zorros = new Especie("zorros", 10, 1.2);
        Especie aguilas = new Especie("aguilas", 10, 1.1);
        Especie linces = new Especie("linces", 20, 1.1);
        
        //Hacemos que los conejos tengan al zorro como depredador
        conejos.agregarDepredador(zorros);
        conejos.agregarDepredador(aguilas);
        conejos.agregarDepredador(linces);
        zorros.agregarDepredador(aguilas);
        
        //Cuando podemos punto le llamamos operador de acceso, cuando le añadimos el punto
        //Creamos ahora un nuevo ecosistema
        Ecosistema ecosistema_simulador = new Ecosistema();
        
        ecosistema_simulador.añadirEspecie(conejos);
        ecosistema_simulador.añadirEspecie(zorros);
        ecosistema_simulador.añadirEspecie(aguilas);
        ecosistema_simulador.añadirEspecie(linces);
        zorros.depredar(conejos);
        aguilas.depredar(zorros);
        aguilas.depredar(conejos);
        linces.depredar(conejos);
        
        //Simulamos ahora un ecosistema, añadimos el número de generaciones, por ejemplo 10
        
        ecosistema_simulador.simular(20);
        
    }
}

