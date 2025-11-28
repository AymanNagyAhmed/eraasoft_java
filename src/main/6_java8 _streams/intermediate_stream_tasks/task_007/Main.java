package intermediate_stream_tasks.task_007;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Find the first element in a stream that matches a given condition.
        IO.println("Find the first element in a stream that matches a given conditions: " + findFirstGreaterThanFive(numbers, n -> n > 5));


    }
// given condition number > 5
    public static Optional<Integer> findFirstGreaterThanFive(List<Integer> numbers, Predicate<Integer> condition) {
        return numbers.stream()
                .filter(condition)
                .findFirst();
    }
}
