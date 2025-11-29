package collectors_grouping.task_019;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );

        //  Group employees by age and count how many per age.
        Map<Integer, Long> countByAge = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getAge,
                        Collectors.counting()
                ));

        countByAge.forEach((age, count) ->
                System.out.println("Age: " + age + " -> Count: " + count));



    }


}
