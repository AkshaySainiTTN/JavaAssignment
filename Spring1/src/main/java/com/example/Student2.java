package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student2 {

    private Address2 address;
    public void setAddress(Address2 address) {
        this.address = address;
    }

    public void showAddress() {
        System.out.println("My Address " + address.getCity());
    }
}
