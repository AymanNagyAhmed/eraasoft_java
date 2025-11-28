package basic_stream_operations.task_001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Filter even numbers from a list of integers.
        IO.println("Even numbers: "+ evenNumbersFromListOfIntegers(numbers));


    }

    public static List<Integer> evenNumbersFromListOfIntegers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
