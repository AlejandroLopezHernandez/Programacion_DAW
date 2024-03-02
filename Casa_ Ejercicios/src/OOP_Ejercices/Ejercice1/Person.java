package OOP_Ejercices.Ejercice1;
/* 1. Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, set their attributes using the constructor,
  and print their name and age. */
public class Person {
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
    
public Person (String name, int age){
  this.name = name;;
  this.age = age;
}
public static void main(String[] args) {
  Person person1 = new Person("Alex", 29);
  Person person2 = new Person("Marta", 25);

  System.out.println(" The person " + person1.getName() + " is " +  person1.getAge()+ " years old");
  System.out.println("The person " + person2.getName() + " is " + person2.getAge() + "years old");
}
}
