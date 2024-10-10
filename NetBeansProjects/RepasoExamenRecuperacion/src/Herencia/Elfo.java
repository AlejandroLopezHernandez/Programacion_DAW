/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Elfo extends Personaje {

    public Elfo(int nivel_vida,int nivel_experiencia,int nivel_destreza,int nivel_ataque,int nivel_personaje) {
        this.nivel_vida = nivel_vida;
        this.nivel_experiencia = nivel_experiencia;
        this.nivel_destreza = nivel_destreza;
        this.nivel_ataque = nivel_ataque;
        this.nivel_personaje = nivel_personaje;
    }

    public int getNivel_ataque() {
        return nivel_ataque;
    }

    public void setNivel_ataque(int nivel_ataque) {
        this.nivel_ataque = nivel_ataque;
    }

    public int getNivel_vida() {
        return nivel_vida;
    }

    public void setNivel_vida(int nivel_vida) {
        this.nivel_vida = nivel_vida;
    }

    public int getNivel_experiencia() {
        return nivel_experiencia;
    }

    public void setNivel_experiencia(int nivel_experiencia) {
        this.nivel_experiencia = nivel_experiencia;
    }

    public int getNivel_destreza() {
        return nivel_destreza;
    }

    public void setNivel_destreza(int nivel_destreza) {
        this.nivel_destreza = nivel_destreza;
    }

    public double getNivel_personaje() {
        return nivel_personaje;
    }

    public void setNivel_personaje(double nivel_personaje) {
        this.nivel_personaje = nivel_personaje;
    }

 
    private int nivel_ataque;

    @Override
    public void subir_nivel() {
        nivel_personaje = nivel_experiencia * 0.2 + nivel_destreza * 0.3 + nivel_ataque * 0.5;
    }
    public String obtenerCadenaVector(){
        String resultado = "";
        resultado = "Vida:" + this.nivel_vida + " ||experiencia: " + this.nivel_experiencia + " ||destreza: " + this.nivel_destreza + 
                " ||fuerza: " + this.nivel_ataque + " ||nivel de personaje: " + this.nivel_personaje;
        
        return resultado;
    }
}
