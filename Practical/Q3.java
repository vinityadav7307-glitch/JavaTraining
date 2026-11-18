package Practical;

import java.util.*;

public class Q3 {
     public static void main(String[] args) {
        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(2, 5, 8, 11, 14, 17));
        int even = 0, odd = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
