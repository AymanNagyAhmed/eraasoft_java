package basic_stream_operations.task_002;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        Find names starting with a specific letter from a list of strings.
        System.out.println("Names starting with 'A': " + startingsWithSpecificLetterFromList('A', names));
    }

    public static List<String> startingsWithSpecificLetterFromList(char letter, List<String> strings){
        return strings.stream()
                .filter(name -> name != null && !name.isEmpty())            // remove null and empty
                .filter(name -> name.toLowerCase().startsWith(("" + letter).toLowerCase()))
                .collect(Collectors.toList());
    }
}
