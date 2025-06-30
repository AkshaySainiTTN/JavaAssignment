package Java8_Part2;
import java.util.*;
import java.util.stream.Collectors;
class Employee {
    String fullName;
    Long salary;
    String city;
    Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}
public class Ans5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Raj Kumar Verma", 4000L, "Delhi"));
        employees.add(new Employee("Amit Sharma", 6000L, "Delhi"));
        employees.add(new Employee("Sita Devi", 3000L, "Delhi"));
        employees.add(new Employee("Raj Patel", 4500L, "Delhi"));
        employees.add(new Employee("Sita Devi", 3000L, "Delhi"));
        List<String> firstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("Delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println(firstNames);
    }
}
