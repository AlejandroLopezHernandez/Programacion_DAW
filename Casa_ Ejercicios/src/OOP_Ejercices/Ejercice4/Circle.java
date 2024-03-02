package OOP_Ejercices.Ejercice4;
/* 4. Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle. */
public class Circle {
    private double radius;
    private double π;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getΠ() {
        return this.π;
    }

    public void setΠ(double π) {
        this.π = π;
    }

    public Circle(double radius, double π) {
        this.radius = radius;
        this.π = π;
    }
public static void main(String[] args) {
    Circle circle1 = new Circle(5, 3.1415);
    double perimeter = 0;
    double area = 0;

    perimeter = (2* circle1.getΠ() * circle1.getRadius());
    area = (circle1.getΠ() * (circle1.getRadius()* circle1.getRadius()));

    System.out.println("The area of our circle is " + area + 
    " the perimeter is " + perimeter);
}
}
