
public class TestEmployee {
    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        System.out.println(emp1);

        // Using all-fields constructor
        Employee emp2 = new Employee("Akshay", "Saini", 25, "Developer");
        System.out.println("\n" + emp2);

        // Using partial constructor
        Employee emp3 = new Employee("Dhruv", "Verma");
        // Update using setters
        emp3.setAge(30);
        emp3.setDesignation("Manager");
        System.out.println("\n" + emp3);
    }
}
