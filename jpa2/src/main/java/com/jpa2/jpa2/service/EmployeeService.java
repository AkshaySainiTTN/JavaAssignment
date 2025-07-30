package com.jpa2.jpa2.service;

import com.jpa2.jpa2.repository.EmployeeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Component
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Object[]> getEmployeesWithSalaryGreaterThanAvg() {
        return repo.getEmployeesWithSalaryGreaterThanAvg();
    }

    @Transactional
    public int updateSalaryOfLowEarners(Double newSalary) {
        return repo.updateSalaryOfLowEarners(newSalary);
    }

    @Transactional
    public int deleteEmployeesWithMinSalary() {
        return repo.deleteEmployeesWithMinSalary();
    }


    public List<Object[]> getSinghEmployees() {
        return repo.getEmployeesWithSufix("bcd");
    }
    @Transactional
    public int deleteByMaxAge(Integer maxAge) { return repo.deleteByAgeGreaterThan(maxAge); }


}
