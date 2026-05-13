import java.util.*;
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        if (n % 2 == 0){
        System.out.println("even");
    }
    else{
        System.out.println("Odd");
    }
    sc.close();
    }
}
