package com.learning.testing.shape;

public class Triangle implements Shape {

    private String name = getClass().getSimpleName();
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String name){
        this.a = a;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double calculateCircuit() {
        return a+b+c;
    }

}
