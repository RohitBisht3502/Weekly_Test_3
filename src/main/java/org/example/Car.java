package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Car {

    private String color;

    public Car() {
        System.out.println("car object is created!!!!!!!!!!!!!!");
    }

    public Car(String color) {
        System.out.println(color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
