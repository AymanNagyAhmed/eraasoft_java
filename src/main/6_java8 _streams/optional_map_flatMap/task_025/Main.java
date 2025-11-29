package optional_map_flatMap.task_025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        //  Return a list of uppercased words that start with “A”.
        List<String> result = names.stream()
                .filter(Objects::nonNull)          // remove nulls
                .filter(s -> !s.isEmpty())         // remove empty strings
                .filter(s -> s.startsWith("A"))    // keep words starting with "A"
                .map(String::toUpperCase)          // convert to uppercase
                .collect(Collectors.toList());

        System.out.println(result);


    }

}
