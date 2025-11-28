package intermediate_stream_tasks.task_009;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//  Collect elements into a Set instead of a List.
        IO.println("Set of elements: " + convertToSet(numbers));


    }

    public static Set<Integer> convertToSet(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.toSet());
    }

}
