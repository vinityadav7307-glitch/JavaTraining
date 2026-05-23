 class Car {
    int Wheels;
    String color;
    String Engine;
    void run(){
        System.out.println("Running");
    }
    void Break(){
        System.out.println("Apply break to stop vehicle");
    }
}
class Truck extends Car{
    Truck(){
        super();
    }
    void Wheels(){
        super.Break();
        System.out.println("Have 10 Wheels");
    }

    }
class Vehicle{
    public static void main(String[] args) {
        Truck T1 = new Truck();
        T1.run();
        T1.Break();
        T1.Wheels();
    }
}