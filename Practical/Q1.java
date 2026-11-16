package Practical;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
