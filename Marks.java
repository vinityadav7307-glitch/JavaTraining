import java.util.*;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks");
        int mark = sc.nextInt();

        if (mark >= 30 && mark <= 60) {
            System.out.println("Grade C");
        } 
        else if (mark > 60 && mark <= 70) {
            System.out.println("Grade B");
        } 
        else if (mark > 70 && mark <= 90) {
            System.out.println("Grade A");
        } 
        else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}