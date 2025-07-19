package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("I am Car");
    }
}
