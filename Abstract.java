//Create a abstract class Shape, with an abstract method area(), the classes circle and rectangle will inherit the abstract class, and their area.

 public class Abstract {
     public static void main(String[] args) {
            Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.area();
        r.area();
     }
 }


abstract class Shape {

    // Abstract method
    abstract void area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {

    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}
