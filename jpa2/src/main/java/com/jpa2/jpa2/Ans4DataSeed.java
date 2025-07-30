package com.jpa2.jpa2;

import com.jpa2.jpa2.Entity.EmployeeAns4;
import com.jpa2.jpa2.Entity.SalaryDetailsAns4;
import com.jpa2.jpa2.repository.EmployeeAns4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Ans4DataSeed implements CommandLineRunner {
    @Autowired
    private EmployeeAns4Repository repo;

    @Override
    public void run(String... args) {
        SalaryDetailsAns4 sd = new SalaryDetailsAns4();
        sd.setBasicSalary(45.0);
        sd.setBonusSalary(5.0);
        sd.setTaxAmount(8.0);
        sd.setSpecialAllowanceSalary(20.0);

        EmployeeAns4 emp = new EmployeeAns4();
        emp.setId(1L);
        emp.setFirstName("Amit");
        emp.setLastName("TTN");
        emp.setAge(20);
        emp.setSalaryDetails(sd);

        repo.save(emp);

    }
}
