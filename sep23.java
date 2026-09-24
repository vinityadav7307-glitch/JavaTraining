// Create a class named Vehicle that represents a general vehicle.

// The Vehicle class should contain one integer data member:

// serviceCost
// It should contain a method:

// calculateServiceCost() - prints the basic service cost.

// Create another class named Car that inherits from Vehicle.

// The Car class should contain one additional integer data member:

// extraCost
// The Car class should override the calculateServiceCost() method.

// For a Car, the final service cost is calculated as:

// Final Service Cost = Basic Service Cost + Extra Cost

// Inside the overridden method of Car, use super.calculateServiceCost() to display the basic service cost before displaying the final service cost.

// In the main method, create an object of Car, assign the given input values, and call calculateServiceCost().

// Write the complete Java program, including the main method and input handling.

// Input Format

// The input contains two integers:

// serviceCost extraCost

// Constraints

// 1 <= serviceCost <= 100000 0 <= extraCost <= 50000

// Output Format

// Print the basic service cost and final service cost in the following format:

// Basic Service Cost: Final Service Cost:

// Sample Input 0

// 2000
// 1000
// Sample Output 0

// Basic Service Cost: 2000
// Final Service Cost: 3000
// Sample Input 1

// 0
// 1000
// Sample Output 1

// Invalid Input


import java.util.*;
public class sep23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serviceCost = sc.nextInt();
        int extraCost = sc.nextInt();

        if(serviceCost<1 || serviceCost>100000 || extraCost<0 || extraCost>50000){
            System.out.println("Invalid Input");
        }else{
        Car car = new Car(serviceCost,extraCost);
        car.calculateServiceCost();
        }
        sc.close();
    }
}
class Vehicle{
    int serviceCost;
    void calculateServiceCost(){
        System.out.println("Basic Service Cost: " + serviceCost);
    }
}
class Car extends Vehicle{
    int extraCost;

    Car(int serviceCost, int extraCost){
        this.serviceCost = serviceCost;
        this.extraCost = extraCost;
    }

    @Override
     void calculateServiceCost(){
        super.calculateServiceCost();
        int finalServiceCost = this.serviceCost + this.extraCost;
        System.out.println("Final Service Cost: " + finalServiceCost);
     }
}
