/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_a_BBDD;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Jugador {
    
    private int id_jugador;
    private int experiencia;
    private int destreza;
    private int inteligencia;

    public Jugador(int id_jugador, int experiencia, int destreza, int inteligencia) {
        this.id_jugador = id_jugador;
        this.experiencia = experiencia;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
}
