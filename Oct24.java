// Problem Statement: Implement a multilevel inheritance hierarchy based on an organization
// structure.
// Level 1 (Base): Create a Person class with attributes name and age. Add a method 
// displayPersonDetails().
// Level 2 (Intermediate): Create an Employee class that extends Person. Add an attribute 
// empId and a method displayEmployeeDetails().
// Level 3 (Leaf): Create a Manager class that extends Employee. Add an attribute department
// and a method printAllDetails() that outputs the data from all three levels in a formatted
// block.
// In the main method, instantiate a Manager object, set all inherited and native properties, and
// call the printAllDetails() method

import java.util.*;

public class Oct24 {

}

class Person {
    int age;
    String name;

    void displayPersonDetails() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
}
class Employee extends Person{
    int empId;

    void displayEmployeeDetails(){
        System.out.println("Employee ID:"+empId);

    }

}
class Manager extends Employee{
    String department;

    void printAllDetails(){
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Department:"+department);

    }
}