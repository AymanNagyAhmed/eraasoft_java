package optional_map_flatMap.task_024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara");

//        Map a list of strings to their lengths
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);


    }

}
