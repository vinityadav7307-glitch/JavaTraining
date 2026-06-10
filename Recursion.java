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


//Factorial

public class Recursion{
    static int fun(int n){
        if(n==0){
            return 1;
        }
        return n * fun(n-1);
    }

    public static void main(String[] args){
        System.out.println(fun(25));
    }
}
