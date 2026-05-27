import java.util.List;;
public class Stream1 {
    public static void main(String[] args) {

        //Source Data
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println("Keeping only even numbers");

        // conveyor belt start, intermediate and terminal operations chained
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}

