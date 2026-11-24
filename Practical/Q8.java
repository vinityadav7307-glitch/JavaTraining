//  Count Frequency of Array Elements
// Given an integer array, use a HashMap to count the frequency of every element.
package Practical;

import java.util.HashMap;

public class Q8 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }
}
