import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");5
        int num = sc.nextInt();

        if(num==2){
            System.out.println("Num is Prime");
        }else{

        boolean isPrime = true;
        for(int i=2; i<=num-1; i++){
            if(num%i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("num is Prime");
        }else{
            System.out.println("Num is not Prime");
        }
    }
    sc.close();

    }
}
