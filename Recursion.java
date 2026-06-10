// public class Recursion {
//     static int fun(int n){
//         if(n==0){
//             return 0;
//         }
//         fun(n-1);
//         System.out.println(n);
//         return 0;
//     }
//     public static void main(String[] args){
//         fun(10);

//     }
// }

//Sum 

// public class Recursion{
//     static int fun(int n){
//         if(n==0){
//             return 0;
//         }
//          return n+fun(n-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<=n;i++){
//                 if (i == n) {
//                 System.out.print(i);
//             } else {
//                 System.out.print(i + " + ");
//             }
//         }
//         System.out.println(" : Sum = " + fun(n));
//     }
// }


//Factorial

// public class Recursion{
//     static int fun(int n){
//         if(n==0){
//             return 1;
//         }
//         return n * fun(n-1);
//     }

//     public static void main(String[] args){
//         System.out.println(fun(25));
//     }
// }


//Fabonacci Series (0 1 1 2 3 5)

public class Recursion{
    static int fun(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
         return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(" "+fun(i));
        }
        System.out.println( "  Sum = "+fun(n));
    }
}