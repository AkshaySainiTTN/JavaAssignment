 import java.util.*;
public class Employee {
    // Fields (attributes)
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    // 2️⃣ Constructor with all fields
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // 3️⃣ Constructor with only first name and last name
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.designation = "Not Assigned";
    }

    // ✅ Setter methods to update fields
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }



    // ✅ Override toString() to show employee details
   @Override
    public String toString() {
        return "Employee Details:\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }

}

class Main{

    public static void main(String[] args) {
        Employee e1= new Employee("Akash","ab",22,"jask");

        String str = e1.toString();
        System.out.println(str);


    }
}
