//find No. Vowels

import java.util.*;
public class String2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String str = sc.next();
        System.out.println(str.length());
        for (int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                System.out.println(ch);
           }   
        }
    }
}
