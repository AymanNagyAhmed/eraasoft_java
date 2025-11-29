package advanced_operations.task_029;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        //  Remove null or empty strings from a list using stream.
        List<String> filtered = names.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

}
