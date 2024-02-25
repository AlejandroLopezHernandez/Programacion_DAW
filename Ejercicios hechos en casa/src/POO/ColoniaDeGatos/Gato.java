package POO.ColoniaDeGatos;

public class Gato {

    private String Nombre;
    private String Raza;
    private String Sexo;
    private int edad;

    public Gato(String Nombre, String Raza, String Sexo, int edad) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Sexo = Sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return this.Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void maullar(){
        System.out.println("El gato hace miau");
    }
    public void comer (){
        System.out.println("El gato come");
    }
    
    public String toString(){
        return " Nombre: " + Nombre + " raza: " + Raza + " sexo: " + Sexo + " edad: " + edad;
    }
}
