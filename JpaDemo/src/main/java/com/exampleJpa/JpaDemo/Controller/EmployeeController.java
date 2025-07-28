package com.exampleJpa.JpaDemo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.exampleJpa.JpaDemo.Entity.Employee;
import com.exampleJpa.JpaDemo.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Ans3")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
        Employee employee = employeeService.createEmployee(emp);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/updateAns4")
    public Employee updateEmployee(@RequestBody Employee emp) {
        return employeeService.update(emp);
    }

    @DeleteMapping("/Ans5")
    public void deleteById(Long id) {
        employeeService.delete(id);
    }

    @GetMapping("/Ans6/ReadOperation")
    public List<Employee> readEmployee() {
        return employeeService.readoperation();
    }

    @GetMapping("/Ans7/totalCount")
    public Long totalEmployee() {
        return employeeService.totalCount();
    }
    @GetMapping("/Ans8")
    public Page<Employee> getEmployeesByAge(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size) {
        return employeeService.getEmployeesByAge(page, size);
    }

    @GetMapping("/Ans9")
    public List<Employee> findbyname(@RequestParam String name) {
        return employeeService.findbynameOfEmployee(name);
    }
    
    @GetMapping("/Ans10")
    public List<Employee> findbyChar(@RequestParam String pre) {
        return employeeService.findAns10(pre);
    }

    @GetMapping("/Ans11")
    public List<Employee> findbyAgeBetween(@RequestParam Integer age1, @RequestParam Integer age2) {
        return employeeService.findByAgeBet(age1, age2);
    }


}