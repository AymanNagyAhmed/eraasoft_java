package advanced_operations.task_028;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        // Find duplicate elements in a list of integers.
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .distinct()
                .toList();

        System.out.println("Duplicate elements: " + duplicates);
    }

}
