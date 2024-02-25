package EjercicioRectángulo;

public class Rectangulo {
    private double width;
    private double height;
    public Rectangulo (){
        this.height=1.0;
        this.width=1.0;
    }

    public Rectangulo (double width,double height ){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPeremiter(){
        return 2*(this.height + this.width);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
