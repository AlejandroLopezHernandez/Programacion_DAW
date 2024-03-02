package POO.Abstracción_Geometría;

/**
 *
 * @author Alejandro Lopez
 */
public class Rombo extends Figura {

    private int diagonal_menor;
    private int diagonal_mayor;
    
    public Rombo(int diagonal_menor, int diagonal_mayor, int x, int y) {
        super(x, y);
        this.diagonal_menor = diagonal_menor;
        this.diagonal_mayor = diagonal_mayor;
    }

    @Override
    public double calcularArea() {
        return (this.diagonal_mayor*this.diagonal_menor)/2;
    }
    
    
}

