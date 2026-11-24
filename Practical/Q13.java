//  Find the Union of Two Arrays
// Given two arrays, print the union of their elements using a HashSet
package Practical;

import java.util.HashSet;
public class Q13 {
     public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        HashSet<Integer> union = new HashSet<>();
        for (int num : a) union.add(num);
        for (int num : b) union.add(num);
        System.out.println(union);
    }
}
