package intermediate_stream_tasks.task_010;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Skip the first 3 elements and return the rest
        IO.println("skipFirstThree: " + skipFirstThree(numbers));


    }

    public static List<Integer> skipFirstThree(List<Integer> numbers) {
        return numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
    }

}
