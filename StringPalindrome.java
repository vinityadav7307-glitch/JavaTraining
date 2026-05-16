// import java.util.*;
// public class StringPalindrome {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         String rev = "";

//         for(int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         if(s.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();

        if(s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}