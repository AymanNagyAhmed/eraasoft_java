package collectors_grouping.task_019;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Multiply all integers in a list using
        IO.println("multiply: " + multiplyAll(numbers));


    }

    public static int multiplyAll(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

}
