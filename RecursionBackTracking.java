import java.util.*;

public class RecursionBackTracking {

    public static void helper(int i, int n, int arr[], ArrayList<Integer> temp) {

        if (i >= n) {
            System.out.println(temp);
            return;
        }

        // Take
        temp.add(arr[i]);
        helper(i + 1, n, arr, temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Not Take
        helper(i + 1, n, arr, temp);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        helper(0, arr.length, arr, new ArrayList<>());
    }
}