import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int val = arr[i], minIndex = i;
            for (int j = i+1; j < n; j++) {

                if (val > arr[j]) {
                    val = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr[i]);
        // int[] arr = {5, 1, 6, 2, 3, 4};
        // int n = arr.length;

        // for (int i = 0; i < n - 1; i++) {
        // int val=arr[i] ,minIndex = i;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[j] < val) {
        // val=arr[j];
        // minIndex = j;
        // }
        // }
        // if (minIndex != i) {
        // int temp = arr[i];
        // arr[i] = arr[minIndex];
        // arr[minIndex] = temp;
        // }
        // }
        // System.out.println(Arrays.toString(arr));

        sc.close();
    }
}