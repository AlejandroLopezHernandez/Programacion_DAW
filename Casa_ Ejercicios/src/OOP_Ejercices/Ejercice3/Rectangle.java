package OOP_Ejercices.Ejercice3;

public class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(200, 50);
        int perimeter = 0;
        int area = 0;


        perimeter = (2 * rectangle1.getWidth()) + ( 2 * rectangle1.getHeight());
        area = (rectangle1.getWidth() * rectangle1.getHeight());

        System.out.println(" The perimeter of our rentable is " +  perimeter + 
        " and the area is " + area);
    }
}
