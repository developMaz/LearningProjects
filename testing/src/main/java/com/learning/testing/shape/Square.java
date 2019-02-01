package com.learning.testing.shape;

public class Square implements Shape {

    private String name = getClass().getSimpleName();
    private double a;

    public Square(double a, String name){
        this.a = a;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double calculateCircuit() {
        return Math.sqrt(a);
    }

}
