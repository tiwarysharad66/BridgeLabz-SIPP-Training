package constructors;

public class Circle {
    double radius;
    Circle(){
this.radius = 1.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
void display(){
    System.out.println("the radius is " + radius);
}
    public static void main(String[] args) {
//        Circle c1 = new Circle(34);
//        c1.radius = 23;
        Circle c1 = new Circle();

        c1.display();
    }
}
