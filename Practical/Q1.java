//Write a Java program to create an ArrayList of integers, insert 5 numbers, and print all elements.
package Practical;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
