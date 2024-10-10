/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alejandrolopezhernandez
 */
public class Mago extends Personaje {

    public Mago(int nivel_vida,int nivel_experiencia,int nivel_destreza,int nivel_magia, int nivel_personaje) {
        this.nivel_vida = nivel_vida;
        this.nivel_experiencia = nivel_experiencia;
        this.nivel_destreza = nivel_destreza;
        this.nivel_magia= nivel_magia;
        this.nivel_personaje = nivel_personaje;
    }

    public int getNivel_magia() {
        return nivel_magia;
    }

    public void setNivel_magia(int nivel_magia) {
        this.nivel_magia = nivel_magia;
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

    public void setNivel_personaje(int nivel_personaje) {
        this.nivel_personaje = nivel_personaje;
    }
    private int nivel_magia;

    @Override
    public void subir_nivel() {
        nivel_personaje = nivel_experiencia * 0.2 + nivel_destreza * 0.3 + nivel_magia *0.5;
    }
    public String obtenerCadenaVector(){
        String resultado = "";
        resultado = "Vida:" + this.nivel_vida + " ||experiencia: " + this.nivel_experiencia + " ||destreza: " + this.nivel_destreza + 
                " ||magia: " + this.nivel_magia + " ||nivel de personaje: " + this.nivel_personaje;
        
        return resultado;
    }
    
}
