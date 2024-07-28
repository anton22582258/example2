import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");
        List<String> modifiedNames = names.stream()

                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(modifiedNames);
    }
}