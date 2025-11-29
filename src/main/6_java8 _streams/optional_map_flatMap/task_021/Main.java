package optional_map_flatMap.task_021;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );

//       Flatten a list of lists into a single list.
        List<String> flattened = nestedWords.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattened);


    }

}
