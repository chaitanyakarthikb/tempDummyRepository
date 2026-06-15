package com.javalearning.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Vehicle {

    public Vehicle(){
        System.out.println("...VEHICLE BEAN CREATED...");
    }
    void startVehicle(){
        System.out.println("Vehicle is started");
    }
}
