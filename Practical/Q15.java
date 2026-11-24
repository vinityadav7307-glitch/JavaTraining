//  Check Whether Two Arrays Have the Same Elements
// Given two arrays, determine whether they contain the same distinct elements, ignoring order and duplicates
package Practical;

import java.util.HashSet;

public class Q15 {
      public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        int[] b = {3, 2, 1, 1};
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for (int num : a) setA.add(num);
        for (int num : b) setB.add(num);
        System.out.println(setA.equals(setB) ? "Same" : "Different");
      }
}
