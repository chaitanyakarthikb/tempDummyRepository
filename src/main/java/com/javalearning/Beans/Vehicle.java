package com.javalearning.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Vehicle {
//  I am adding this comment to check the changes in git and I ll push it nigger
    public Vehicle(){
        System.out.println("...VEHICLE BEAN CREATED...");
    }
    void startVehicle(){
        System.out.println("Vehicle is started");
    }
}
