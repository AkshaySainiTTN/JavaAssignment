package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransPortService {
@Autowired
   private Vehicle vehicle;
   public void travel(){
       vehicle.run();
}
}

