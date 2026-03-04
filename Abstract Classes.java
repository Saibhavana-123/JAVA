//Find the area of the different shapes using abstract classes.

// Abstract class
abstract class Shape {
    abstract void area();
}

// Rectangle class
class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        System.out.println("Area of rectangle = " + (length * breadth));
    }
}

// Circle class
class Circle extends Shape {
    double radius = 7;

    void area() {
        System.out.println("Area of circle = " + (3.14 * radius * radius));
    }
}

// Triangle class
class Triangle extends Shape {
    int base = 8;
    int height = 6;

    void area() {
        System.out.println("Area of triangle = " + (0.5 * base * height));
    }
}

// Main class
public class AbstractAreaDemo {

    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.area();

        s = new Circle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
