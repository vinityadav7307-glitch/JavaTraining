import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(3));

        list.set(2, 10);
        System.out.println(list);

    }
}
