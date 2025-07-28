package com.exampleJpa.JpaDemo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.exampleJpa.JpaDemo.Entity.Employee;
import com.exampleJpa.JpaDemo.Repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepo;
    public Employee createEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }
    public void delete(Long id){
         employeeRepo.deleteById(id);
    }
    public List<Employee> readoperation(){
        return employeeRepo.findAll();
   }
    public long totalCount() {
        return employeeRepo.count();
    }
    public List <Employee> findbynameOfEmployee(String name){
        return employeeRepo.findByName(name);
    }
    public List<Employee> findAns10(String prefix) {
        return employeeRepo.findByNameStartingWith(prefix);
    }
    public List<Employee> findByAgeBet(Integer age1, Integer age2) {
        return employeeRepo.findByAgeBetween(age1 , age2);
    }


    public Page<Employee> getEmployeesByAge(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("age"));
//        Pageable pageable1 = PageRequest.of(page, size , Sort.by("age").descending());
        return employeeRepo.findAll(pageable);
    }
}

