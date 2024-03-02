package POO.Abstracción_Geometría;


/**
 *
 * @author Alejandro Lopez
 */
public abstract class Figura {

    protected int x;
    protected int y;
    
    //Hacemos el método constructor
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Hacemos esta clase como abstracta, puesto que no tenemos los datos todavía
    abstract public double calcularArea();
}


