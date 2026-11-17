//Given an ArrayList of integers, calculate and print the sum of its elements.
package Practical;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
     public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(4, 7, 2, 9, 3));
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
