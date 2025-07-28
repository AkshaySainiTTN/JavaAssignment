package com.exampleJpa.JpaDemo.Repository;

import com.exampleJpa.JpaDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List <Employee> findByName(String name);
    List<Employee> findByNameStartingWith(String pre);

    List<Employee> findByAgeBetween(int age, int age1);

}
