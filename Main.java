class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Student s1 = new Student();

        s1.name = "Vinit";
        s1.age = 18;
        s1.Rollno = 102;
        s1.college = "ITM";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.Rollno);
        System.out.println(s1.college);

    }
}

class Student {
    String name;
    int age;
    int Rollno;
    String college;

    Student(){
    System.out.println("New Student" + name);
    }
}