//  Find the Middle Element
// Given a LinkedList of integers, find its middle element. For an even-sized list, print the second middle element
package Practical;

import java.util.Arrays;
import java.util.LinkedList;

public class Q19 {
       public static void main(String[] args) {
        LinkedList<Integer> list =
            new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        int slow = 0;
        int fast = 0;
        while (fast < list.size() - 1) {
            slow++;
            fast += 2;
        }
        System.out.println(list.get(slow));
    }
}
