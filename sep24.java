// Problem Statement: Create a Member class with attributes name, age, and salary. Create a
// method printDetails() that outputs these three values.
// Create subclasses Employee (adds a specialization attribute) and Manager (adds a 
// department attribute).
// In both subclasses, write a method named exactly printDetails() (this overrides the parent
// method).
// Inside the child's printDetails(), do not rewrite the print statements for name, age, and
// salary. Instead, call super.printDetails() to execute the parent's logic, and then add a
// new print statement for the child's specific attribute (specialization or department).

import java.util.Scanner;

public class sep24 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int age = sc.nextInt();
    int salary = sc.nextInt();
    sc.nextLine();
    String specialization =sc.nextLine();
    Employee emp = new Employee(name, age, salary, specialization);
    emp.printDetails();
}
}

class Member {
    String name;
    int age;
    int salary;

    Member(String name, int age, int salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, int salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);

    }
}
