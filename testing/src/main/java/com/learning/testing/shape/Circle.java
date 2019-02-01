package com.learning.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {

    private String name = getClass().getSimpleName();
    private double r;

    public Circle(double r, String name){
        this.r = r;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double calculateCircuit() {
        return PI*r;
    }

}
