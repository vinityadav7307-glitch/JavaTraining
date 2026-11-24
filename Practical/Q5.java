package Practical;
import java.util.*;
public class Q5{
public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(12, 45, 7, 89, 23));
        int largest = list.get(0);
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest = " + largest);
    }
}