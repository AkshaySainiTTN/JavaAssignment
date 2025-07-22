package com.SpringBootAssignment.SpringBootAssignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Ans2 implements CommandLineRunner {

    @Value("${user.name}")
    private String name;
    @Value("${user.role}")
    private String role;
    @Value("${user.email}")
    private String email;
    @Override
    public void run(String... args) {
        System.out.println("Ans2 run");
        System.out.println(name);
        System.out.println(role);
        System.out.println(email);

    }
}
