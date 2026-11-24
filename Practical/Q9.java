//  Count Character Frequencies
// Given a string, count how many times each character appears using a HashMap.
package Practical;

import java.util.HashMap;

public class Q9 {
     public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}
