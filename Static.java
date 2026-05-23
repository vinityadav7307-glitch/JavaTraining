class Student{
    static int Rollno = 84;
    static void fun(){
        System.out.println(Rollno);
    }
}

class Static {
    public static void main(String[] args){

        System.out.println(Student.Rollno); 
        Student.fun();

    }
}

// class Static {

//     int rollNo;

//     Static(int rollNo) {
//         this.rollNo = rollNo;
//     }

//     void display() {
//         System.out.println(this.rollNo);
//     }

//     public static void main(String[] args) {

//         Static s1 = new Static(84);
//         s1.display();

//     }
// }

// class Static {
//     public static void main(String[] args) {

//         Integer a1 = 90;
//         Integer a2 = 90;

//         if (a1 == a2) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//         System.out.println(Integer.valueOf(10);
//         Integer y=a1;

//     }
// }