package Collections;
import java.util.*;
/*
* Given the following class
Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.
Also, Write a program to sort Employee objects based on salary using Comparator.
* */

class Employee implements Comparable<Employee> {
    private double age;
    private double salary;
    private String firstName;
    private String surname;
    public Employee(String firstName, String surname, double age, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    public double getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public int compareTo(Employee other) {
        int firstCompare = this.firstName.compareTo(other.firstName);
        if (firstCompare != 0) {
            return firstCompare;
        }
        return this.surname.compareTo(other.surname);
    }

    @Override
    public String toString() {
        return firstName + " " + surname + " | Age: " + age + ", Salary: " + salary;
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
public class Ans2{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
       employees.add(new Employee("Akshay", "Saini", 22.0, 10000.0));
        employees.add(new Employee("Happy", "Verma", 22.0, 12000.0));
        employees.add(new Employee("Aman", "Singh", 22.0, 9000.0));
        employees.add(new Employee("Shivam", "Thakur", 22.0, 80000.0));
//        System.out.println("original data ");
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
        Collections.sort(employees);
        System.out.println("default sorting");
        for (Employee e : employees) {
            System.out.println(e);
        }
        employees.sort(new SalaryComparator());
        System.out.println("sorting based on salary comparator");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
