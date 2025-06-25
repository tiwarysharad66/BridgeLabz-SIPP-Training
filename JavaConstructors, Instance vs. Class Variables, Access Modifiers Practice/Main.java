package constructors;
class Person {
    String name;
    int age;
    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    // Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sharad", 20);   // Original object
        Person p2 = new Person(p1);             // Clone using copy constructor

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Cloned Person:");
        p2.display();
    }
}

