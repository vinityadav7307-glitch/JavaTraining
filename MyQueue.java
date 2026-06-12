import java.util.*;

public class MyQueue<T> {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(10); //Addition
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);

        System.out.println(qu);

        qu.poll(); //Deletion
        System.out.println(qu);
    }
}
