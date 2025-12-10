

abstract class Shape {
    int a, b;

    
    Shape(int d1, int d2) {
        a = d1;
        b= d2;
    }

    
    abstract void printArea();
}


class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * a* b;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0); 
    }

    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(8, 6);
        Shape circ = new Circle(7);

        rect.printArea();
        tri.printArea();
        circ.printArea();
    }
}
