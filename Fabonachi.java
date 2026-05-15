// //first Approach
// public class Fabonaci {
//     public static void main(String[] args) {

//         int n = 10;
//         int first = 0;
//         int second = 1;
//         System.out.println(first);
//         System.out.println(second);
//         for (int i = 2; i <= n; i++) {
//             int c = first + second;
//             first = second;
//             second = c;
//             System.out.println(c);
//         }
//     }

// }

//Second Approach

// int n= 10;
// int[] fib=new int[n];
// fib[0]=0;
// fib[1]=1;
// for(int i =2; i<n; i++){
// fib[i]=fib[i-1]+fib[i-2];
// }
// for(int i=0; i<n; i++){
// System.out.println(fib[i]);
// }
// }
// }


//User input
import java.util.*;
public class Fabonachi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int First=0;
        int second=1;
        System.out.println(First);
        System.out.println(second);

        for(int i=2; i<n; i++){
            int c=First+second;
             First= second;
             second = c;
             System.out.println(c);
            
        }

        sc.close();
    }
}