package intermediate_stream_tasks.task_006;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//       Count the number of strings longer than 5 characters.
        IO.println("number of strings longer than 5 characters: " + countLongStrings(names));


    }

    public static long countLongStrings(List<String> names) {
        return names.stream()
                .filter(s -> s != null && s.length() > 5)
                .count();
    }
}
