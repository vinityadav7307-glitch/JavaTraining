//  Create and Display a LinkedList
// Create a LinkedList of five integers and display all its elements.
package Practical;

import java.util.LinkedList;

public class Q16 {
       public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
