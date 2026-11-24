// . Merge Two Frequency Maps
// Given two maps containing item frequencies, merge them by adding the counts for matching keys.
package Practical;

import java.util.HashMap;

public class Q10 {
     public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        HashMap<String, Integer> b = new HashMap<>();
        a.put("apple", 2);
        a.put("banana", 3);
        b.put("apple", 4);
        b.put("orange", 5);
        for (String key : b.keySet()) {
            a.put(key, a.getOrDefault(key, 0) + b.get(key));
        }
        System.out.println(a);
    }
}
