import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();

        if(W<=2){
            System.out.println("No");
        }else if(W%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
