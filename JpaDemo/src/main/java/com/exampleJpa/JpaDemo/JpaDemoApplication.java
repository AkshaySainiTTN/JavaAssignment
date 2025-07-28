package com.exampleJpa.JpaDemo;

import com.exampleJpa.JpaDemo.Entity.Employee;
import com.exampleJpa.JpaDemo.Repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}


}
