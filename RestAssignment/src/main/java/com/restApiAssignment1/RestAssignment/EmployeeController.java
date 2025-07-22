package com.restApiAssignment1.RestAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //ans1
    @GetMapping("/ans1")
    public String test() {
        return "Welcome to spring boot";
    }
    //ans2 is setup of employee and some service methds create kre hai isme
//ans3
    @GetMapping("/ans3")
    public List<Employee> getEmployees() {
        return employeeService.findAllEmployees();
    }
    //ans4
    //implement ans6in this also exception handle
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee e1 = employeeService.findEmployeeById(id);
        if(e1 == null){
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
        return employeeService.findEmployeeById(id);
    }
    //ans5
    //ans9 added valid to validate request body
    @PostMapping("/employeesPost")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    //ans7
    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
    //ans8

    @PutMapping("/Put/{id}")
    public Employee updateEmployee( @RequestBody Employee employee, @PathVariable int id) {
        return employeeService.updatedEmployee(employee,id);
    }
    //ans10 actuator added dependency
}

