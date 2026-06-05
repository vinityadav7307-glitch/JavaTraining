import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<String> rawData = List.of("apple", "banana", "kiwi", "grapes", "avacado");
        List<String> onlyAwords = rawData.stream()

                .filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Original list" + rawData);
        System.out.println("new list" + onlyAwords);
    }
}
