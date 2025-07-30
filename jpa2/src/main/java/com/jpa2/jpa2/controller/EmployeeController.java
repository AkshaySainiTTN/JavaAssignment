package com.jpa2.jpa2.controller;

import com.jpa2.jpa2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/above-avg")
    public List<Object[]> getEmployeesWithSalaryGreaterThanAvg() {
        return service.getEmployeesWithSalaryGreaterThanAvg();
    }

    @PutMapping("/update-low")
    public int updateSalaryOfLowEarners(@RequestParam Double salary) {
        return service.updateSalaryOfLowEarners(salary);
    }

    @DeleteMapping("/delete-min")
    public int deleteEmployeesWithMinSalary() {
        return service.deleteEmployeesWithMinSalary();
    }


    @GetMapping("/singh")
    public List<Object[]> getSinghEmployees() {
        return service.getSinghEmployees();
    }

    // Native Query Q2
    @DeleteMapping("/delete-by-age")
    public int deleteByMaxAge(@RequestParam Integer maxAge) {
        return service.deleteByMaxAge(maxAge);
    }
}
