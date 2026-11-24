// . Remove Duplicates from an Array
// Given an integer array, print its unique elements using a HashSet.
package Practical;

import java.util.HashSet;

public class Q12 {
     public static void main(String[] args) {
        int[] arr = {5, 2, 5, 1, 2, 8};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
