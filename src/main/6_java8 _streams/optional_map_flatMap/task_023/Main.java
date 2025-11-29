package optional_map_flatMap.task_023;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("Ali"),
                Optional.empty(),
                Optional.of("Mona"),
                Optional.of("Ahmed"),
                Optional.of(""),
                Optional.empty()
        );

        List<String> filtered = optionalList.stream()
                .flatMap(Optional::stream)
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(filtered);



    }

}
