package optional_map_flatMap.task_022;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        //  Extract all unique characters from a list of words.
        Set<Character> uniqueChars = names.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());

        System.out.println(uniqueChars);



    }

}
