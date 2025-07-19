package com.example;

public class Student {
    private  Address address = new Address();
    public void ShowAddress() {
        System.out.println("My Address " + address.getAddress());
    }


}
