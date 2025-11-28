package basic_stream_operations.task_003;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        Convert all strings to uppercase using stream.
        System.out.println("Names Upper Case: " + customToUpperCase( names));
    }

    public static List<String> customToUpperCase(List<String> strings){
        return strings.stream()
                .filter(name -> name != null && !name.isEmpty())     // remove null & empty
                .map(String::toUpperCase)                     // convert to uppercase
                .collect(Collectors.toList());
    }
}
