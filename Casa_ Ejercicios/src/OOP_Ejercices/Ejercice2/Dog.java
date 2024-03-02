package OOP_Ejercices.Ejercice2;
/* 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the constructor and modify 
 the attributes using the setter methods and print the updated values. */
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Holden", 4);

        System.out.println("The dog is called " + dog1.getName() +
        " and is " + dog1.getAge() + " years old");

        dog1.setName("Terry");
        dog1.setAge(5);

        System.out.println("The dog is called " + dog1.getName() +
        " and is " + dog1.getAge() + " years old");
    }
}
