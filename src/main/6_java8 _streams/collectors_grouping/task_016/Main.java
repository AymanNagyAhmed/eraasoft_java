package collectors_grouping.task_016;

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
//   Group a list of students by their department
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors
                .groupingBy(Student::getDepartment));

        grouped.forEach((dept, list) -> {
            System.out.println("Department: " + dept);
            list.forEach(s -> System.out.println(" - " + s.getName() + " (" + s.getGrade() + ")"));
        });


    }

}
