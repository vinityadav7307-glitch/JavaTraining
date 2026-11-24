//Create a HashMap and Display Entries
//Create a HashMap containing three student names and their marks. Display each key-value pair.
package Practical;

import java.util.HashMap;
import java.util.Map;

public class Q6 {
      public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 92);
        marks.put("Karan", 78);
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
