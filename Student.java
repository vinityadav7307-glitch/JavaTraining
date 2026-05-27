import java.util.*;

class Detail {
    int id;
    String name;
    int marks;

    Detail(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

class MarkComparator implements Comparator<Detail> {

    public int compare(Detail s1, Detail s2) {
        return s1.id - s2.id;
    }
}

public class Student {
    public static void main(String[] args) {

        List<Detail> stu = new ArrayList<>();

        stu.add(new Detail(1, "Vinit", 90));
        stu.add(new Detail(2, "Rahul", 70));
        stu.add(new Detail(3, "Aman", 85));

        Collections.sort(stu, new MarkComparator());

        System.out.println(stu);
    }
}