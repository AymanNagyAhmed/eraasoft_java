package numeric_streams_reductions.task_015;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Count how many numbers are positive
        IO.println("Count of positive numbers: " + countPositive(numbers));


    }

    public static long countPositive(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .count();
    }

}
