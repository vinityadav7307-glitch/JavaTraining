//  Remove the First and Last Elements
// Given a LinkedList, remove its first and last elements and print the remaining list. Assume it has at least two elements
package Practical;

import java.util.Arrays;
import java.util.LinkedList;

public class Q18 {
        public static void main(String[] args) {
        LinkedList<Integer> list =
            new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
