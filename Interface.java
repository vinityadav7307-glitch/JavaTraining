interface Vehicle {
    void start();
    void stop();
}
 class Car implements Vehicle {
    public void start(){
        System.out.println("The car starts");
    }
    public void stop(){
        System.out.println("The car stops");
    }
}
public class Interface{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.stop();
        c1.start();
    }
}
