package intermediate_stream_tasks.task_008;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Check if any number is divisible by 5 in a list
        IO.println("there are number is divisible by 5: " + anyDivisibleByFive(numbers));


    }
// given condition number > 5
    public static boolean anyDivisibleByFive(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(n -> n % 5 == 0);
    }
}
