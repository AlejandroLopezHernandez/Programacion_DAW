package POO.Abstracción_Geometría;



/**
 *
 * @author Alejandro Lopez
 */
public class Cuadrado extends Figura{
      private int lado;
     
    public Cuadrado(int lado, int x, int y) {
        //Llamar al constructot que tengo arriba
        super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }
    
}

