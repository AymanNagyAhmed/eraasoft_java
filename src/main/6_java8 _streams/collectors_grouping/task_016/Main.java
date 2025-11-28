package collectors_grouping.task_016;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Calculate the sum of a list of integers using reduce
        IO.println("sum: " + sumList(numbers));


    }

    public static  int sumList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

}
