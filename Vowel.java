import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word=");
        String str1 = sc.next();

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='i' || ch =='o'|| ch =='u' ){
                System.out.println(ch);
            }
        }
    sc.close();
    }
   
}
