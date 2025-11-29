package advanced_operations.task_026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
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

        //  Sort a list of employees by salary then by name
        List<Employee> sorted = employees.stream()
                .sorted(Comparator
               .comparingDouble(Employee::getSalary)
               .thenComparing(Employee::getName))
               .toList();

        sorted.forEach(e ->
                System.out.println(e.getName() + " - " + e.getSalary()));


    }

}
