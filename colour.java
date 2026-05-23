//Create a parent class shape with a string variable color set to "Red". Then, create a circleclass that extends
//shape. In circle, creat its own color variable set to "Blue".
//Write a method in circle that prints Both colors using the super keyword.
//create another class Square , highlightning hierarchial inheritance.

class Shape {
    String color = "red";

}

class Circle extends Shape{
    String color="Blue";

    void display(){
        System.out.println("the clour of circle is "+color);
        System.out.println("The colour of circle is "+super.color);

    }
}
public class colour {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

    }
}