package numeric_streams_reductions.task_013;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Calculate the average of a list of doubles
        IO.println("the average of a list of doubles: " + calculateAverage(numbers));


    }

    public static OptionalDouble calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
    }

}
