package com.jpa2.jpa2.controller;
import com.jpa2.jpa2.Entity.EmployeeAns4;
import com.jpa2.jpa2.repository.EmployeeAns4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/emp4")
public class EmployeeAns4Controller {
    @Autowired
    private EmployeeAns4Repository repo;
    @GetMapping("/allEmploye")
    public List<EmployeeAns4> getAll() {
        return repo.findAll();
    }
}
