//Time comlexity is max

// import java.util.Scanner;
// public class PrefixSum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int q = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < q; i++) {
//             int L = sc.nextInt();
//             int R = sc.nextInt();

//             L = L - 1;
//             R = R - 1;

//             int sum = 0;

//             for (int j = L; j <= R; j++) {
//                 sum += arr[j];
//             }

//             System.out.println(sum);
//         }
//         sc.close();
//     }
// }

//Time Complexity is min

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < q; i++) {
            int L = sc.nextInt() - 1;
            int R = sc.nextInt() - 1;

            int sum = prefix[R];

            if (L > 0)
                sum -= prefix[L - 1];

            System.out.println(sum);
        }
        sc.close();
    }
}