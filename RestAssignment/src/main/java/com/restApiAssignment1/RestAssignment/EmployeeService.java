package com.restApiAssignment1.RestAssignment;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int count = 0;

    static {
        employees.add(new Employee(++count, "Akshay", 22));
        employees.add(new Employee(++count, "Aman", 23));
        employees.add(new Employee(++count, "Akshay", 24));
    }

    public List<Employee> findAllEmployees() {
        return employees;
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee addEmployee(Employee employee) {
        employee.setId(++count);
        employees.add(employee);
        return employee;
    }

    public Employee deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                return employee;
            }
        }
        return null;
    }
    public Employee updatedEmployee(Employee employee, int id){
        for(Employee employee1 : employees){
            if(employee1.getId()==id){
                employee1.setName(employee.getName());
                return employee1;
            }
        }
        return null;
    }




}
