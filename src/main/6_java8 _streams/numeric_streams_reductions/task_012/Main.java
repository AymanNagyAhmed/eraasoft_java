package numeric_streams_reductions.task_012;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Find the maximum and minimum value
        IO.println("max: " + findMax(numbers));
        IO.println("min: " + findMin(numbers));


    }

    public static Optional<Integer> findMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo);
    }

    public static Optional<Integer> findMin(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compareTo);
    }

}
