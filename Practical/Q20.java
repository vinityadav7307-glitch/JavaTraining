//  Reverse a LinkedList
// Reverse a LinkedList using the built-in Collections utility.
package Practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Q20 {
    public static void main(String[] args) {
        LinkedList<Integer> list =
            new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(list);
        System.out.println(list);
    }
}
