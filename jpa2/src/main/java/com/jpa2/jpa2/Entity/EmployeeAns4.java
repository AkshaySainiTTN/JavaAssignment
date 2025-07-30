package com.jpa2.jpa2.Entity;

import jakarta.persistence.*;

@Entity
public class EmployeeAns4 {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Embedded
    private SalaryDetailsAns4 salaryDetails;

    public SalaryDetailsAns4 getSalaryDetails() {
        return salaryDetails;
    }
    public void setSalaryDetails(SalaryDetailsAns4 salaryDetails) {
        this.salaryDetails = salaryDetails;
    }
}
