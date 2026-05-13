import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
         long sum=1;
        for(long i = 1; i <=n; i++){
            sum=sum*i;
        }
        System.out.println("Factorial = " + sum);    

        sc.close();

    }
}
