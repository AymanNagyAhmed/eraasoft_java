package basic_stream_operations.task_004;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Filter even numbers from a list of integers.
        IO.println("Numbers Sorted Descending: "+ sortDescending(numbers));


    }

    public static List<Integer> sortDescending(List<Integer> numbers) {
        return numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
    }
}
