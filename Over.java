//1. Create a class called printer. Overload a method called PrintDocument. One version takes an integer(number of copies).The other takes a String(a secret message).

//2. Create a parent class Appliance with a turnOn() method. Create a child class Toaster that overrides the turnOn() to say "Heating up bread". test both in your main method.

public class Over {

    public static void main(String[] args) {

        Printer p1 = new Printer();
        System.out.println("Testing task 1:\t"+p1.PrintDocument(2, 5));
        System.out.println("Teating task 1:\t"+p1.PrintDocument("A secret message"));
        //p1.PrintDocument(5);

        Toaster t1 = new Toaster();
        t1.turnOn();
        System.out.println("Testing task 2:\t" );
    }

}

class Printer {

    int PrintDocument(int a, int b){
        return a+b;
    }

    String PrintDocument(String a){
        return a;
    }
}

//2 Question
class Appliance{
    void turnOn(){
        System.out.println("Appliances is turning on");
    }
}
class Toaster extends Appliance{
    @Override
    void turnOn(){ //Redefine turnOn method
        
    }
}