package advanced_operations.task_030;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );
        //  Partition students into pass/fail groups based on grade.
        Map<Boolean, List<Student>> passFailMap = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() >= 60));

        // Print results
        System.out.println("Passing students:");
        passFailMap.get(true).forEach(s -> System.out.println(s.getName()));

        System.out.println("\nFailing students:");
        passFailMap.get(false).forEach(s -> System.out.println(s.getName()));
    }

}
