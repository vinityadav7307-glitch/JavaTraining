//  Insert Elements at the Beginning and End
// Create a LinkedList and insert one element at the beginning and another at the end. Display the result
package Practical;

import java.util.Arrays;
import java.util.LinkedList;

public class Q17 {
       public static void main(String[] args) {
        LinkedList<Integer> list =
            new LinkedList<>(Arrays.asList(20, 30, 40));
        list.addFirst(10);
        list.addLast(50);
        System.out.println(list);
    }
}
