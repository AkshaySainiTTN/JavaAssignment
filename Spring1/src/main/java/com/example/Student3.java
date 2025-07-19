package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student3 {
    @Autowired
    private Address3 address;

    public void showAddress() {
        System.out.println("My Address " + address.getCity());
    }
}
