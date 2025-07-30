package com.jpa2.jpa2;

import com.jpa2.jpa2.Entity.Employee;
import com.jpa2.jpa2.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DataSeed implements CommandLineRunner {
    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) {
        repo.save(new Employee(null, "Abc", "Singh", 70000.0, 60));
        repo.save(new Employee(null, "cde", "wer", 60000.0, 50));
        repo.save(new Employee(null, "feg", "sff", 50000.0, 30));
        repo.save(new Employee(null, "sae", "efr", 40000.0, 20));
        repo.save(new Employee(null, "ted", "opo", 31000.0, 40));
    }
}
