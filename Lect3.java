// Create a class named Employee that represents an employee.

// The Employee class should contain two data members:

// name
// salary
// It should contain a method displayEmployee() that prints the employee's name and salary.

// Create another class named Manager that inherits from Employee.

// The Manager class should contain one additional data member:

// bonus
// It should contain a method displayManager() that calculates and prints the manager's total salary.

// Total Salary = salary + bonus

// In the main method, create an object of Manager, assign the given input values, and call both displayEmployee() and displayManager().

// Write the complete Java program, including the main method and input handling.

// Input Format

// The input contains three values:

// name salary bonus

// Constraints

// 1 <= salary <= 1000000 0 <= bonus <= 500000

// Output Format

// Print the employee details and total salary in the following format:

// Name: Salary: Total Salary:

// Sample Input 0

// Ravi
// 50000
// 10000
// Sample Output 0

// Name: Ravi
// Salary: 50000
// Total Salary: 60000
// Sample Input 1

// Priya
// 50000
// -1
// Sample Output 1

// Invalid Input
import java.util.*;
class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;

    }
    void displayEmployee(){
        System.out.println(name);
        System.out.println(salary);
    }
}
class Manager extends Employee{
    int bonus;
    Manager(String name, int salary, int bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    void displayManager(){
       int totalSalary = salary + bonus;
        System.out.println(totalSalary);
    }
}
public class Lect3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int salary = sc.nextInt();
        int bonus = sc.nextInt();

        if(salary<1 || salary > 1000000 || bonus<0 || bonus>500000){
            System.out.println("Invalid Output");
        }
        Manager mg = new Manager(name, salary, bonus);
        mg.displayEmployee();
        mg.displayManager();

    }
}