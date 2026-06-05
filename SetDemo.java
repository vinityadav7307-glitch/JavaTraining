import java.util.*;
public class SetDemo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("vinit");
        set.add("vishal");
        System.out.println(set.contains("vinit"));

        Map<Integer, String> map = new HashMap<>();

        map.put(null,"vinit");
        map.put(102,"vishal");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(null));
    }
}
