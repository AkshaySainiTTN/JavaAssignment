package Collections;


// Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
import java.util.HashMap;
import java.util.Map;

class Employees {
    private String name;
    private int age;
    private String designation;

    public Employees(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employees other = (Employees) obj;
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.designation.equals(other.designation);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + designation.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + designation + ")";
    }
}

public class Ans4Map {
    public static void main(String[] args) {
        Map<Employees, Double> employeeSalaryMap = new HashMap<>();
        Employees e1 = new Employees("Akshay", 22, "Developer");
        Employees e2 = new Employees("Aman", 25, "Tester");
        Employees e3 = new Employees("Happy", 23, "Hr");
        Employees e4 = new Employees("Shivam", 22, "UI Designer");

        employeeSalaryMap.put(e1, 10000.0);
        employeeSalaryMap.put(e2, 5000.0);
        employeeSalaryMap.put(e3, 7000.0);
        employeeSalaryMap.put(e4, 9000.0);

        for (Map.Entry<Employees, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println(entry.getKey() + " Salary " + entry.getValue());
        }
    }
}
