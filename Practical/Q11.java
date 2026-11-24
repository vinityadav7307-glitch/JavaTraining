//  Count Distinct Elements
// Given an integer array, count the number of distinct elements using a HashSet.
package Practical;

import java.util.HashSet;

public class Q11 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set.size());
    }
}
